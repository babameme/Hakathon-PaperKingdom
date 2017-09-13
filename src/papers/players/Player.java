package papers.players;

import bases.GameObject;
import bases.actions.Action;
import bases.actions.SequenceAction;
import bases.actions.WaitAction;
import bases.inputs.MouseManager;
import bases.physics.Physics;
import bases.renderers.BodyRenderer;
import bases.scenes.SceneManager;
import bases.scenes.gameOver.GameOver;
import bases.settings.Settings;
import org.dyn4j.dynamics.Body;
import org.dyn4j.geometry.*;
import papers.obstacles.Obstacle;

public class Player extends GameObject {
    private static final double SPEED = 9;
    private float radius = 100;

    private static Player instance = null;
    public static boolean death;
    private boolean mouseEnabled;

    public static Player getInstance() {
        return instance;
    }

    public Player(Convex convex, double rotation, double angularVelocity) {
        super();
        body = new Body();
        convex.rotate(rotation);
        body.addFixture(convex);
        body.setMass(MassType.FIXED_LINEAR_VELOCITY);
        body.setLinearVelocity(SPEED, 0);
        body.setAngularVelocity(angularVelocity);
        this.color = Settings.instance.playerColor;
        this.renderer = new BodyRenderer();
        this.mouseEnabled = false;
        this.death = false;

        instance = this;

        configActions();
    }

    private void configActions() {
        this.addAction(new SequenceAction(
                new WaitAction(20),
                new Action() {
                    @Override
                    public boolean run(GameObject owner) {
                        Player player = (Player)owner;
                        player.mouseEnabled = true;
                        return true;
                    }
                }
        ));
    }

    @Override
    protected void normalUpdate(Vector2 parentPosition) {
        if (Physics.PlayerCollideWith(Obstacle.class)){
            System.out.println("Lazy ");
            death = true;
        }

        if (death){
            SceneManager.changeScene(new GameOver());
        }
        if(this.position.x >= Settings.instance.getGamePlayWidth()){
            SceneManager.changeScene(SceneManager.getNextScene());
        }
        super.normalUpdate(parentPosition);
        moveVerticalTowardsMouse();
    }

    private void moveVerticalTowardsMouse() {
        if (!mouseEnabled) return;

        double mouseY = (Settings.instance.getGamePlayHeight()/2 - MouseManager.instance.position.y) / Settings.scale;
        double y = Player.getInstance().getBody().getTransform().getTranslationY();
        double vy = mouseY - y;
        if (Math.abs(vy) < 1){
            vy = 0;
        }
        this.getBody().setLinearVelocity(SPEED, vy * SPEED / 5);
    }
}

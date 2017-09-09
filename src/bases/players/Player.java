package bases.players;

import bases.GameObject;
import bases.inputs.MouseManager;
import bases.obstacles.Obstacles;
import bases.physics.Physics;
import bases.renderers.BodyRenderer;
import bases.settings.Settings;
import org.dyn4j.dynamics.Body;
import org.dyn4j.geometry.*;

public class Player extends GameObject {
    private static final double SPEED = 10;
    private float radius = 100;

    private static Player instance = null;

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

        instance = this;
    }

    @Override
    protected void normalUpdate(Vector2 parentPosition) {
        super.normalUpdate(parentPosition);
        if (Physics.PlayerCollideWith(Obstacles.class)){
            System.out.println("Lazy ");
        }
        double mouseY = (Settings.instance.getGamePlayHeight()/2 - MouseManager.instance.position.y) / Settings.scale;
        double y = Player.getInstance().getBody().getTransform().getTranslationY();
        double vy = mouseY - y;
        if (Math.abs(vy) < 1){
            vy = 0;
        }
        this.getBody().setLinearVelocity(SPEED, vy * SPEED / 2);
    }
}

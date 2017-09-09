import bases.GameObject;
import bases.friends.Friend;
import bases.obstacles.Obstacles;
import bases.physics.Physics;
import bases.physics.PhysicsBody;
import bases.players.Player;
import bases.renderers.ImageRenderer;
import bases.settings.Settings;
import org.dyn4j.dynamics.Body;
import org.dyn4j.geometry.Circle;
import org.dyn4j.geometry.Rectangle;
import org.dyn4j.geometry.Vector2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;

public class GameWindow extends JFrame{
    public static final double NANO_TO_BASE = 1.0e9;
    protected final Canvas canvas;
     final double scale;
    protected final Dimension size;
    private long lastTimeUpdate, currentTime, diff;
    private double elapsedTime;
    private BufferStrategy strategy;
    private int w, h;
    //private Camera camera;
    private Vector2 position;

    public GameWindow(String name){
        super(name);
        this.scale = Settings.scale;
        size = new Dimension(Settings.instance.getGamePlayWidth(), Settings.instance.getGamePlayHeight());
        this.canvas = new Canvas();
        this.canvas.setPreferredSize(size);
        this.canvas.setMinimumSize(size);
        this.canvas.setMaximumSize(size);
        this.add(this.canvas);
        this.setResizable(false);

        this.pack();

        w = this.canvas.getWidth();
        h = this.canvas.getHeight();
        position = new Vector2(w/2, -h/2);
        //camera = new paper.simulations.Camera();
        //TODO: camera

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });
        setupLevel();
    }

    public void loop(){
        this.setVisible(true);
        this.canvas.setIgnoreRepaint(true);
        this.canvas.createBufferStrategy(2);
        lastTimeUpdate = System.nanoTime();
        while(true) {
            currentTime = System.nanoTime();
            diff = currentTime - lastTimeUpdate;
            if (diff > 17000000) {
                gameLoop();
                elapsedTime = diff / NANO_TO_BASE;
                lastTimeUpdate = currentTime;
            }
        }
    }

    private void gameLoop() {
        Graphics2D g2d = (Graphics2D) this.canvas.getBufferStrategy().getDrawGraphics();
        this.clear(g2d);
        this.run(g2d, elapsedTime);
        this.render(g2d, elapsedTime);
        g2d.dispose();
        strategy = this.canvas.getBufferStrategy();
        if (!strategy.contentsLost()){
            strategy.show();
        }
        Toolkit.getDefaultToolkit().sync();
    }

    private void render(Graphics2D g2d, double elapsedTime) {
        GameObject.renderAll(g2d);
    }

    private void run(Graphics2D g2d, double elapsedTime) {
        Physics.world.update(elapsedTime);
        GameObject.runAll();
        //GameObject.runAllActions();
    }

    private void clear(Graphics2D g2d) {
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0,0, w, h);
    }

    private void setupLevel() {
        GameObject gameObject = new GameObject();
        gameObject.setRenderer(ImageRenderer.create("assets/images/green_square.png"));
//        gameObject.getPosition().set(100,100);
////        System.out.println(position);
//        GameObject.add(gameObject);
//        Body body = new Body();
//        //System.out.println(gameObject.getPosition());
//        body.translate(gameObject.getPosition().toWorld());
//        //System.out.println(body.getTransform().getTranslation());
//        Physics.add((PhysicsBody) body);
//        gameObject.setBody(body);

        //Player player = new Player();
        //player.getPosition().set(10, 100);
        ///System.out.println(player.getPosition());
        //player.getBody().translate(player.getPosition().toWorld());
        //.out.println(player.getBody().getTransform().getTranslation());
        //GameObject.add(player);

        Player player = new Player(new Rectangle(1, 1), 2, 3.6);
        player.getPosition().set(10, 100);
        GameObject.add(player);

        Friend friend = new Friend(new Circle(2), 0, 0, new Vector2(0, 0));
        friend.getPosition().set(300, 140);
        GameObject.add(friend);

        Obstacles obstacle = new Obstacles(new Rectangle(3, 4), 5, 30, new Vector2(0, 0));
        obstacle.getPosition().set(150, 100);
        GameObject.add(obstacle);

    }


}

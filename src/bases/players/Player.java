package bases.players;

import bases.GameObject;
import org.dyn4j.dynamics.Body;
import org.dyn4j.geometry.Circle;

public class Player extends GameObject{
    private static final double SPEED = 10;
    private Body body;
    private float radius = 100;
    public Player() {
        super();
        body = this.getBody();
        body.addFixture(new Circle(2));
    }
}

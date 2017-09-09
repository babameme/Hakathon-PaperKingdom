package bases.obstacles;

import bases.GameObject;
import bases.renderers.BodyRenderer;
import bases.settings.Settings;
import org.dyn4j.dynamics.Body;
import org.dyn4j.geometry.Convex;
import org.dyn4j.geometry.MassType;
import org.dyn4j.geometry.Vector2;

public class Obstacles extends GameObject{
    public Obstacles(Convex convex, double rotation, double angularVelocity, Vector2 linearVelocity) {
        super();
        body = new Body();
        convex.rotate(rotation);
        body.addFixture(convex);
        body.setAngularVelocity(angularVelocity);
        body.setLinearVelocity(linearVelocity);
        body.setAngularDamping(0);
        body.setMass(MassType.NORMAL);
        this.color = Settings.instance.obstacleColor;
        this.renderer = new BodyRenderer();
    }
}

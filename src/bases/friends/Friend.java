package bases.friends;

import bases.GameObject;
import bases.renderers.BodyRenderer;
import bases.settings.Settings;
import org.dyn4j.dynamics.Body;
import org.dyn4j.geometry.Circle;
import org.dyn4j.geometry.Convex;
import org.dyn4j.geometry.MassType;
import org.dyn4j.geometry.Vector2;

public class Friend extends GameObject{
    public Friend(Convex convex, double rotation, double angularVelocity, Vector2 linearVelocity) {
        super();
        body = new Body();
        convex.rotate(rotation);
        body.addFixture(convex);
        body.setAngularVelocity(angularVelocity);
        body.setLinearVelocity(linearVelocity);
        body.setMass(MassType.NORMAL);
        this.color = Settings.instance.friendColor;
        this.renderer = new BodyRenderer();
    }
}

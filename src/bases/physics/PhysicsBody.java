package bases.physics;

import org.dyn4j.dynamics.Body;

public interface PhysicsBody {
    Body getBody();
    boolean isActive();
}

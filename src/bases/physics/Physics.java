package bases.physics;

import bases.GameObject;
import org.dyn4j.dynamics.Body;
import org.dyn4j.dynamics.World;

public class Physics {
    public static World world = new World();

    public static void add(PhysicsBody physicsBody){
        world.addBody((Body) physicsBody);
    }

    //public <T extends GameObject> boolean PlayerCollide

    public static void clearAll(){
        world.removeAllBodies();
    }
}

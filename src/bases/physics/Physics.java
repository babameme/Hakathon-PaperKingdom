package bases.physics;

import bases.GameObject;
import bases.players.Player;
import org.dyn4j.collision.broadphase.BroadphasePair;
import org.dyn4j.collision.narrowphase.Gjk;
import org.dyn4j.collision.narrowphase.NarrowphaseDetector;
import org.dyn4j.collision.narrowphase.Penetration;
import org.dyn4j.dynamics.Body;
import org.dyn4j.dynamics.BodyFixture;
import org.dyn4j.dynamics.World;
import org.dyn4j.geometry.Convex;
import org.dyn4j.geometry.Transform;

import java.util.List;


public class Physics {
    public static World world = new World();
    static NarrowphaseDetector np = new Gjk();

    static {
        world.setGravity(World.ZERO_GRAVITY);
    }

    public static void add(PhysicsBody physicsBody){
        world.addBody((Body) physicsBody);
    }

    public static <T extends GameObject> boolean PlayerCollideWith(Class<T> classz){
        List<BroadphasePair<Body, BodyFixture>> pairs = Physics.world.getBroadphaseDetector().detect();
        for (BroadphasePair<Body, BodyFixture> pair : pairs){
            Body body1 = pair.getCollidable1();
            Body body2 = pair.getCollidable2();
            BodyFixture fixture1 = pair.getFixture1();
            BodyFixture fixture2 = pair.getFixture2();
            Transform transform1 = body1.getTransform();
            Transform transform2 = body2.getTransform();
            Convex convex2 = fixture2.getShape();
            Convex convex1 = fixture1.getShape();
            Penetration p = new Penetration();
            if (np.detect(convex1,transform1,convex2,transform2,p)){
                if ((body1.classz == Player.class && body2.classz == classz) ||
                        (body1.classz == classz && body2.classz == Player.class)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void clearAll(){
        world.removeAllBodies();
    }
}

package bases;

import bases.actions.Action;
import bases.physics.Physics;
import bases.physics.PhysicsBody;
import bases.renderers.Renderer;
import org.dyn4j.dynamics.Body;
import org.dyn4j.geometry.Vector2;

import java.awt.*;
import java.util.ArrayList;
import java.util.Vector;

public class GameObject {
    protected Vector2 position;
    protected Vector2 screenPosition;
    protected Body body;
    protected Renderer renderer;

    protected ArrayList<GameObject> children;
    protected ArrayList<Action> actions;
    protected ArrayList<Action> newActions;
    protected boolean isActive ;
    protected Color color;

    private static Vector<GameObject> gameObjects = new Vector<>();
    private static Vector<GameObject> newGameObjects = new Vector<>();

    private boolean initialized;

    public GameObject() {
        children = new ArrayList<>();
        actions = new ArrayList<>();
        newActions = new ArrayList<>();
        position = new Vector2();
        screenPosition = new Vector2();
        isActive = true;
        initialized = false;
    }

    public void addChild(GameObject child){
        this.children.add(child);
    }

    public void start(Vector2 parentPosition) {
        if (!initialized) {
            if (body != null) {
                Physics.world.addBody(body);
                body.translate(position.sum(parentPosition).toWorld());
                body.classz = this.getClass();
            }
            initialized = true;
            //TODO: Recycle
        }

        for (GameObject child: children) {
            if (child.isActive)
                child.start(position.sum(parentPosition));
        }
    }

    public final void run(Vector2 parentPosition){
        start(parentPosition);
        updateFromBody();
        normalUpdate(parentPosition);
    }

    protected void updateFromBody() {
        if (body != null)
            this.position = this.body.getTransform().getTranslation().toNormal();
        for (GameObject child : children)  {
            child.updateFromBody();
        }
        //System.out.priasdntln(this.body.getTransform().getTranslation().x);
    }

    protected void normalUpdate(Vector2 parentPosition) {
        screenPosition = parentPosition.sum(position);
        //System.out.println(String.format("%s: parentPostion=%s, position=%s screenPosition=%s", getClass(), parentPosition, screenPosition));

        for (GameObject child : children){
            //System.out.println(String.format("%s has %s", getClass(), child.getClass()));
            if (child.isActive){
                child.normalUpdate(screenPosition);
            }
        }
    }

    public static void runAll() {
        startAll();
        updateFromBodyAAll();
        normalUpdateAll();

        for (GameObject newGameObject : newGameObjects){
            if (newGameObject instanceof PhysicsBody){
                Physics.add((PhysicsBody)newGameObject);
            }
        }

        gameObjects.addAll(newGameObjects);
        newGameObjects.clear();
    }

    private static void normalUpdateAll() {
        for (GameObject gameObject: gameObjects) {
            if (gameObject.isActive)
                gameObject.normalUpdate(new Vector2(0, 0));
        }
    }

    private static void updateFromBodyAAll() {
        for (GameObject gameObject: gameObjects) {
            if (gameObject.isActive)
                gameObject.updateFromBody();
        }
    }

    private static void startAll() {
        for (GameObject gameObject: gameObjects) {
            if (gameObject.isActive)
                gameObject.start(new Vector2(0, 0));
        }
    }

    public void render(Graphics2D g2d){
        if (renderer != null){
            renderer.render(g2d, screenPosition, this.body, this.color);
        }

        for (GameObject child : children){
            if (child.isActive)
                child.render(g2d);
        }
    }

    public static void renderAll(Graphics2D g2d){
        for (GameObject gameObject : gameObjects){
            if (gameObject.isActive){
                gameObject.render(g2d);
            }
        }
    }

    public static void clearAll() {
        gameObjects.clear();
        newGameObjects.clear();
        Physics.clearAll();
    }

    public void reset(){
        this.isActive = true;
        this.actions.clear();
        this.newActions.clear();
    }

    public void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public static void add(GameObject gameObject) {
        newGameObjects.add(gameObject);
    }

    public Vector2 getPosition() {
        return position;
    }

    public Body getBody() {
        return body;
    }
}

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

    private static Vector<GameObject> gameObjects = new Vector<>();
    private static Vector<GameObject> newGameObjects = new Vector<>();

    public GameObject() {
        children = new ArrayList<>();
        actions = new ArrayList<>();
        newActions = new ArrayList<>();
        position = new Vector2();
        screenPosition = new Vector2();
        isActive = true;
    }

    public void run(Vector2 parentPosition){
        screenPosition = parentPosition.add(position);
        for (GameObject child : children){
            if (child.isActive){
                child.run(screenPosition);
            }
        }
    }

    public static void runAll(){
        for(GameObject gameObject : gameObjects){
            if(gameObject.isActive){
                //gameObject.body.translate(0, 0.01);
                gameObject.position = gameObject.body.getTransform().getTranslation().toNormal();
                //System.out.println(gameObject.position);
                gameObject.run(new Vector2(0,0));
            }
        }

        for (GameObject newGameObject : newGameObjects){
            if (newGameObject instanceof PhysicsBody){
                Physics.add((PhysicsBody)newGameObject);
            }
        }
        gameObjects.addAll(newGameObjects);
        newGameObjects.clear();
    }

    public void render(Graphics2D g2d){
        if (renderer != null){
            renderer.render(g2d, screenPosition, this.body);
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

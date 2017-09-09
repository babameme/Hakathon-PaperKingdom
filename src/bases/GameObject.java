package bases;

import bases.actions.Action;
import org.dyn4j.geometry.Vector2;

import java.util.ArrayList;
import java.util.Vector;

public class GameObject {
    protected Vector2 position;
    protected Vector2 screenPosition;
    //protected Ren
    //TODO: renderer

    protected ArrayList<GameObject> children;
    protected ArrayList<Action> actions;
    protected ArrayList<Action> newActions;
    protected boolean isActive;

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
                gameObject.run(new Vector2(0,0));
            }
        }

        for (GameObject newGameObject : newGameObjects){
            if (newGameObject instanceof PhysicsBody){
                Physics.add((PhysicBody)newGameObject);
            }
        }

    }
}

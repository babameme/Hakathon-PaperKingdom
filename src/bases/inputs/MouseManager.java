package bases.inputs;

import org.dyn4j.geometry.Vector2;

public class MouseManager {
    public Vector2 position;
    public static final MouseManager instance = new MouseManager();

    private MouseManager() {

    }
}

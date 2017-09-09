package bases.actions;

import bases.GameObject;

/**
 * Created by huynq on 8/26/17.
 */
public abstract class Action {
    public abstract boolean run(GameObject owner);
    public void reset() {

    }
}

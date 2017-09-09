package bases.actions;

import bases.GameObject;

public interface Action {
    //can truyen 1 thang gameobject vao de biet thg nao run action nay
    public boolean run(GameObject gameObject);
}

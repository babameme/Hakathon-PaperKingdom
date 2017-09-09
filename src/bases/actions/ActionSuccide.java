package bases.actions;

import bases.GameObject;
import touhou.enemies.Enemy;

public class ActionSuccide implements Action{

    @Override
    public boolean run(GameObject gameObject) {
        if(gameObject.getClass() == Enemy.class) {
            ((Enemy)gameObject).getHit(1000);
        }
        return true;
    }
}

package bases.actions;

import bases.FrameCounter;
import bases.GameObject;

//lam test 1 con action co ban, action cho`
public class ActionWait extends Action {
    private FrameCounter frameCounter;

    public ActionWait(int count) {
        frameCounter = new FrameCounter(count);
    }

    @Override
    public boolean run(GameObject gameObject) {
        //đoạn này dễ đúng ko, địa khái là chờ cho cái framecounter run xong
        return frameCounter.run();
    }

    @Override
    public void reset() {

    }

    public FrameCounter getFrameCounter() {
        return frameCounter;
    }
}

package bases.actions;

import bases.FrameCounter;
import bases.GameObject;
import bases.renderers.Animation;

//lam test 1 con action co ban, action cho`
public class ActionWait implements Action {
    private FrameCounter frameCounter;

    public ActionWait(int count) {
        frameCounter = new FrameCounter(count);
    }

    @Override
    public boolean run(GameObject gameObject) {
        //đoạn này dễ đúng ko, địa khái là chờ cho cái framecounter run xong
        return frameCounter.run();
    }

    public FrameCounter getFrameCounter() {
        return frameCounter;
    }
}

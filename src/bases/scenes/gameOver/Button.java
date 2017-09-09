package bases.scenes.gameOver;

import bases.FrameCounter;
import bases.GameObject;
import bases.inputs.InputManager;
import bases.scenes.SceneManager;
import bases.scenes.gameOver.button.Exit;
import bases.scenes.gameOver.button.Replay;
import bases.scenes.intros.IntroScene;
import bases.scenes.levelScenes.Lv1Scene;
import org.dyn4j.geometry.Vector2;

public class Button extends GameObject {
    private FrameCounter frameCounter;
    private InputManager inputManager = InputManager.instance;
    Exit exit = new Exit();
    Replay replay = new Replay();
    private boolean stateStart;
    private boolean stateExit;
    private int currentButton = 1 ;

    public Button(){
        frameCounter = new FrameCounter(3);
    }

    @Override
    public void normalUpdate(Vector2 parentPosition) {
        super.normalUpdate(parentPosition);
        if(frameCounter.run()) {
            frameCounter.reset();
            if (inputManager.upPressed) {
                currentButton = 1;
            }
            if(inputManager.downPressed){
                currentButton = 2;
            }
            if(inputManager.enterPressed && currentButton == 1){
                SceneManager.changeScene(new Lv1Scene());
            }
            if(inputManager.enterPressed && currentButton == 2){
                System.exit(0);
            }
        }
            if(currentButton == 1){
                stateStart = true;
                stateExit = false;
            }
            if(currentButton == 2){
                stateStart = false;
                stateExit = true;
            }

            addButton();

    }
    private void addButton() {
        replay.add(stateStart);
        exit.add(stateExit);
    }

}

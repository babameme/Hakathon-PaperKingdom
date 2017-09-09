package bases.scenes.gameOver;

import bases.FrameCounter;
import bases.GameObject;
import bases.inputs.InputManager;
import bases.scenes.SceneManager;
import bases.scenes.gameOver.button.Exit;
import bases.scenes.gameOver.button.Replay;
import bases.scenes.gameOver.button.YourScore;
import bases.scenes.intros.IntroScene;
import bases.scenes.levelScenes.Lv1Scene;
import org.dyn4j.geometry.Vector2;

public class Button extends GameObject {
    private FrameCounter frameCounter;
    private InputManager inputManager = InputManager.instance;
    Exit exit = new Exit();
    Replay replay = new Replay();
    YourScore yourScore = new YourScore();
    private boolean stateStart;
    private boolean stateExit;
    private int currentButton = 0;

    public Button(){
        frameCounter = new FrameCounter(3);
    }

    @Override
    public void normalUpdate(Vector2 parentPosition) {
        super.normalUpdate(parentPosition);
        if(frameCounter.run()) {
            frameCounter.reset();
            if (inputManager.upPressed) {
                currentButton = 1-currentButton;
            }
            if(inputManager.downPressed){
                currentButton = 1-currentButton;
            }
            if(inputManager.enterPressed && currentButton == 0){
                SceneManager.changeScene(new Lv1Scene());
            }
            if(inputManager.enterPressed && currentButton == 1){
                System.exit(0);
            }
        }
            if(currentButton == 0){
                stateStart = true;
                stateExit = false;
            }
            if(currentButton == 1){
                stateStart = false;
                stateExit = true;
            }

            addButton();

    }
    private void addButton() {
        replay.add(stateStart);
        exit.add(stateExit);
        yourScore.add();
    }

}

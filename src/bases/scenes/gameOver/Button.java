package bases.scenes.gameOver;

import bases.FrameCounter;
import bases.GameObject;
import bases.inputs.InputManager;
import bases.inputs.MouseManager;
import bases.scenes.SceneManager;
import bases.scenes.gameOver.button.Exit;
import bases.scenes.gameOver.button.Replay;
import bases.scenes.gameOver.button.YourScore;
import bases.scenes.intros.IntroScene;
import bases.scenes.levelScenes.Lv1Scene;
import bases.settings.Settings;
import org.dyn4j.geometry.Vector2;

import java.awt.*;

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
        int x = MouseInfo.getPointerInfo().getLocation().x ;
        int y = MouseInfo.getPointerInfo().getLocation().y ;
        MouseManager.instance.position = new Vector2(x, y);
        if(y >= Settings.instance.getGamePlayHeight()/2 &&
                y <= Settings.instance.getGamePlayHeight()/2 + 30 &&
                x >= Settings.instance.getGamePlayWidth()/2 - 50 &&
                x <= Settings.instance.getGamePlayWidth()/2 + 40
                ){
            currentButton = 0;
            if(MouseManager.oneClicked){
                SceneManager.changeScene(new Lv1Scene());
                MouseManager.oneClicked = false;
            }
        }
        else if(y >= Settings.instance.getGamePlayHeight()/2 + 50 &&
                y <= Settings.instance.getGamePlayHeight()/2 + 80 &&
                x >= Settings.instance.getGamePlayWidth()/2 - 50 &&
                x <= Settings.instance.getGamePlayWidth()/2 + 10){
            currentButton = 1;
            if(MouseManager.oneClicked){
                System.exit(0);
            }
        }
        else{
            currentButton = -1;
        }
        if(currentButton == -1){
            stateStart = false;
            stateExit = false;
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

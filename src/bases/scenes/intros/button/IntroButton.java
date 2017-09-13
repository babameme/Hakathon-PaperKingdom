package bases.scenes.intros.button;

import bases.FrameCounter;
import bases.GameObject;
import bases.inputs.InputManager;
import bases.inputs.MouseManager;
import bases.scenes.SceneManager;
import bases.scenes.gameOver.button.Exit;
import bases.scenes.gameOver.button.Replay;
import bases.scenes.gameOver.button.YourScore;
import bases.scenes.levelScenes.Lv1Scene;
import bases.settings.Settings;
import org.dyn4j.geometry.Vector2;
import tklibs.AudioUtils;

import javax.sound.sampled.Clip;
import java.awt.*;

public class IntroButton extends GameObject {
    private FrameCounter frameCounter;
    private InputManager inputManager = InputManager.instance;
    StartButton startButton = new StartButton();
    Music music = new Music();
    HightScore hightScore = new HightScore();
    private boolean stateStart;
    private boolean stateMusic;
    private boolean stateHightScore;
    private int currentButton = 0;
    private Clip clip;
    private boolean musicOn ;

    public IntroButton(){

        frameCounter = new FrameCounter(5);
        clip = AudioUtils.playSound("assets/musics/Music from The Line Zen.wav",true);

    }

    @Override
    public void normalUpdate(Vector2 parentPosition) {
        super.normalUpdate(parentPosition);
        int x = MouseInfo.getPointerInfo().getLocation().x ;
        int y = MouseInfo.getPointerInfo().getLocation().y ;
        MouseManager.instance.position = new Vector2(x, y);
        if(y >= Settings.instance.getGamePlayHeight()/2 &&
                y <= Settings.instance.getGamePlayHeight()/2 + 30 &&
                x >= Settings.instance.getGamePlayWidth()/4 - 50 &&
                x <= Settings.instance.getGamePlayWidth()/4 + 30
                ){
            currentButton = 0;
            if(MouseManager.oneClicked){
                SceneManager.changeScene(new Lv1Scene());
                MouseManager.oneClicked = false;
            }
        }
        else if(y >= Settings.instance.getGamePlayHeight()/2 + 50 &&
                y <= Settings.instance.getGamePlayHeight()/2 + 80 &&
                x >= Settings.instance.getGamePlayWidth()/4 - 50 &&
                x <= Settings.instance.getGamePlayWidth()/4 + 110){
            currentButton = 1;
            if(MouseManager.oneClicked){
                clip.close();
                MouseManager.oneClicked = false;
            }
        }
        else if(y >= Settings.instance.getGamePlayHeight()/2 + 100 &&
                y <= Settings.instance.getGamePlayHeight()/2 + 130 &&
                x >= Settings.instance.getGamePlayWidth()/4 - 50 &&
                x <= Settings.instance.getGamePlayWidth()/4 + 100){
            currentButton = 2;
        }
        else{
            currentButton = -1;
        }
//        if(frameCounter.run()) {
//            frameCounter.reset();
//            if (inputManager.upPressed) {
//                currentButton = (currentButton + 2) % 3;
//            }
//            if(inputManager.downPressed){
//                currentButton = (currentButton +1) % 3;
//            }
//            if(inputManager.enterPressed && currentButton == 0){
//                SceneManager.changeScene(new Lv1Scene());
//            }
//            if(inputManager.enterPressed && currentButton == 1) {
//               clip.close();
//
//            }
//            if(inputManager.enterPressed && currentButton == 2){
//
//            }
//        }
        if(currentButton == -1){
            stateStart = false;
            stateMusic = false;
            stateHightScore = false;
        }
        if(currentButton == 0){
            stateStart = true;
            stateMusic = false;
            stateHightScore = false;
        }
        if(currentButton == 1){
            stateStart = false;
            stateMusic = true;
            stateHightScore = false;
        }
        if(currentButton == 2){
            stateStart = false;
            stateMusic = false;
            stateHightScore = true;
        }

        addButton();

    }
    private void addButton() {
        startButton.add(stateStart);
        music.add(stateMusic);
        hightScore.add(stateHightScore);
    }
}

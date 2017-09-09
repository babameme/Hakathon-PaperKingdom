package bases.scenes.intros.button;

import bases.FrameCounter;
import bases.GameObject;
import bases.inputs.InputManager;
import bases.scenes.SceneManager;
import bases.scenes.gameOver.button.Exit;
import bases.scenes.gameOver.button.Replay;
import bases.scenes.gameOver.button.YourScore;
import bases.scenes.levelScenes.Lv1Scene;
import org.dyn4j.geometry.Vector2;
import tklibs.AudioUtils;

import javax.sound.sampled.Clip;

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
        if(frameCounter.run()) {
            frameCounter.reset();
            if (inputManager.upPressed) {
                currentButton = (currentButton + 2) % 3;
            }
            if(inputManager.downPressed){
                currentButton = (currentButton +1) % 3;
            }
            if(inputManager.enterPressed && currentButton == 0){
                SceneManager.changeScene(new Lv1Scene());
            }
            if(inputManager.enterPressed && currentButton == 1) {
               clip.close();

            }
            if(inputManager.enterPressed && currentButton == 2){

            }
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
    private void resetsida(){
        if(musicOn == true)
            musicOn = false;
        if(musicOn == false)
            musicOn = true;
    }
}

package bases.scenes.intros;

import bases.GameObject;
import bases.scenes.Scene;
import bases.scenes.gameOver.Button;
import bases.scenes.intros.button.IntroButton;
import bases.scenes.intros.button.Music;
import bases.scenes.intros.button.HightScore;
import bases.scenes.intros.button.StartButton;
import bases.settings.Settings;

import javax.sound.sampled.Clip;

public class IntroScene extends Scene {
    Settings settings = Settings.instance;
    Clip clip;

    public IntroScene(){
        //clip = AudioUtils.playSound("assets/music/lactroi.wav", true);

    }

    @Override
    public void init() {
        addBackground();
        addButton();

    }


    private void addButton() {
        GameObject.add(new IntroButton());
    }

    private void addBackground() {
        GameObject.add(new IntroBackground());

    }
}

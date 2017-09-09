package bases.scenes.gameOver;

import bases.GameObject;
import bases.scenes.Scene;
import tklibs.AudioUtils;

public class GameOver extends Scene {

    public GameOver(){
        //AudioUtils.playSound("assets/music/nhạc nền.mp3",true);
    }

    @Override
    public void init() {
        addImage();
    }

    private void addImage() {
        GameObject.add(new GameOverBackground());
        GameObject.add(new Button());
    }

}

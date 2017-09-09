package bases.scenes.gameOver.button;

import bases.GameObject;
import papers.players.Score;
import bases.renderers.TextRenderer;
import bases.scenes.Scene;
import bases.settings.Settings;

import java.awt.*;

public class YourScore extends GameObject{
    public void add(){
        TextRenderer yourScore = new TextRenderer("YOUR SCORE " + Integer.toString(Score.score), true);
        yourScore.setColor(Color.ORANGE);
        this.renderer = yourScore;
        this.position.set(Settings.instance.getGamePlayWidth() / 2 - 50, Settings.instance.getGamePlayHeight() / 2 + 90);
        GameObject.add(this);
    }
}

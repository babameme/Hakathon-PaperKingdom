package bases.scenes.gameOver.button;

import bases.GameObject;
import papers.players.Score;
import bases.renderers.TextRenderer;
import bases.scenes.Scene;
import bases.settings.Settings;

public class YourScore extends GameObject{
    public void add(){
        this.renderer = new TextRenderer("YOUR SCORE " + Integer.toString(Score.score), true);
        this.position.set(Settings.instance.getGamePlayWidth() / 2 - 50, Settings.instance.getGamePlayHeight() / 2 + 80);
        GameObject.add(this);
    }
}

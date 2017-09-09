package bases.scenes.gameOver.button;

import bases.GameObject;
import bases.renderers.TextRenderer;
import bases.settings.Settings;
import org.dyn4j.geometry.Vector2;

public class Replay extends GameObject {
    public void add(boolean state){

        this.renderer = new TextRenderer("REPLAY", state);
        this.position.set(Settings.instance.getGamePlayWidth()/2 - 50 , Settings.instance.getGamePlayHeight()/2 );
        GameObject.add(this);
    }
}

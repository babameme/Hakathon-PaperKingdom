package bases.scenes.gameOver;

import bases.GameObject;
import bases.renderers.ImageRenderer;
import bases.settings.Settings;
import org.dyn4j.geometry.Vector2;

public class GameOverBackground extends GameObject {
    public GameOverBackground(){
        this.renderer = ImageRenderer.create("assets/images/huhu.png");
        this.position.set(Settings.instance.getGamePlayWidth() / 2, Settings.instance.getGamePlayHeight() /2);
    }
}

package bases.scenes.intros.button;

import bases.GameObject;
import bases.renderers.ImageRenderer;
import bases.renderers.TextRenderer;
import bases.settings.Settings;
import tklibs.SpriteUtils;

public class Music extends GameObject{
    TextRenderer textRenderer;
    public Music() {
        super();
        //this.textRenderer = new TextRenderer("MUSIC");
        this.position.set(Settings.instance.getGamePlayWidth()/2 - 50, Settings.instance.getGamePlayHeight()/2 + 50);
        this.renderer = textRenderer;
    }

}

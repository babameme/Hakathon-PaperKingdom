package bases.scenes.intros.button;

import bases.GameObject;
import bases.renderers.ImageRenderer;
import bases.renderers.TextRenderer;
import bases.settings.Settings;
import tklibs.SpriteUtils;

public class Music extends GameObject{
    TextRenderer textRenderer;
    public void add(boolean stage) {
        this.textRenderer = new TextRenderer("CLOSE MUSIC", stage);
        this.position.set(Settings.instance.getGamePlayWidth()/4 - 50, Settings.instance.getGamePlayHeight()/2 + 50);
        this.renderer = textRenderer;
        GameObject.add(this);
    }

}

package bases.scenes.intros.button;

import bases.GameObject;
import bases.renderers.TextRenderer;
import bases.settings.Settings;
import tklibs.SpriteUtils;

public class StartButton extends GameObject {
    TextRenderer textRenderer;

    public void add(boolean stage ) {
        this.textRenderer = new TextRenderer("START",stage);
        this.position.set(Settings.instance.getGamePlayWidth()/4 - 50, Settings.instance.getGamePlayHeight()/2 );
        this.renderer = textRenderer;
        GameObject.add(this);
    }
}

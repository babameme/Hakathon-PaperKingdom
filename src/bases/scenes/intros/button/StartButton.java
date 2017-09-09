package bases.scenes.intros.button;

import bases.GameObject;
import bases.renderers.TextRenderer;
import bases.settings.Settings;
import tklibs.SpriteUtils;

public class StartButton extends GameObject {
    TextRenderer textRenderer;

    public StartButton( ) {
        super();
        //this.textRenderer = new TextRenderer("START");
        this.position.set(Settings.instance.getGamePlayWidth()/2 - 50, Settings.instance.getGamePlayHeight()/2 - 50);
        this.renderer = textRenderer;
    }
}

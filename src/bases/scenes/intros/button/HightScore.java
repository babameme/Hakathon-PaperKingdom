package bases.scenes.intros.button;

import bases.GameObject;
import bases.renderers.TextRenderer;
import bases.settings.Settings;

public class HightScore extends GameObject {
    TextRenderer textRenderer;

    public HightScore() {
        super();
        //this.textRenderer = new TextRenderer("HIGH SCORE");

        this.position.set(Settings.instance.getGamePlayWidth()/2 - 50, Settings.instance.getGamePlayHeight()/2);
        this.renderer = textRenderer;
    }

}

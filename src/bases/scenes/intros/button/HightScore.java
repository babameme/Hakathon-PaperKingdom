package bases.scenes.intros.button;

import bases.GameObject;
import bases.renderers.TextRenderer;
import bases.settings.Settings;

public class HightScore extends GameObject {
    TextRenderer textRenderer;

    public void add(boolean stage) {
        this.textRenderer = new TextRenderer("HIGH SCORE",stage);

        this.position.set(Settings.instance.getGamePlayWidth()/4 - 50 , Settings.instance.getGamePlayHeight()/2 + 100);
        this.renderer = textRenderer;
        GameObject.add(this);
    }

}

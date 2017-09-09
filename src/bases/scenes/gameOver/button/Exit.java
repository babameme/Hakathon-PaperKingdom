package bases.scenes.gameOver.button;

import bases.GameObject;
import bases.renderers.TextRenderer;
import bases.settings.Settings;

public class Exit extends GameObject {

    public void add(boolean state){

        this.renderer = new TextRenderer("EXIT", state);
        this.position.set(Settings.instance.getGamePlayWidth() / 2 - 50, Settings.instance.getGamePlayHeight() / 2 + 40);
        GameObject.add(this);

    }
}

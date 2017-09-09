package bases.buttons;

import bases.FrameCounter;
import bases.GameObject;
import bases.inputs.InputManager;
import bases.scenes.Scene;
import bases.scenes.SceneManager;
import org.dyn4j.geometry.Vector2;

import java.awt.image.BufferedImage;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class MenuButton extends GameObject {
    private FrameCounter frameCounter;
    public int currentButton;
    private ArrayList<Scene> scenes;
    public MenuButton() {
        super();
        this.frameCounter = new FrameCounter(3);
        scenes = new ArrayList<>();
        currentButton = 0;
    }

    @Override
    protected void normalUpdate(Vector2 parentPosition) {
        super.normalUpdate(parentPosition);
        //System.out.println(screenPosition);
        if(InputManager.instance.upPressed){
            currentButton = (currentButton - 2 + scenes.size()) % scenes.size();
        }
        if(InputManager.instance.downPressed){
            currentButton = (currentButton + 1) % scenes.size();
        }
        if(InputManager.instance.enterPressed){
            SceneManager.changeScene(scenes.get(currentButton));
        }
    }

    public ArrayList<Scene> getScenes() {
        return scenes;
    }
}

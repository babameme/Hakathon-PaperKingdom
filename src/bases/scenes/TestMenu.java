package bases.scenes;

import bases.GameObject;
import bases.buttons.Button;
import bases.buttons.MenuButton;
import bases.renderers.ImageRenderer;
import org.dyn4j.geometry.Vector2;

public class TestMenu extends Scene{

    @Override
    public void init() {
        //System.out.println("Hehe");

        MenuButton menuButton = new MenuButton();

        Button playerButton = new Button(0, 0);
        Button quitButton = new Button(1, 0);

        menuButton.addChild(playerButton);
        menuButton.addChild(quitButton);

        playerButton.getPosition().set(100, 100);
        quitButton.getPosition().set(100, 250);

        playerButton.setPlay(ImageRenderer.create("assets/menus/start-color.png"));
        playerButton.setQuit(ImageRenderer.create("assets/menus/start-white.png"));
        quitButton.setPlay(ImageRenderer.create("assets/menus/quit-color.png"));
        quitButton.setQuit(ImageRenderer.create("assets/menus/quit-white.png"));

        menuButton.getScenes().add(new Level1Scene());
        menuButton.getScenes().add(new Level1Scene());
        menuButton.addChild(playerButton);
        menuButton.addChild(quitButton);
        //menuButton.getChildren().add(playerButton);
        //menuButton.getChildren().add(quitButton);

        //System.out.println(menuButton.getChildren().get(0).getPosition());
        //System.out.println(menuButton.getChildren().get(1).getPosition());
        //GameObject.add(playerButton);
        //GameObject.add(quitButton);
        GameObject.add(menuButton);
    }
}

package bases.scenes;

import bases.scenes.levelScenes.*;

/**
 * Created by huynq on 8/23/17.
 */
public class SceneManager {

    private static Scene currentScene;
    private static Scene nextScene;

    public static void changeScene(Scene newScene) {

        // Remmeber scene transition
        if (nextScene == null) {
            nextScene = newScene;
        }
    }

    public static void changeSceneIfNeeded() {
        if (nextScene != null) {
            // Change scene REQUESTED

            if (currentScene != null)
                currentScene.destroy();

            nextScene.init();

            currentScene = nextScene;

            // Clear request
            nextScene = null;
        }
    }

    public static Scene getNextScene() {
        Scene oldScene = currentScene;
        if (oldScene instanceof Lv1Scene) return new Lv2Scene();
        if (oldScene instanceof Lv2Scene) return new Lv3Scene();
        if (oldScene instanceof Lv3Scene) return new Lv4Scene();
        if (oldScene instanceof Lv4Scene) return new Lv5Scene();
        if (oldScene instanceof Lv5Scene) return new Lv6Scene();
        else return new Lv1Scene();
    }
}


package bases.scenes;

public class SceneManager {
    private static Scene currentScene;
    private static Scene nextScene;

    public static void changeScene(Scene newScene){
        //Remember scene transition

        if(nextScene == null) {
            nextScene = newScene;
        }

    }

    public static void changeSceneIfNeeded(){
        if(nextScene != null){
            // Change scene Requested
            if(currentScene != null) {
                currentScene.destroy();
            }
            // scene moi init
            nextScene.init();
            //update curent scene
            currentScene = nextScene;

            nextScene = null;

        }
    }
}

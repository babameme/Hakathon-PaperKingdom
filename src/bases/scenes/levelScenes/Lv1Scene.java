package bases.scenes.levelScenes;

import bases.GameObject;
import bases.friends.Friend;
import bases.obstacles.Obstacles;
import bases.players.Player;
import bases.players.Score;
import bases.renderers.ImageRenderer;
import bases.scenes.Scene;
import org.dyn4j.geometry.Circle;
import org.dyn4j.geometry.Rectangle;
import org.dyn4j.geometry.Vector2;

public class Lv1Scene extends Scene {
    @Override
    public void init() {
        Score score = new Score();
        GameObject.add(score);

        GameObject gameObject = new GameObject();
        gameObject.setRenderer(ImageRenderer.create("assets/images/green_square.png"));

        Player player = new Player(new Rectangle(1, 1), 2, 3.6);
        player.getPosition().set(10, 100);
        GameObject.add(player);

        Friend friend = new Friend(new Circle(2), 0, 0, new Vector2(0, 0));
        friend.getPosition().set(300, 140);
        GameObject.add(friend);

        Obstacles obstacle = new Obstacles(new Rectangle(3, 4), 5, 30, new Vector2(0, 0));
        obstacle.getPosition().set(150, 100);
        GameObject.add(obstacle);
    }
}

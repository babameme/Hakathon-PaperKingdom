package bases.scenes.levelScenes;

import bases.GameObject;
import bases.scenes.Scene;
import org.dyn4j.geometry.Circle;
import org.dyn4j.geometry.Rectangle;
import org.dyn4j.geometry.Vector2;
import papers.friends.Friend;
import papers.obstacles.Obstacle;
import papers.players.Player;
import papers.players.Score;


public class Lv1Scene extends Scene {
    @Override
    public void init() {
        Player player = new Player(new Circle(1), 2, 3.6);
        player.getPosition().set(31, 207);
        GameObject.add(player);

        Obstacle Obstacle = new Obstacle(new Rectangle(6, 16), 0, 0, new Vector2(0, 0));
        Obstacle.getPosition().set(31, 78);
        GameObject.add(Obstacle);

        Obstacle = new Obstacle(new Rectangle(6, 16), 0, 0, new Vector2(0, 0));
        Obstacle.getPosition().set(31, 336);
        GameObject.add(Obstacle);
// cong vao

        Obstacle = new Obstacle(new Rectangle(6, 16), 0, 0, new Vector2(0, 0));
        Obstacle.getPosition().set(705, 78);
        GameObject.add(Obstacle);

        Obstacle = new Obstacle(new Rectangle(6, 16), 0, 0, new Vector2(0, 0));
        Obstacle.getPosition().set(705, 336);
        GameObject.add(Obstacle);
// cong ra

        Obstacle = new Obstacle(new Rectangle(61.4, 7.8), 0, 0, new Vector2(0, 0));
        Obstacle.getPosition().set(368, 39);
        GameObject.add(Obstacle);

        Obstacle = new Obstacle(new Rectangle(61.4, 7.8), 0, 0, new Vector2(0, 0));
        Obstacle.getPosition().set(368, 375);
        GameObject.add(Obstacle);

// tran va san

        Obstacle = new Obstacle(new Rectangle(2, 18), 1, 1, new Vector2(0, 0));
        Obstacle.getPosition().set(225, 207);
        GameObject.add(Obstacle);

        Obstacle = new Obstacle(new Rectangle(18, 2), 1, 1, new Vector2(0, 0));
        Obstacle.getPosition().set(225, 207);
        GameObject.add(Obstacle);

        Obstacle = new Obstacle(new Rectangle(2, 18), 1, 1, new Vector2(0, 0));
        Obstacle.getPosition().set(530, 207);
        GameObject.add(Obstacle);

        Obstacle = new Obstacle(new Rectangle(18, 2), 1, 1, new Vector2(0, 0));
        Obstacle.getPosition().set(530, 207);
        GameObject.add(Obstacle);
        Score score = new Score();
        GameObject.add(score);
    }
}

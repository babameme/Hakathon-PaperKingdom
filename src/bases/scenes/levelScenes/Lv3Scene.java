package bases.scenes.levelScenes;

import bases.GameObject;
import bases.scenes.Scene;
import org.dyn4j.geometry.Circle;
import org.dyn4j.geometry.Rectangle;
import org.dyn4j.geometry.Vector2;
import papers.obstacles.Obstacle;
import papers.players.Player;
import papers.players.Score;

public class Lv3Scene extends Scene {

    @Override
    public void init() {

        Player player = new Player(new Circle(0.7), 2, 3.6);
        player.getPosition().set(31, 207);
        GameObject.add(player);


        Obstacle obstacle = new Obstacle(new Rectangle(6, 16), 0, 0, new Vector2(0, 0));
        obstacle.getPosition().set(31, 78);
        GameObject.add(obstacle);

        obstacle = new Obstacle(new Rectangle(6, 16), 0, 0, new Vector2(0, 0));
        obstacle.getPosition().set(31, 336);
        GameObject.add(obstacle);
// cong vao
        obstacle = new Obstacle(new Rectangle(6, 16), 0, 0, new Vector2(0, 0));
        obstacle.getPosition().set(705, 78);
        GameObject.add(obstacle);

        obstacle = new Obstacle(new Rectangle(6, 16), 0, 0, new Vector2(0, 0));
        obstacle.getPosition().set(705, 336);
        GameObject.add(obstacle);
// cong ra
        obstacle = new Obstacle(new Rectangle(61.4, 7.8), 0, 0, new Vector2(0, 0));
        obstacle.getPosition().set(368, 39);
        GameObject.add(obstacle);

        obstacle = new Obstacle(new Rectangle(61.4, 7.8), 0, 0, new Vector2(0, 0));
        obstacle.getPosition().set(368, 375);
        GameObject.add(obstacle);
// tran va san

        obstacle = new Obstacle(new Rectangle(2, 8), 1, 2, new Vector2(0, 0));
        obstacle.getPosition().set(225, 207);
        GameObject.add(obstacle);

        obstacle = new Obstacle(new Rectangle(8, 2), 1, 2, new Vector2(0, 0));
        obstacle.getPosition().set(225, 207);
        GameObject.add(obstacle);

        obstacle = new Obstacle(new Rectangle(2, 8), 1, -2, new Vector2(0, 0));
        obstacle.getPosition().set(530, 207);
        GameObject.add(obstacle);

        obstacle = new Obstacle(new Rectangle(8, 2), 1, -2, new Vector2(0, 0));
        obstacle.getPosition().set(530, 207);
        GameObject.add(obstacle);


        obstacle = new Obstacle(new Rectangle(2, 8), 1, 3, new Vector2(0, 0));
        obstacle.getPosition().set(380, 140);
        GameObject.add(obstacle);

        obstacle = new Obstacle(new Rectangle(8, 2), 1, 3, new Vector2(0, 0));
        obstacle.getPosition().set(380, 140);
        GameObject.add(obstacle);

        obstacle = new Obstacle(new Rectangle(2, 8), 1, -3, new Vector2(0, 0));
        obstacle.getPosition().set(380, 280);
        GameObject.add(obstacle);

        obstacle = new Obstacle(new Rectangle(8, 2), 1, -3, new Vector2(0, 0));
        obstacle.getPosition().set(380, 280);
        GameObject.add(obstacle);

		GameObject.add(Score.instance);
    }
}

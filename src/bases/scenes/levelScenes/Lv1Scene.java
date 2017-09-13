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
        obstacle = new Obstacle(new Rectangle(24.3, 8.0), 0, 0, new Vector2(0, 0));
        obstacle.getPosition().set(182, 118);
        GameObject.add(obstacle);

        obstacle = new Obstacle(new Rectangle(12, 23.2), 0, 0, new Vector2(0, -1));
        obstacle.getPosition().set(244, 141);
        GameObject.add(obstacle);
        //Nho len 2


        obstacle = new Obstacle(new Rectangle(12, 18.5), 0, 0, new Vector2(0, 1));
        obstacle.getPosition().set(489.5, 300);
        GameObject.add(obstacle);
        // Nho len 1

        obstacle = new Obstacle(new Rectangle(24.5, 8), 0, 0, new Vector2(0, 0));
        obstacle.getPosition().set(552, 295.5);
        GameObject.add(obstacle);
		
		Score.instance.score = 0;
        GameObject.add(Score.instance);
    }
}

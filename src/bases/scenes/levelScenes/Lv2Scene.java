package bases.scenes.levelScenes;

import bases.GameObject;
import bases.scenes.Scene;
import org.dyn4j.geometry.Circle;
import org.dyn4j.geometry.MassType;
import org.dyn4j.geometry.Rectangle;
import org.dyn4j.geometry.Vector2;
import papers.friends.Friend;
import papers.obstacles.Obstacle;
import papers.players.Player;
import papers.players.Score;

public class Lv2Scene extends Scene {

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

        obstacle = new Obstacle(new Rectangle(6, 34), 0, 0, new Vector2(0, -2));
        obstacle.getPosition().set(184, 42);
        GameObject.add(obstacle);

        obstacle = new Obstacle(new Rectangle(6, 14.6), 0, 0, new Vector2(0, -2));
        obstacle.getPosition().set(184, 323.5);
        GameObject.add(obstacle);
// cap 1
        obstacle = new Obstacle(new Rectangle(6, 32.6), 0, 0, new Vector2(0, 2));
        obstacle.getPosition().set(368, 35.5);
        GameObject.add(obstacle);

        obstacle = new Obstacle(new Rectangle(6, 34), 0, 0, new Vector2(0, 2));
        obstacle.getPosition().set(368, 405.5);
        GameObject.add(obstacle);
//cap 2

//// Chan
//        Friend friend = new Friend(new Rectangle(1, 3), 0, 0, new Vector2(0, 0));
//        friend.getPosition().set(300, 150);
//        GameObject.add(friend);

        obstacle = new Obstacle(new Rectangle(6, 29), 0, 0, new Vector2(0, -1.5));
        obstacle.getPosition().set(521.5, 22);
        GameObject.add(obstacle);

        obstacle = new Obstacle(new Rectangle(6, 17.6), 0, 0, new Vector2(0, -1.5));
        obstacle.getPosition().set(521.5, 295.5);
        GameObject.add(obstacle);
//cap 3

		GameObject.add(Score.instance);
    }
}

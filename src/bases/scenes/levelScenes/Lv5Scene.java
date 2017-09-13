package bases.scenes.levelScenes;

import bases.GameObject;
import bases.scenes.Background;
import bases.scenes.Scene;
import org.dyn4j.geometry.Circle;
import org.dyn4j.geometry.Rectangle;
import org.dyn4j.geometry.Vector2;
import papers.friends.Friend;
import papers.obstacles.Obstacle;
import papers.players.Player;
import papers.players.Score;

import java.awt.*;

public class Lv5Scene extends Scene{
    @Override
    public void init() {

        //addBackground();
        Obstacle bgr = new Obstacle(new Rectangle(73.6, 41.4),0,0,new Vector2(7, 0));
        bgr.getPosition().set(-368, 207);
        bgr.setColor(Color.cyan);
        GameObject.add(bgr);

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

        obstacle = new Obstacle(new Rectangle(12, 5.2), 0, 0, new Vector2(0, 0));
        obstacle.getPosition().set(244, 181);
        GameObject.add(obstacle);

        /*obstacle = new Obstacle(new Rectangle(36.8, 2.6), 0, 0, new Vector2(0, 0));
        obstacle.getPosition().set(245, 323);
        GameObject.add(obstacle);*/

        obstacle = new Obstacle(new Rectangle(12.1, 10.5), 0, 0, new Vector2(0, 0));
        obstacle.getPosition().set(490.5, 233);
        GameObject.add(obstacle);

        obstacle = new Obstacle(new Rectangle(24.5, 8.3), 0, 0, new Vector2(0, 0));
        obstacle.getPosition().set(552, 297.5);
        GameObject.add(obstacle);

        obstacle = new Obstacle(new Rectangle(1, 4), 5, 5, new Vector2(0, 0));
        obstacle.getPosition().set(122,250);
        GameObject.add(obstacle);

        obstacle = new Obstacle(new Rectangle(1, 5), 5, 5, new Vector2(0, 0));
        obstacle.getPosition().set(490,120);
        GameObject.add(obstacle);

        obstacle = new Obstacle(new Rectangle(1, 4), 5, 5, new Vector2(0, 0));
        obstacle.getPosition().set(368, 285);
        GameObject.add(obstacle);

        Friend friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0) );
        friend.getPosition().set(368, 207);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0) );
        friend.getPosition().set(348, 207);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0) );
        friend.getPosition().set(328, 207);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0) );
        friend.getPosition().set(388, 207);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0) );
        friend.getPosition().set(408, 207);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0) );
        friend.getPosition().set(245, 217);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0) );
        friend.getPosition().set(245, 237);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0) );
        friend.getPosition().set(245, 257);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0) );
        friend.getPosition().set(245, 277);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0) );
        friend.getPosition().set(245, 297);
        GameObject.add(friend);

		GameObject.add(Score.instance);
    }

    private void addBackground() {
        GameObject.add(new Background());
    }
}

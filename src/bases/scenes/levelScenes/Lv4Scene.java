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

public class Lv4Scene extends Scene {
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

        obstacle = new Obstacle(new Circle(5), 0, 0, new Vector2(0, 0));
        obstacle.getPosition().set(184, 155);
        GameObject.add(obstacle);

        obstacle = new Obstacle(new Circle(5), 0, 0, new Vector2(0, 0));
        obstacle.getPosition().set(256, 285);
        GameObject.add(obstacle);

        obstacle = new Obstacle(new Circle(5), 0, 0, new Vector2(0, 0));
        obstacle.getPosition().set(400, 207);
        GameObject.add(obstacle);

        obstacle = new Obstacle(new Circle(5), 0, 0, new Vector2(0, 0));
        obstacle.getPosition().set(580, 130 );
        GameObject.add(obstacle);

        obstacle = new Obstacle(new Circle(5), 0, 0, new Vector2(0, 0));
        obstacle.getPosition().set(580, 285);
        GameObject.add(obstacle);

        obstacle = new Obstacle(new Rectangle(1, 3), 5, 5, new Vector2(0, 0));
        obstacle.getPosition().set(650,207);
        GameObject.add(obstacle);

//  obstancles

        Friend friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0));
        friend.getPosition().set(184, 230);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0));
        friend.getPosition().set(200, 230);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0));
        friend.getPosition().set(220, 230);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0));
        friend.getPosition().set(240, 230);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0));
        friend.getPosition().set(184, 250);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0));
        friend.getPosition().set(184, 270);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0));
        friend.getPosition().set(184, 290);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0));
        friend.getPosition().set(300, 230);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0));
        friend.getPosition().set(300, 210);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0));
        friend.getPosition().set(300, 190);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0));
        friend.getPosition().set(300, 170);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0));
        friend.getPosition().set(552, 207);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0));
        friend.getPosition().set(570, 207);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0));
        friend.getPosition().set(590, 207);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0));
        friend.getPosition().set(610, 207);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0));
        friend.getPosition().set(552, 180);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0));
        friend.getPosition().set(570, 180);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0));
        friend.getPosition().set(590, 180);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0));
        friend.getPosition().set(610, 180);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0));
        friend.getPosition().set(552, 220);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0));
        friend.getPosition().set(570, 220);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0));
        friend.getPosition().set(590, 220);
        GameObject.add(friend);

        friend = new Friend(new Rectangle(1, 1), 5, 5, new Vector2(0, 0));
        friend.getPosition().set(610, 220);
        GameObject.add(friend);
		GameObject.add(Score.instance);

    }
}

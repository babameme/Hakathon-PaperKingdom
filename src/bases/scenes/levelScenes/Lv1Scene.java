package bases.scenes.levelScenes;

import bases.GameObject;
import bases.scenes.Scene;
import org.dyn4j.geometry.Circle;
import org.dyn4j.geometry.Rectangle;
import org.dyn4j.geometry.Vector2;
import papers.friends.Friend;
import papers.obstacles.Obstacle;
import papers.players.Player;


public class Lv1Scene extends Scene {
    @Override
    public void init() {
        Player player = new Player(new Circle(1), 0, 0);
        player.getPosition().set(20, 200);
        GameObject.add(player);

        Obstacle obstacle1 = new Obstacle(new Rectangle(5, 20), 0, 0, new Vector2(0, 0));
        obstacle1.getPosition().set(20, 70);
        GameObject.add(obstacle1);

        obstacle1 = new Obstacle(new Rectangle(5, 20), 0, 0, new Vector2(0, 0));
        obstacle1.getPosition().set(20, 325);
        GameObject.add(obstacle1);

        obstacle1 = new Obstacle(new Rectangle(5, 20), 0, 0, new Vector2(0, 0));
        obstacle1.getPosition().set(715, 70);
        GameObject.add(obstacle1);

        obstacle1 = new Obstacle(new Rectangle(5, 20), 0, 0, new Vector2(0, 0));
        obstacle1.getPosition().set(715, 325);
        GameObject.add(obstacle1);

        obstacle1 = new Obstacle(new Rectangle(100, 15), 0, 0, new Vector2(0, 0));
        obstacle1.getPosition().set(300, 20);
        GameObject.add(obstacle1);

        obstacle1 = new Obstacle(new Rectangle(100, 15), 0, 0, new Vector2(0, 0));
        obstacle1.getPosition().set(300, 380);
        GameObject.add(obstacle1);

        obstacle1 = new Obstacle(new Rectangle(5, 15), 0, 0, new Vector2(0, 0));
        obstacle1.getPosition().set(150, 140);
        GameObject.add(obstacle1);

        obstacle1 = new Obstacle(new Rectangle(5, 4), 0, 0, new Vector2(0, 0));
        obstacle1.getPosition().set(150, 290);
        GameObject.add(obstacle1);

        obstacle1 = new Obstacle(new Rectangle(5, 5), 0, 0, new Vector2(0, 0));
        obstacle1.getPosition().set(280, 100);
        GameObject.add(obstacle1);

        obstacle1 = new Obstacle(new Rectangle(5, 15), 0, 0, new Vector2(0, 0));
        obstacle1.getPosition().set(280, 250);
        GameObject.add(obstacle1);

        obstacle1 = new Obstacle(new Rectangle(5, 8), 0, 0, new Vector2(0, 0));
        obstacle1.getPosition().set(410, 265);
        GameObject.add(obstacle1);

        obstacle1 = new Obstacle(new Rectangle(5, 12), 0, 0, new Vector2(0, 0));
        obstacle1.getPosition().set(410, 110);
        GameObject.add(obstacle1);

        obstacle1 = new Obstacle(new Rectangle(5, 17), 0, 0, new Vector2(0, 0));
        obstacle1.getPosition().set(540, 150);
        GameObject.add(obstacle1);

        obstacle1 = new Obstacle(new Rectangle(5, 3), 0, 0, new Vector2(0, 0));
        obstacle1.getPosition().set(540, 300);
        GameObject.add(obstacle1);

        obstacle1 = new Obstacle(new Rectangle(1, 5), 0, 3, new Vector2(0, 0));
        obstacle1.getPosition().set(630, 250);
        GameObject.add(obstacle1);

        obstacle1 = new Obstacle(new Rectangle(1, 5), 0, 3, new Vector2(0, 0));
        obstacle1.getPosition().set(80, 250);
        GameObject.add(obstacle1);

        Friend friend = new Friend(new Circle(0.5), 0, 0, new Vector2(0, 0));
        friend.getPosition().set(150, 200);
        GameObject.add(friend);

        friend = new Friend(new Circle(0.5), 0, 0, new Vector2(0, 0));
        friend.getPosition().set(150, 220);
        GameObject.add(friend);

        friend = new Friend(new Circle(0.5), 0, 0, new Vector2(0, 0));
        friend.getPosition().set(150, 240);
        GameObject.add(friend);

        friend = new Friend(new Circle(0.5), 0, 0, new Vector2(0, 0));
        friend.getPosition().set(150, 250);
        GameObject.add(friend);

        friend = new Friend(new Circle(0.5), 0, 0, new Vector2(0, 0));
        friend.getPosition().set(150, 260);
        GameObject.add(friend);

        friend = new Friend(new Circle(0.5), 0, 0, new Vector2(0, 0));
        friend.getPosition().set(550, 240);
        GameObject.add(friend);

        friend = new Friend(new Circle(0.5), 0, 0, new Vector2(0, 0));
        friend.getPosition().set(550, 250);
        GameObject.add(friend);


        friend = new Friend(new Circle(0.5), 0, 0, new Vector2(0, 0));
        friend.getPosition().set(550, 260);
        GameObject.add(friend);

        friend = new Friend(new Circle(0.5), 0, 0, new Vector2(0, 0));
        friend.getPosition().set(550, 270);
        GameObject.add(friend);


        friend = new Friend(new Circle(0.5), 0, 0, new Vector2(0, 0));
        friend.getPosition().set(550, 280);
        GameObject.add(friend);

        Obstacle obstacle = new Obstacle(new Rectangle(1, 5), 0, 3, new Vector2(0, 0));
        obstacle1.getPosition().set(340, 200);
        GameObject.add(obstacle1);
    }
}

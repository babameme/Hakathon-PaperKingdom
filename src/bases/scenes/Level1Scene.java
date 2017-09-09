package bases.scenes;

import bases.GameObject;
import bases.friends.Friend;
import bases.obstacles.Obstacles;
import bases.players.Player;
import bases.renderers.ImageRenderer;
import org.dyn4j.geometry.Circle;
import org.dyn4j.geometry.Rectangle;
import org.dyn4j.geometry.Vector2;

public class Level1Scene extends Scene {
    GameObject gameObject = new GameObject();

    public Level1Scene() {
        //gameObject.setRenderer(ImageRenderer.create("assets/images/green_square.png"));
    }

    @Override
    public void init() {
        addFriend();
        addObstacles();
        addPlayer();
    }
    private void addPlayer(){
        Player player = new Player(new Rectangle(1, 1), 2, 3.6);
        player.getPosition().set(10, 100);
        GameObject.add(player);
    }
    private void addFriend(){
        Friend friend = new Friend(new Circle(2), 0, 0, new Vector2(0, 0));
        friend.getPosition().set(300, 140);
        GameObject.add(friend);
    }
    private void addObstacles(){

        Obstacles obstacle = new Obstacles(new Rectangle(3,     15), 0, 0, new Vector2(0, 0));
        obstacle.getPosition().set(150, 60);
        GameObject.add(obstacle);
    }
}

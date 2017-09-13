package bases.scenes.levelScenes;

import bases.GameObject;
import bases.scenes.Scene;
import org.dyn4j.geometry.*;
import papers.friends.Friend;
import papers.obstacles.Obstacle;
import papers.players.Player;

public class Lv7Scene extends Scene{

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

        /*Friend friend = new Friend(new Rectangle(2, 16)
                , 0 , 0, new Vector2(0, 0));
        friend.getPosition().set(100, 190);
        GameObject.add(friend);*/

        Friend friend = new Friend(new Rectangle(20.0, 2.8), 0, 0, new Vector2(0, 2));
        friend.getBody().setMass(MassType.INFINITE);
        friend.getPosition().set(210, 330);
        GameObject.add(friend);

        double x = 118.0, y = 305.0;
        for (int i = 0; i < 14; i++) {
            obstacle = new Obstacle(new Rectangle(1, 1), 0 , 12, new Vector2(0, 0));
            obstacle.getPosition().set(118 + i * 15, y);
            obstacle.getBody().setMass(MassType.NORMAL);
            GameObject.add(obstacle);
        }

        y = 270.0;
        for(int i = 0; i < 8; i++){
            obstacle = new Obstacle(new Rectangle(1, 1), 0 , i * 3 + 5, new Vector2(0, 5-i));
            obstacle.getPosition().set(121 + i * 25 + i, y);
            obstacle.getBody().setMass(MassType.NORMAL);
            GameObject.add(obstacle);
        }

        friend = new Friend(new Rectangle(20.0, 2.8), 0, 0, new Vector2(0, -2));
        friend.getBody().setMass(MassType.INFINITE);
        friend.getPosition().set(510, 90);
        GameObject.add(friend);

        y = 115.0;
        x = 418.0;
        for (int i = 0; i < 13; i++) {
            obstacle = new Obstacle(new Rectangle(1, 1), 0 , i * i - 12 * i + 4, new Vector2(0, 0));
            obstacle.getPosition().set(x + i * 15, y);
            obstacle.getBody().setMass(MassType.NORMAL);
            GameObject.add(obstacle);
        }
    }
}

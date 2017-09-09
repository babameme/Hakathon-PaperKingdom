package bases.settings;

import java.awt.*;

/**
 * Created by huynq on 8/19/17.
 */
public class Settings {
    private int windowWidth;
    private int windowHeight;

    private int gamePlayWidth;
    private int gamePlayHeight;
    public static final double scale = 10.0;
    public Color playerColor = Color.BLUE;
    public Color obstacleColor = Color.RED;
    public Color friendColor = Color.GREEN;
    public Color backgroundColor = Color.WHITE;

    public static final Settings instance = new Settings();

    private Settings(int gamePlayWidth, int gamePlayHeight) {
        this.gamePlayWidth = gamePlayWidth;
        this.gamePlayHeight = gamePlayHeight;
    }

    public int getGamePlayWidth() {
        return gamePlayWidth;
    }

    public int getGamePlayHeight() {
        return gamePlayHeight;
    }

    public Color getPlayerColor() {
        return playerColor;
    }

    public Color getObstacleColor() {
        return obstacleColor;
    }

    public Color getFriendColor() {
        return friendColor;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    private Settings() {
        this(736, 414);
    }
}

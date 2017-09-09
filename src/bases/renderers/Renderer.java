package bases.renderers;

import org.dyn4j.dynamics.Body;
import org.dyn4j.geometry.Vector2;

import java.awt.*;

public interface Renderer {
    void render(Graphics2D g2d, Vector2 position, Body body, Color color);
}

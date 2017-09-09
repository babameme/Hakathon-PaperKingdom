package bases.renderers;

import org.dyn4j.dynamics.Body;
import org.dyn4j.geometry.Vector2;

import java.awt.*;
import java.awt.Font;
import java.io.IOException;

public class TextRenderer implements Renderer {
    private Font font;
    private String text;
    private boolean state;
    private Color color;

    public TextRenderer(String text, boolean state) {
        font = new Font("Verdana", Font.BOLD, 20);
        this.text = text;
        this.state = state;
        if (!state){
            color = Color.red;
        }
        else{
            color = Color.white;
        }
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void render(Graphics2D g2d, Vector2 position, Body body, Color color) {
        g2d.setFont(font);
        g2d.setColor(this.color);

        g2d.drawString(text, (int) position.x,(int) position.y);
    }

    public void setText(String text) {
        this.text = text;
    }
}

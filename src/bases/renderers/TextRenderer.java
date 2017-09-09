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

    public TextRenderer(String text, boolean state) {
        font = new Font("Verdana", Font.BOLD, 20);
        this.text = text;
        this.state = state;
    }

    @Override
    public void render(Graphics2D g2d, Vector2 position, Body body, Color color) {
        g2d.setFont(font);
        if(state){
            g2d.setColor(Color.red);
        }else{
            g2d.setColor(Color.white);
        }

        g2d.drawString(text, (int) position.x,(int) position.y);
    }

    public void setText(String text) {
        this.text = text;
    }
}

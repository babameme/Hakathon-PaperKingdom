package bases.renderers;

import org.dyn4j.dynamics.Body;
import org.dyn4j.geometry.Vector2;
import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageRenderer implements Renderer {
    public BufferedImage image;
    private Vector2 anchor;


    public ImageRenderer(BufferedImage image) {
        this.image = image;
        this.anchor = new Vector2(0.5f, 0.5f);
    }

    public void render(Graphics2D g2d, Vector2 position, Body body, Color color) {
        g2d.drawImage(image,
                (int)(position.x - (image.getWidth() * anchor.x)),
                (int)(position.y - (image.getHeight() * anchor.y)),
                null);
    }

    public Vector2 getAnchor() {
        return anchor;
    }
    public static ImageRenderer create(String url){
        return new ImageRenderer(SpriteUtils.loadImage(url));
    }
}

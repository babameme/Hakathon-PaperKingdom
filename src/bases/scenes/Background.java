package bases.scenes;

import bases.GameObject;
import bases.renderers.ImageRenderer;
import org.dyn4j.geometry.Vector2;
import tklibs.SpriteUtils;

public class Background extends GameObject {
    private ImageRenderer imageRenderer;
    float imageHeight;

    public Background() {
        super();
        this.imageRenderer = new ImageRenderer(
                SpriteUtils.loadImage("assets/images/water.png")
        );
        this.imageRenderer.getAnchor().set(0, 1);
        this.position.set(-1200, 414);
//        this.imageHeight = imageRenderer.image.getHeight();
        this.renderer = imageRenderer;
    }

    @Override
    protected void normalUpdate(Vector2 parentPosition) {
        super.normalUpdate(parentPosition);
        position.x += 1.5;
//        if (position.y > imageHeight) {
//            position.y = imageHeight;
//        }

    }
}

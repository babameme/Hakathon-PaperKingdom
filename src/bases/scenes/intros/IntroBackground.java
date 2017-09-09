package bases.scenes.intros;

import bases.GameObject;
import bases.renderers.ImageRenderer;
import bases.settings.Settings;
import org.dyn4j.geometry.Vector2;
import tklibs.SpriteUtils;

public class IntroBackground extends GameObject {
        private ImageRenderer imageRenderer;

        public IntroBackground() {
            super();
            this.imageRenderer = new ImageRenderer(
                    SpriteUtils.loadImage("assets/images/huhu.png")
            );
            this.imageRenderer.getAnchor().set(0, 1);
            this.position.set(0, Settings.instance.getGamePlayHeight());
            this.renderer = imageRenderer;
        }
    }


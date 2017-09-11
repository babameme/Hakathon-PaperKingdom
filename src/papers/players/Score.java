package papers.players;

import bases.FrameCounter;
import bases.GameObject;
import bases.renderers.TextRenderer;
import org.dyn4j.geometry.Vector2;
import papers.players.Player;

import java.awt.*;

public class Score extends GameObject{
    public static int score;
    private FrameCounter frameCounter;
    private TextRenderer textRenderer;
    public Score() {
        super();
        textRenderer = new TextRenderer("SCORE :  ", true);
        textRenderer.setColor(Color.GREEN);
        this.position.set(500, 150);
        this.renderer = textRenderer;
        this.score = 0;
        this.frameCounter = new FrameCounter(60);
    }

    @Override
    protected void normalUpdate(Vector2 parentPosition) {
        super.normalUpdate(parentPosition);
        if (frameCounter.run()) {
            frameCounter.reset();
            score++;
            //System.out.println("in someoneScore");
            if (!Player.getInstance().death)
                textRenderer.setText("SCORE :" + score);
        }
    }
}
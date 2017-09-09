package bases.players;

import bases.FrameCounter;
import bases.GameObject;
import bases.renderers.TextRenderer;
import org.dyn4j.geometry.Vector2;

public class Score extends GameObject{
    private int score;
    private FrameCounter frameCounter;
    private TextRenderer textRenderer;
    public Score() {
        super();
        this.textRenderer = new TextRenderer("SCORE :  ", true);
        this.position.set(500, 50);
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
            textRenderer.setText("SCORE :" + score);
        }
    }
}
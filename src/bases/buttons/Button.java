package bases.buttons;

import bases.GameObject;
import bases.renderers.Renderer;
import org.dyn4j.geometry.Vector2;

public class Button extends GameObject {
    private int type;
    private int currentButton;
    private Renderer play;
    private Renderer quit;

    public Button(int type, int currentButton) {
        super();
        this.type = type;
        this.currentButton = currentButton;
    }

    public void setPlay(Renderer play) {
        this.play = play;
    }

    public void setQuit(Renderer quit) {
        this.quit = quit;
    }

    @Override
    protected void normalUpdate(Vector2 parentPosition) {
        super.normalUpdate(parentPosition);
        if (type == currentButton) {
            this.renderer = quit;
        } else {
            this.renderer = play;
        }
    }

    //    @Override
//    public void run(Vector2 parentPosition) {
//        //System.out.println(type);
//        super.run(parentPosition);
//        //System.out.println(screenPosition);

//        //System.out.println("I am button");
//    }
}

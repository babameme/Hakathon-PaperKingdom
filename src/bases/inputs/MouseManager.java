package bases.inputs;

import org.dyn4j.geometry.Vector2;

import java.awt.event.MouseEvent;

public class MouseManager {
    public Vector2 position;
    public static final MouseManager instance = new MouseManager();
    public static boolean oneClicked;

    private MouseManager() {

    }

    public void mousePressed(MouseEvent e) {
        if(e.getClickCount() == MouseEvent.BUTTON1){
            oneClicked = true;
        }
    }

    public void mouseReleased(MouseEvent e) {
        if(e.getClickCount() == MouseEvent.NOBUTTON){
            oneClicked = false;
        }
    }


    public void mouseClicked(MouseEvent e) {
        if(e.getClickCount() == MouseEvent.BUTTON1){
            oneClicked = true;
        }
    }
}

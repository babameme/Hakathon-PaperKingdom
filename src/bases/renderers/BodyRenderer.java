package bases.renderers;

import bases.settings.Settings;
import org.dyn4j.dynamics.Body;
import org.dyn4j.dynamics.BodyFixture;
import org.dyn4j.geometry.Circle;
import org.dyn4j.geometry.Polygon;
import org.dyn4j.geometry.Shape;
import org.dyn4j.geometry.Vector2;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;

public class BodyRenderer implements Renderer {

    @Override
    public void render(Graphics2D g2d, Vector2 position, Body body, Color color) {

        AffineTransform ot = g2d.getTransform();
        AffineTransform lt = new AffineTransform();

        lt.translate(position.x,
                position.y);

        lt.rotate(body.getTransform().getRotation());
        g2d.transform(lt);

        for (BodyFixture fixture : body.getFixtures()){
            //Graphics2DRenderer.render(g2d, fixture.getShape(), Settings.scale, color);
            if (fixture.getShape() instanceof  Circle) {
                renderShape(g2d, (Circle) fixture.getShape(), color, new Vector2(0, 0));
            }
            else if (fixture.getShape() instanceof Polygon){
                renderShape(g2d, (Polygon) fixture.getShape(), color, new Vector2(0, 0));
            }
        }

        g2d.setTransform(ot);
    }

    void renderShape(Graphics2D g2d, Circle circle, Color color, Vector2 position) {
        double radius = circle.getRadius() * Settings.scale;

        double radius2 = 2.0 * radius;
        Ellipse2D.Double c = new Ellipse2D.Double(
                position.x - radius,
                position.y - radius,
                radius2,
                radius2);
        g2d.setColor(color);
        g2d.fill(c);

    }

    public static final void renderShape(Graphics2D g, Polygon polygon, Color color, Vector2 position) {
        Vector2[] vertices = polygon.getVertices();
        int l = vertices.length;

        // create the awt polygon
        Path2D.Double p = new Path2D.Double();
        Vector2 newP = (new Vector2(vertices[0].x * Settings.scale, vertices[0].y * Settings.scale)).add(position);

        p.moveTo(newP.x, newP.y);
        for (int i = 1; i < l; i++) {
            newP = (new Vector2(vertices[i].x * Settings.scale, vertices[i].y * Settings.scale)).add(position);
            p.lineTo(newP.x, newP.y);
        }
        p.closePath();

        // fill the shape
        g.setColor(color);
        g.fill(p);
    }
}

import java.awt.BasicStroke;
import java.awt.Graphics2D;
public class Gras implements Figure {
    Figure f;

    Gras(Figure _f) {
        f = _f;
    }
    
    @Override
    public void draw(Graphics2D g) {
        g.setStroke(new BasicStroke(5));
        f.draw(g);
    }
}

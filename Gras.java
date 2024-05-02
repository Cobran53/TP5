import java.awt.BasicStroke;
import java.awt.Graphics2D;

public class Gras implements Figure {
    Figure f;
    BasicStroke s;

    Gras(Figure _f) {
        f = _f;
        s = new BasicStroke(5);
    }
    
    @Override
    public void draw(Graphics2D g) {
        g.setStroke(s);
        f.draw(g);
    }
}

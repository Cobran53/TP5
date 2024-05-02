import java.awt.Color;
import java.awt.Graphics2D;

public class ColoredFigure implements Figure {
    Color c;
    Figure f;

    ColoredFigure(Figure _f, Color _c) {
        f = _f;
        c = _c;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(c);
        f.draw(g);
    }
}

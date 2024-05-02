import java.awt.Color;
import java.awt.Graphics2D;

public class ColoredFigure implements Figure {  //on récupère une couleur et une Figure 
    Color c;
    Figure f;

    ColoredFigure(Figure _f, Color _c) {
        f = _f;
        c = _c;
    }

    @Override
    public void draw(Graphics2D g) {    // on applique la couleur puis on trace la figure
        g.setColor(c);
        f.draw(g);
    }
}

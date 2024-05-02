import java.awt.BasicStroke;
import java.awt.Graphics2D;

public class Pointille implements Figure {  //on récupère une figure
    Figure f;

    Pointille(Figure _f) {
        f = _f;
    }
    
    @Override
    public void draw(Graphics2D g) {    //on met la figure en pointillé d'écart 5,5 puis on la trace
        g.setStroke(new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 1, new float[] {5,5}, 0));
        f.draw(g);
    }
    
}

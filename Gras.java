import java.awt.BasicStroke;
import java.awt.Graphics2D;

public class Gras implements Figure {   //on récupère une figure
    Figure f;

    Gras(Figure _f) {
        f = _f;
    }
    
    @Override
    public void draw(Graphics2D g) {    //on met la figure en gras avec une épaisseur (on a défini un gras de largeur 5) puis on la trace
        g.setStroke(new BasicStroke(5));
        f.draw(g);
    }
}

import java.awt.BasicStroke;
import java.awt.Graphics2D;

public class Gras implements Figure {   //on récupère une figure et son épaisseur (on a défini un gras de largeur 5)
    Figure f;
    BasicStroke s;

    Gras(Figure _f) {
        f = _f;
        s = new BasicStroke(5);
    }
    
    @Override
    public void draw(Graphics2D g) {    //on met la figure en gras puis on la trace
        g.setStroke(s);
        f.draw(g);
    }
}

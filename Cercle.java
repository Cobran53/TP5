import java.awt.Graphics2D ;

public class Cercle implements Figure { //on reprend le modèle du rectangle en remplaçant la hauteur et la largeur par le diamètre
    int x  ;
    int y  ;

    int r;

    Cercle(int _x, int _y, int _r){
        x = _x ;
        y = _y ;
        r = _r ;
    }

    public void draw(Graphics2D g){
        g.drawOval(x,y,r,r);    // au lieu de tracer un rectangle, on trace un ovale avec le diamètre pour la hauteur et la largeur de l'ovale ce qui nous donne un cercle
    }
}

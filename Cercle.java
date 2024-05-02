import java.awt.Graphics2D ;

public class Cercle implements Figure {
    int x  ;
    int y  ;

    int r;

    Cercle(int _x, int _y, int _r){
        x = _x ;
        y = _y ;
        r = _r ;
    }

    public void draw(Graphics2D g){
        g.drawOval(x,y,r,r);
    }
}

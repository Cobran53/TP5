import java.awt.Graphics2D;

public class Groupe implements Figure {
    
    Figure a, b;
    Groupe(Figure a, Figure b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw(Graphics2D g) {
        a.draw(g);
        b.draw(g);
    }
}

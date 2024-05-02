import java.awt.Graphics2D;

public class Groupe implements Figure { // le groupe implémente l'interface Figure ce qui fait de lui une Figure aussi
    
    Figure a, b;                        // on recupère 2 figures
    Groupe(Figure a, Figure b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw(Graphics2D g) {    // on les dessine l'une après l'autre
        a.draw(g);
        b.draw(g);
    }
}

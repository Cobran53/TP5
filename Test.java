import javax.swing.* ;
import java.awt.* ;


class MaFenetre extends JFrame {
    MaFenetre(Figure r){
        setSize(320,200+50);
        setContentPane(new Paneau(r)) ;
    }
}





class Paneau extends JPanel {

    Figure p ;

    Paneau(Figure p){
	    this.p=p ;
    }

    @Override
    public void paintComponent (Graphics g){
        if (g instanceof Graphics2D)
            p.draw((Graphics2D) g) ;
        else throw new RuntimeException();
    }
    
}


class Bleu extends ColoredFigure {
    
    Bleu(Figure f) {
        super(f, new Color(0,0,255));
    }
}

class Rouge extends ColoredFigure {
    
    Rouge(Figure f) {
        super(f, new Color(255,0,0));
    }
}


class Test {

    public static void main(String[] args){

        // liste de test pour 4.5
        // 1) on s'attend à avoir un cercle bleu dans un carré bleu, et on a bien ça
        /* new Bleu(
            new Groupe (
                new Rectangle(10, 10, 50, 50), 
                new Cercle(10, 10, 50)
            )
        ) */ 
        // 2) on s'attend à avoir un cercle bleu dans un carré noir, et on a bien ça
        /* new Groupe(
            new Rectangle(10, 10, 50, 50), 
            new Bleu(new Cercle(10, 10, 50))
        ) */ 
        // 3) on s'attend à avoir un cercle bleu dans un carré noir, et on a un cercle bleu dans un carré bleu à la place.
        /* new Groupe(
            new Bleu(new Cercle(10, 10, 50)),
            new Rectangle(10, 10, 50, 50)
        )  */
        // 4) on s'attend à avoir un cercle bleu dans un carré bleu, et on a bien ça
        /* new Rouge(
            new Groupe(
                new Bleu(new Cercle(10, 10, 50)),
                new Rectangle(10, 10, 50, 50)
            )
        ) */

        MaFenetre fen = new MaFenetre(
            new Rouge(
                new Groupe(
                    new Bleu(new Cercle(10, 10, 50)),
                    new Rectangle(10, 10, 50, 50)
                )
            )
        );

        fen.setVisible(true);
        fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}

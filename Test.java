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


class Bleu extends ColoredFigure {  //on définit Bleu une impémentation spéciale de ColoredFigure qui colore en bleu
    
    Bleu(Figure f) {
        super(f, new Color(0,0,255));
    }
}

class Rouge extends ColoredFigure { //on définit Rouge une impémentation spéciale de ColoredFigure qui colore en rouge
    
    Rouge(Figure f) {
        super(f, new Color(255,0,0));
    }
}


class Test {

    public static void main(String[] args){

        // on utilise Rouge et Bleu comme des raccourcis pour new ColoredFigure(..., new Color(0,0,255))

        // liste de tests pour 4.6
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

        // liste de tests pour 4.8
        // 1) on s'attend à avoir un carré rouge normal, et un cercle noir gras. Au final, les deux sont rouges.
        /* new Groupe (
            new Rouge(
                new Rectangle(10, 10, 50, 50)
            ),
            new Gras (
                new Cercle(10, 10, 50)
            )
        ) */
        // 2) on s'attend à avoir un carré rouge normal, et un cercle noir gras. Au final, les deux sont gras.
        /* new Groupe (
            new Gras (
                new Cercle(10, 10, 50)
            ),
            new Rouge(
                new Rectangle(10, 10, 50, 50)
            )
        ) */
        // 3) on s'attend à avoir un carré rouge gras, on a ça
        /* new Gras (
            new Rouge(
                new Rectangle(10, 10, 50, 50)
            )
        ) */
        // 4) on s'attend à avoir un carré rouge gras, on a ça
        /* new Rouge (
            new Gras (
                new Rectangle(10, 10, 50, 50)
            )   
        )  */
        // Les 4 tests du 5.9 :
        /*
        Groupe(Pointillé(Rouge(Cercle)),Rectangle)
        Groupe(Cercle,Pointillé(Bleu(Rectangle)))
        Rouge(Pointillé(Groupe(Cercle,Gras(Rectangle))))
        Gras(Pointillé(Rectangle))
        */  
        // 1) On s'attend à un cercle rouge en pointillé, et un carré noir à ligne entière. Le carré est rouge en pointillé.
        /* new Groupe (
                new Pointille (
                    new Rouge(
                        new Cercle(10, 10, 50)
                    )
                ),
                new Rectangle(10, 10, 50, 50)
            )  */
        // 2) on s'attend à un cercle noir entier, et un carré rouge en pointillé. on a bien ça
        /* new Groupe (
            new Cercle(10, 10, 50),
            new Pointille (
                new Rouge(
                    new Rectangle(10, 10, 50, 50)
                )
            )
        )  */
        // 3) on s'attend à un cercle rouge pointillé et un carré rouge gras pointillé

        MaFenetre fen = new MaFenetre(
            new Gras(
                new Pointille(
                    new Rectangle(10, 10, 50, 50)
                ) 
            )
        );

        fen.setVisible(true);
        fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}

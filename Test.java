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




class Test {

    public static void main(String[] args){

        MaFenetre fen = new MaFenetre(
            new Groupe (
                new Rectangle(10, 10, 50, 50), 
                new Cercle(10, 10, 50)
            )
        );
        
        fen.setVisible(true);
        fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}

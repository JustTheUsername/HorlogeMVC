/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horloge;

import java.awt.Dimension;
import static javax.swing.JFrame.*;

/**
 *
 * @author Formation
 */
public class HORLOGE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Model model = new Model();
      
      Controleur controler = new Controleur(model);
       Fenetre fenetre = new Fenetre(controler);
      
      
      fenetre.setTitle("blah");
      
      fenetre.setLocationRelativeTo(null);
      
      fenetre.setSize(new Dimension(360,480));
      fenetre.setDefaultCloseOperation(EXIT_ON_CLOSE);
      fenetre.setVisible(true);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horloge;

import java.awt.GridLayout;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author Formation
 */
public class Fenetre extends JFrame{


    
    JPanel panel1 = new JPanel();
  static JLabel afficheHeure = new JLabel();
//    JLabel afficheMinute = new JLabel();
//    JLabel afficheSeconde = new JLabel();


    Timer timer = new Timer();
    Controleur controleur;
public Fenetre(Controleur controleur){
     this.controleur = controleur;
     
     timer.schedule(new TimerTask(){
         @Override
         public void run() {
             controleur.updateHeureTotal();
         }
    //    afficheHeure.setText(controleur.getHeures() +" : "+ controleur.getMinutes() + " : "+controleur.getSecondes());    }
     
   
         
    },1000,1000); 
     

panel1.add(afficheHeure);

this.add(panel1);
}

static void update(int heures, int minutes, int secondes) {
          afficheHeure.setText(heures +" : "+ minutes + " : "+secondes);    
 
    }
    
    
    
}

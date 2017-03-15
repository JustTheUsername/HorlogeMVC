/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horloge;

/**
 *
 * @author Formation
 */
public class Controleur {
    
    Model model;
    
    
    public Controleur (Model model){
    
    this.model=model;


    }
    
    public int updateSecondes(){
    
        setSecondes(getSecondes()+1);
        
        return getSecondes();
    
    }
    
    public int updateMinutes(){
    
        setMinutes(getMinutes()+1);
        
    return getMinutes();
    }
    
    public int updateHeures(){
    
        setHeures(getHeures()+1);
        
        return getHeures();
    }
    
    public int getSecondes(){
    
        return this.model.getSecondes();
        
    }
    
    public int getMinutes(){
    
        return this.model.getMinutes();
    
    }
    
    public int getHeures (){
    
        return this.model.getHeures();
    
    }
    
    public void setSecondes(int i){
    
        this.model.setSecondes(i);
        
    }
    
    public void setMinutes (int i){
    
        this.model.setMinutes(i);
        
    }
    
    public void setHeures (int i){
    
        this.model.setHeures(i);
    
    }
    
    public void updateHeureTotal(){
   
        if (this.getHeures() < 24) {
            if (this.getMinutes() < 60) {
                if (this.getSecondes() < 60) {

                    this.updateSecondes();

                }
                this.setSecondes(0);
                this.updateMinutes();

            }
            this.setSecondes(0);
            this.setMinutes(0);
            this.updateHeures();

        }else{
        this.setSecondes(0);
        this.setMinutes(0);
        this.setHeures(0);
        }
        Fenetre.update(this.getHeures(),this.getMinutes(),this.getSecondes());
        }

}

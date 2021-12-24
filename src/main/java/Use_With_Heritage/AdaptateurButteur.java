/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Use_With_Heritage;

/**
 *
 * @author USER-PC
 */
public class AdaptateurButteur extends HJoueur {
    
     private Butteur m_butteur;

    public AdaptateurButteur(Butteur butteur) {
        this.m_butteur=butteur;
    }
    
    public void lacer()
    {
       m_butteur.start();
    }
   
    public void garder(){
    
       m_butteur.keep();
    
    }
}

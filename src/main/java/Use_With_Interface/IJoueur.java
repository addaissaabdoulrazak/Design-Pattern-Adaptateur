/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Use_With_Interface;

/**
 *
 * @author USER-PC
 */
public interface IJoueur {
 
    /*Comportement Génerique*/
    public abstract  void lacer();
   
    public abstract  void garder();
    
   public abstract  String getNom();
            
    public abstract  int getNumero();     
}

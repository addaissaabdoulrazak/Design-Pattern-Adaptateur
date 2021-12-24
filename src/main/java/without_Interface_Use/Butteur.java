/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package without_Interface_Use;

/**
 *
 * @author USER-PC
 */
public class Butteur {
   
     private int B_numero;
     private String B_nom;

    public Butteur(String nom,int num) {
        this.B_numero=num;
        this.B_nom=nom;
    }
    
    public void lacer()
    {
     System.out.println("Notre Butteur lance le Ballon");
    }
    public void garder()
    {
      System.out.println("Le Butteur Garde le Ballon");
    }
    
     @Override
    public String toString()
    {
     return "Le nom de L'attaquant est : "+ this.B_nom+ " il porte le numero "+ this.B_numero;
    }
}

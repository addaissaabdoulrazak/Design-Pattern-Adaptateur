/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desingn_Partern;

/**
 *
 * @author USER-PC
 */
public class Defensseur implements IJoueur{
    private int numero;

    public Defensseur(int num) {
        this.numero=num;
    }
    
    public void lacer()
    {
     System.out.println("Courir => Defenseur");
    }
    public void garder()
    {
      System.out.println("garder => Defensseur");
    }
     public void Afficher()
     {
     System.out.println("je suis le Defensseur numero " + numero);
     }
}

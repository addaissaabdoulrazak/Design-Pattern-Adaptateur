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
public class Attaquant implements IJoueur{
    private int numero;

    public Attaquant(int num) {
        this.numero=num;
    }
    
    public void lacer()
    {
     System.out.println("Courir => Attanquant");
    }
    public void garder()
    {
      System.out.println("Garder => Attaquant");
    } 
     public void Afficher()
     {
     System.out.println("je suis l'Attaquant numero " + numero);
     }
}

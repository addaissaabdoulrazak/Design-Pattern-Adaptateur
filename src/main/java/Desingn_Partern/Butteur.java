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
public class Butteur implements IJoueur {
    private int numero;
    public Butteur(int num)
    {
      this.numero=num;
    } 
    public void lacer()
    {
     System.out.println("Courir => Butteur");
    }
    public void garder()
    {
      System.out.println("garder => Butteur");
    } 
     public void Afficher()
     {
     System.out.println("je suis le Butteur numero " + numero);
     }
}

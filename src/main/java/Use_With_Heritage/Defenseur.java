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
public class Defenseur extends HJoueur{
    private int D_numero;
     private String D_nom;

    public Defenseur(String nom,int num) {
        this.D_numero=num;
        this.D_nom=nom;
    }
    
    public String getNom()
    {
      return D_nom;
    }
    public int getNumero()
    {
      return D_numero;
    }
    
    public void lacer()
    {
     System.out.println("Le defenseur "+D_nom+" lance le Ballon");
    }
    public void garder()
    {
      System.out.println("le Defenseur "+D_nom+" Garde le Ballon");
    }
    
     @Override
    public String toString()
    {
     return "Le nom du defenseur est : "+ this.D_nom+ " il porte le numero "+ this.D_numero+"\n";
    }
}

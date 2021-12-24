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
public class Attaquant implements IJoueur {
      private final int A_numero;
     private final String A_nom;

    public Attaquant(String nom,int num) {
        this.A_numero=num;
        this.A_nom=nom;
    }
    
      @Override
    public String getNom()
    {
      return A_nom;
    }
      @Override
       public int getNumero()
    {
      return A_numero;
    }
    
      @Override
    public void lacer()
    {
     System.out.println("Attanquant "+A_nom +" lance le Ballon");
    }
      @Override
    public void garder()
    {
      System.out.println("Attaquant "+A_nom+" Garde le Ballon");
    }
    
     @Override
    public String toString()
    {
     return "Le nom de L'attaquant est : "+ this.A_nom+ " il porte le numero "+ this.A_numero+"\n";
    }
            
}

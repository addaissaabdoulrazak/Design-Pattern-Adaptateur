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
public class Gardien implements IJoueur{
    private int G_numero;
    private String G_nom;
    public int getNumero()
    {
     return G_numero;
    }
    public String getNom()
    {
     return G_nom;
    }
    public Gardien(String nom,int num) {
        this.G_numero=num;
        this.G_nom=nom;
    }
    
    public void lacer()
    {
     System.out.println("Le Gardien " +G_nom + " lance le Ballon");
    }
    public void garder()
    {
      System.out.println("Le Gardien Garde le Ballon");
    }
    
     @Override
    public String toString()
    {
     return "Le nom du gardien est : "+ this.G_nom +" il porte le numero "+ this.G_numero+"\n";
    }  
    
}

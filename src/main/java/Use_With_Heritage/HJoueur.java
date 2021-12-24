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
public class HJoueur {
    
    protected String J_nom;
    protected int J_numero; 
    protected String J_type;
    
    public String getNom()
    {
      return J_nom;
    }
    
    
    public int getNumero()
    {
      return J_numero;
    }
    public void lacer()
    {
        System.out.println(J_type + J_nom + " numero " +J_numero +" lance le Ballon");
    }
   
    public void garder(){System.out.println(J_type + J_nom + " numero " +J_numero +" Garde le Ballon");}
    
    
}

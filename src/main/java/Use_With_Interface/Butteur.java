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
public class Butteur {
    
    private String B_nom;
    
    private int B_numero;
    
    private int B_nombreBut;
    
    
    public String getNom()
    {
      return B_nom;
    }
    
    public int getNumero()
    {
      return B_numero;
    }
    
    public int getNombreBut()
    {
      return B_nombreBut;
    }       
    
    
    public void start()
    {
        System.out.println("Start; Notre Nouveau Butteur lance le Ballon");
    }
    
    public void keep()
    {
     System.out.println("keep; Notre Nouveau Butteur Garde le Ballon\n");
    }
    
    public void speed(){
    System.out.println("speed  Notre Nouveau Butteur Cours avec le Ballon");}
       
}

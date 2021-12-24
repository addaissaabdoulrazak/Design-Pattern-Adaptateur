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
public class AdaptateurButteur implements IJoueur{
    private final Butteur m_butteur;

    public AdaptateurButteur(Butteur butteur) {
        this.m_butteur=butteur;
    }
    
    @Override
    public void lacer()
    {
     m_butteur.start();
    }
    @Override
    public void garder()
    {
      m_butteur.keep();
    }
    
    public void courir()
    {
     m_butteur.speed();
    }
    
    @Override
    public   String getNom()
    {
      return m_butteur.getNom();
    
    }
            
    @Override
    public   int getNumero(){
      
      return m_butteur.getNumero();
    }
    public int getNombreBut()
    {
     return m_butteur.getNombreBut();
     List<AdaptateurButteur>adda=new arrayList<AdaptateurButteur>();
    }     
    
    
}

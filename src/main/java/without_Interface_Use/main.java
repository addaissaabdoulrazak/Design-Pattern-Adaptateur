/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package without_Interface_Use;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author USER-PC
 */
public class main {
    static Scanner clavier =new Scanner(System.in);
 
public static void main(String[] args)
{
    
    List<Attaquant>listes_attaquant=new Vector<Attaquant>();
    List<Defenseur>listes_defenseur=new Vector<Defenseur>();
    List<Gardien>listes_gardient=new Vector<Gardien>();
    
    char reponse_utilisateur;//global Variable
  
    System.out.println("Saisissez votre Nom");
    String nom_participant;
    nom_participant=clavier.nextLine();
    System.out.println("*********************Bonjour chers Utilisateur "+nom_participant+" *******************************");
    System.out.println();

  do{
   
    System.out.println("voulez vous Jouer O/N ?");
    
    // Character.toUpperCase(s.nextLine().charAt(0));
     
     reponse_utilisateur = clavier.next().charAt(0);
     reponse_utilisateur=Character.toUpperCase(reponse_utilisateur);
    
    //Traitement particulier
  
 
        
        if('O'==reponse_utilisateur)
        {
             int choix_option;
              do{
                System.out.println("***************** Options ***************** ");
                System.out.println(" 1- Pour Ajouter un Attaquant");
                System.out.println(" 2- Pour Ajouter un Defenseur");
                System.out.println(" 3- Pour Ajouter un Gardien");
                System.out.println(" 4- choisir le Type a Lister ");
                System.out.println(" 5- Quitter ");
                //ajouter une instruction(message d'alerte) demandans la confirmation  de l'utilisateur de vouloir quitter
                     
                  choix_option=clavier.nextInt();
                  if(choix_option!=5)
                  {
                      switch(choix_option)
                       {
                         
                    
                          case 1: 
                                String nom_attaquant;
                                  int numero_attaquant;
                              do{
                                    System.out.println("Quelle Nom  voulez vous assigner à votre Attaquant?");
                                    clavier.nextLine();
                                    nom_attaquant=clavier.nextLine();
                                  
                                    System.out.println("Attribuer lui un Numero");
                                    numero_attaquant=clavier.nextInt();
                                    System.out.println("\n");
                                    if(listes_attaquant.size()>0)
                                    {
                                        for(Attaquant value : listes_attaquant)
                                        {
                                            while(value.getNom().equals(nom_attaquant)|| value.getNumero()==numero_attaquant)
                                            { 
                                                if(value.getNumero()==numero_attaquant)
                                                {
                                                
                                                  System.out.println("Deux Attaquant ne peuvent pas avoir un même numero dans une Equipe (NB : Equipe = Tableau Vector)");
                                                  System.out.println("ce qui veut dire que vous avez déja saisis le Numero " +numero_attaquant);
                                                  System.out.println("Ressaisissez un Numero Different S'il vous plait\n");
                                                  numero_attaquant=clavier.nextInt();
                                                }else{
                                                       System.out.println("Deux Attaquant ne peuvent pas avoir le même nom dans une Equipe (NB : Equipe = Tableau Vector)"); 
                                                       System.out.println("ce qui veut dire que vous avez déja saisis le Nom " +nom_attaquant+"\n");
                                                       System.out.print("Ressaisissez un Nom Different S'il vous plait\n");
                                                       nom_attaquant=clavier.next();
                                                    }
                                           }
                                        }
                                    }
                                       Attaquant attaquant=new Attaquant(nom_attaquant, numero_attaquant);
                                       listes_attaquant.add(attaquant);
                                       System.out.println(listes_attaquant.toString());
                                }while(nom_attaquant.equals("") || numero_attaquant<=0 );
                                  /* Ne pas oubliez de gerer les Appel des deux methodes*/
                                  break;
                          case 2:
                                  int numero_defenseur;
                                  String nom_defenseur;
                              do{
                                  System.out.println("Quelle Nom voulez vous assigner à votre Defensseur?");
                                  clavier.nextLine();
                                  nom_defenseur=clavier.nextLine();
                                  System.out.println("Attribuer lui un Numero");
                                  numero_defenseur=clavier.nextInt();
                                  System.out.println("\n");
                                    if(listes_defenseur.size()>0)
                                    {
                                       for(Defenseur value : listes_defenseur)
                                        {
                                            while(value.getNumero()==numero_defenseur ||value.getNom().equals(nom_defenseur))
                                            {
                                                if(value.getNumero()==numero_defenseur)
                                                {
                                                    System.out.println("Deux Defenseur ne peuvent pas avoir un même numero dans une Equipe (NB : Equipe = Tableau Vector)");
                                                    System.out.println("ce qui veut dire que vous avez déja saisis le Numero " +numero_defenseur);
                                                    System.out.println("Ressaisissez un Numero Different S'il vous plait\n");
                                                    numero_defenseur=clavier.nextInt();                                        
                                                }   
                                                 else{
                                                        System.out.println("Deux Defenseur ne peuvent pas avoir le même nom dans une Equipe (NB : Equipe = Tableau Vector)"); 
                                                        System.out.println("ce qui veut dire que vous avez déja saisis le Nom " +nom_defenseur+"\n");
                                                        System.out.print("Ressaisissez un Nom Different S'il vous plait\n");
                                                        nom_defenseur=clavier.next();
                                                    }  
                                            }
                                        }
                                   }
                                    
                                     Defenseur defenseur=new Defenseur(nom_defenseur, numero_defenseur);
                                     listes_defenseur.add(defenseur);
                                }while(numero_defenseur<=0);
                                  break;
                          case 3: 
                                  String nom_gardient;
                                  int numero_gardient;
                              do{
                                   System.out.println("Quelle Nom voulez vous assigner à votre Gardien?"); 
                                   clavier.nextLine();
                                   nom_gardient=clavier.nextLine(); 
                                   System.out.println("Attribuer lui un Numero"); 
                                   numero_gardient=clavier.nextInt();
                                   System.out.println();
                                   if(listes_gardient.size()>0)
                                    {
                                      for(Gardien value : listes_gardient)
                                      {
                                        while(value.getNumero()==numero_gardient || value.getNom().equals(nom_gardient))
                                        {
                                            if(value.getNumero()==numero_gardient)
                                            {
                                             System.out.println("Deux gardien ne peuvent pas avoir un même numero dans une Equipe (NB : Equipe = Tableau Vector)");
                                             System.out.println("ce qui veut dire que vous avez déja saisis le Numero " +numero_gardient);
                                             System.out.println("Ressaisissez un Numero Different S'il vous plait\n");
                                             numero_gardient=clavier.nextInt();
                                            }
                                            else{
                                             System.out.println("Deux gardien ne peuvent pas avoir le même nom dans une Equipe (NB : Equipe = Tableau Vector)"); 
                                             System.out.println("ce qui veut dire que vous avez déja saisis le Nom " +nom_gardient+"\n");
                                             System.out.print("Ressaisissez un Nom Different S'il vous plait\n");
                                             nom_gardient=clavier.next();
                                            }  
                                        }
                                      }
                                    }
                                   Gardien gardien=new Gardien(nom_gardient, numero_gardient);
                                   listes_gardient.add(gardien);
                                   System.out.println(listes_gardient.toString());
                               }while(numero_gardient <= 0 || nom_gardient.equals(""));
                                   break;
                          case 4:
                              //
                                char var_lister;
                              do{
                                System.out.println("************ Quel Type voulez vous Lister ***********");
                                System.out.println(" A-Lister les Attaquants");
                                System.out.println(" B-Lister les Defenseurs");
                                System.out.println(" C-Lister les Gardien");
                                System.out.println(" D-Revenir en Arrière(Pour Lister)");
                                 var_lister=clavier.next().charAt(0);
                                 var_lister=Character.toUpperCase(var_lister);
                            if(var_lister!='D')
                            {        
                                switch(var_lister)
                                {
                                    case 'A':
                                        if(listes_attaquant.isEmpty())
                                        {
                                            System.out.println("Impossible de lister les Attaquant,quittez, Ajouter d'abord des Attaquants dans votre Equipe puis lister");
                                        }else{
                                         for(Attaquant value : listes_attaquant)
                                         {
                                           value.garder();
                                           value.lacer();
                                         
                                         }
                                        
                                        }
                                        break;
                                    case 'B':
                                             if(listes_defenseur.isEmpty())
                                             {
                                               System.out.println("Impossible de lister les Defenseur,quittez, Ajouter d'abord des Defenseur dans votre Equipe puis lister");
                                             }else{
                                                    for(Defenseur value : listes_defenseur)
                                                    {
                                                       value.garder();
                                                       value.lacer();
                                                    
                                                    }
                                             }
                                             break;
                                    case 'C':
                                              if(listes_gardient.isEmpty())
                                              {
                                                System.out.println("Impossible de lister les Gardien,quittez, Ajouter d'abord des Attaquants dans votre Equipe puis lister");

                                              }
                                              else{
                                                    for(Gardien value : listes_gardient)
                                                    {
                                                       value.garder();
                                                       value.lacer();
                                                    
                                                    }
                                              }
                                              break;
                                    default: System.out.println("Votre choix est Invalide");
                                }
                            }
                              
                              }while(var_lister!='D');
                              
                              //
                              break;
                          default: 
                              System.out.println("Votre choix est Incorrect");         
                          break;
                       }
                      }  
                    }while(choix_option!=5);
        }
    }while(reponse_utilisateur=='O');

    System.out.println("Au revoir " +nom_participant);}
}

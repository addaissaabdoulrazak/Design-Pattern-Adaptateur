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
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
public class MainHJoueur {
static Scanner clavier =new Scanner(System.in);
 
public static void main(String[] args)
{
    
    List<HJoueur>listes_de_tout_les_joueur=new Vector<HJoueur>();
    
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
    
        if('O'==reponse_utilisateur)
        {
             int choix_option;
              do{
                System.out.println("***************** Options ***************** ");
                System.out.println(" 1- Pour Ajouter un Joueur");
                System.out.println(" 2- Pour Lister Les Joueurs");
                System.out.println(" 3- Pour Quitter ");
               
                     
                  choix_option=clavier.nextInt();
                  if(choix_option!=3)
                  {
                       switch(choix_option)
                       {
                         
                    
                          case 1: 
                 
                                  String nom_joueur;
                                  int numero_joueur;
                                  int choix_du_type_joueur;
                          do{
                                    System.out.println("Quel Type de joueurs Voulez Vous Ajoutez ?");
                                    System.out.println(" 1- Pour Ajouter un Attaquant");
                                    System.out.println(" 2- Pour Ajouter un Defenseur");
                                    System.out.println(" 3- Pour Ajouter un Gardien");
                                    System.out.println(" 4- Ajouter un Nouveau Type(Butteur) par extension");
                                    System.out.println(" 5- Revenir En Arrière(Pour Lister)");
                                    clavier.nextLine();
                                  choix_du_type_joueur=clavier.nextInt();
                               if(choix_du_type_joueur!=5)
                                {
                                    switch(choix_du_type_joueur)
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
                                                    if(listes_de_tout_les_joueur.size()>0)
                                                    {
                                                      for(HJoueur value : listes_de_tout_les_joueur)
                                                      {
                                                        while(value.getNumero()==numero_attaquant)
                                                        { 
                                                         System.out.println("Deux Joueur ne peuvent pas avoir un même numero dans une Equipe (NB : Equipe = Tableau Vector)");
                                                         System.out.println("ce qui veut dire que vous avez déja saisis le Numero " +numero_attaquant);
                                                         System.out.println("Ressaisissez un Numero Different S'il vous plait\n");
                                                           numero_attaquant=clavier.nextInt();
                                                        }
                                                       }
                                                    }
                                                        Attaquant attaquant=new Attaquant(nom_attaquant, numero_attaquant);
                                                        listes_de_tout_les_joueur.add(attaquant);
                                                        
                                            }while(nom_attaquant.equals("") || numero_attaquant<=0 );
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
                                  
                                                    if(listes_de_tout_les_joueur.size()>0)
                                                    {
                                                       for(HJoueur value : listes_de_tout_les_joueur)
                                                        {
                                                            while(value.getNumero()==numero_defenseur)
                                                            {
                                                                    System.out.println("Deux Joueur ne peuvent pas avoir un même numero dans une Equipe (NB : Equipe = Tableau Vector)");
                                                                    System.out.println("ce qui veut dire que vous avez déja saisis le Numero " +numero_defenseur);
                                                                    System.out.println("Ressaisissez un Numero Different S'il vous plait\n");
                                                                    numero_defenseur=clavier.nextInt();                                        

                                                            }
                                                        }
                                                   }

                                                    Defenseur defenseur=new Defenseur(nom_defenseur, numero_defenseur);
                                                    listes_de_tout_les_joueur.add(defenseur);
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
                                                     if(listes_de_tout_les_joueur.size()>0)
                                                      {
                                                        for(HJoueur value : listes_de_tout_les_joueur)
                                                        {
                                                          while(value.getNumero()==numero_gardient)
                                                          {
                                                              if(value.getNumero()==numero_gardient)
                                                              {
                                                               System.out.println("Deux Joueur ne peuvent pas avoir un même numero dans une Equipe (NB : Equipe = Tableau Vector)");
                                                               System.out.println("ce qui veut dire que vous avez déja saisis le Numero " +numero_gardient);
                                                               System.out.println("Ressaisissez un Numero Different S'il vous plait\n");
                                                               numero_gardient=clavier.nextInt();
                                                              }    
                                                          }
                                                        }
                                                      }
                                                     Gardien gardien=new Gardien(nom_gardient, numero_gardient);
                                                     listes_de_tout_les_joueur.add(gardien);
                                           }while(numero_gardient <= 0 || nom_gardient.equals(""));
                                           break;
                                           
                                             //Ajout par extension            
                                       case 4:  
                                               listes_de_tout_les_joueur.add(new AdaptateurButteur(new Butteur()));
                                               System.out.println("Ajouter Avec Succes\n");
                                                   break;
                                                    // Fin           
                                     default: System.out.println("votre Choix est Invalid!!!"); 
                                            break;
                                }
                            } 
                               
                             
                        }while(choix_du_type_joueur!=5);
                             break;
                          case 2:   
                              int i=1;
                              if(!listes_de_tout_les_joueur.isEmpty()){
                              for(HJoueur value : listes_de_tout_les_joueur)
                              {
                                  System.out.println( "\n "+i+" :"+" je suis un "+ value.getClass().getSimpleName()+ " \n" ); 
                                  value.garder();
                                   System.out.println("\n");
                                  value.lacer();
                              i++;
                              }
                            }else{
                              System.out.println("pour Lister il faut Obligatoirement Ajouter Au moins un  Joueur dans L'effectif !!\n");
                              }
                    }
                }

              }while(choix_option!=3);
        }
       
        }while(reponse_utilisateur=='O');
     
   System.out.println("Au revoir " +nom_participant);
}
}

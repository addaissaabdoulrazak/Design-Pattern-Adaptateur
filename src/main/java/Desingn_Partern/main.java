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
//Ceci importe la classe Scanner du package java.util
import java.util.Scanner; 
//Ceci importe toutes les classes du package java.util
import java.util.*;
public class main {
    public static void main(String[] args)
    {
        /*int choix_utilisateur=0;
      
        IJoueur variable =null;
        
        System.out.println("choisissez 1 pour un Attaquant");
        System.out.println("choisissez 2 pour un Deffensseur");
        System.out.println("choisissez 3 pour un Butteur");
        
        //Colection
        List<IJoueur> liste=new ArrayList<IJoueur>();
        liste.add(new Butteur(1));
        liste.add(new Defensseur(1));
        liste.add(new Attaquant(1));
        liste.add(new Butteur(2));
        liste.add(new Defensseur(2));
        liste.add(new Attaquant(2));
        liste.add(new Butteur(10));
        liste.add(new Defensseur(4));
        liste.add(new Attaquant(22));
        //
          Scanner sc = new Scanner(System.in);
          choix_utilisateur=sc.nextInt();
          switch(choix_utilisateur)
          {
              case 1: if(variable==null){     
                variable=new Butteur(1);
               System.out.println("Votre Butteur est Creer que Voulez vous faire lancer ou garger");
                System.out.println("1 pour lancer\n"+ "2 pour garder\n"+ "Faite un Choix");
                int choixButteur=0;
                choixButteur=sc.nextInt();
                if(choixButteur==1)
                {
                 variable.lacer();
                }else{
                  variable.garder();
                }
              }
                 case 2: if(variable==null){     
                variable=new Defensseur(1);
               System.out.println("Votre defensseur est Creer que Voulez vous faire lancer ou garger");
                System.out.println("1 pour lancer\n"+ "2 pour garder\n"+ "Faite un Choix");
                int choixDefensseur=0;
                choixDefensseur=sc.nextInt();
                if(choixDefensseur==1)
                {
                 variable.lacer();
                }else{
                  variable.garder();
                }
              }
                   case 3: if(variable==null){     
                variable=new Attaquant(1);
               System.out.println("Votre Attaquant est Creer que Voulez vous faire lancer ou garger");
                System.out.println("1 pour lancer\n"+ "2 pour garder\n"+ "Faite un Choix");
                int choix=0;
                choix=sc.nextInt();
                if(choix==1)
                {
                 variable.lacer();
                }else{
                  variable.garder();
                }
              }
            System.out.println("Affichage des element de la collection");
             for(IJoueur valeur : liste)
             {
                 valeur.Afficher();
             }
          }
        */
        
        String prenom = new String();
//Pas besoin d'initialiser : on entre au moins une fois dans la boucle !
char reponse = ' ';

Scanner sc = new Scanner(System.in);

do{
  System.out.println("Donnez un prénom : ");
  prenom = sc.nextLine();
  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");

  do{
    System.out.println("Voulez-vous réessayer ? (O/N)");
    reponse = sc.nextLine().charAt(0);
  }while(reponse != 'O' && reponse != 'N');

}while (reponse == 'O');

System.out.println("Au revoir…");
    }
}

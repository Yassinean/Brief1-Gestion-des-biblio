package src.presentation;

import java.util.Scanner;

import src.metier.Bibliotheque;
import src.metier.Livre;
import src.metier.Magazine;

public class ConsoleUI {
    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque();

        Scanner scan = new Scanner(System.in);
        int choix;

        do {
            System.out.println("/********** Gestion des bibliotheque **********/ \n\n");
            System.out.println("1. Ajouter un document");
            System.out.println("2. Emprunter un document");
            System.out.println("3. Retourner un document");
            System.out.println("4. Afficher tous les documents");
            System.out.println("5. Rechercher un document");
            System.out.println("6. Quitter \n\n");

            System.out.println("Veuillez entrer votre choix (1-6) :");

            choix = scan.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Quel type de voulez vous ajouter \n 1.Livre  ##  2.Magazine");
                    int switchDoc = scan.nextInt();
                    switch (switchDoc) {
                        case 1:
                            System.out.println("Veuillez saisir ID du livre : ");
                            int idLivre = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Veuillez saisir le titre du livre : ");
                            String titreL = scan.nextLine();
                            System.out.println("Veuillez saisir l'auteur du livre : ");
                            String auteurL = scan.nextLine();
                            System.out.println("Veuillez saisir le nombre de page du livre : ");
                            int nbrePageL = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Veuillez saisir la date du publication du livre : ");
                            String datePubL = scan.nextLine();
                            System.out.println("Veuillez saisir Isbn du livre : ");
                            String isbn = scan.nextLine();

                            Livre livre = new Livre(idLivre, titreL, auteurL, datePubL, nbrePageL, isbn);
                            livre.ajouter();
                            break;
                        case 2:
                            System.out.println("Veuillez saisir ID du magazine : ");
                            int idMagazine = scan.nextInt();
                            System.out.println("Veuillez saisir le titre du magazine : ");
                            String titreM = scan.nextLine();
                            System.out.println("Veuillez saisir l'auteur du magazine : ");
                            String auteurM = scan.nextLine();
                            System.out.println("Veuillez saisir le nombre de page du magazine : ");
                            int nbrePageM = scan.nextInt();
                            System.out.println("Veuillez saisir la date du mublication du magazine : ");
                            String datePubM = scan.nextLine();
                            System.out.println("Veuillez saisir Isbn du magazine : ");
                            int numero = scan.nextInt();

                            Magazine magazine = new Magazine(idMagazine, titreM, auteurM, datePubM, nbrePageM, numero);
                            magazine.ajouter();
                            break;

                        default:
                            break;
                    }
                    break;

                default:
                    break;
            }

        } while (choix < 6);
    }
}
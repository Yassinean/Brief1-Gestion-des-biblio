package src.presentation;

import java.util.Scanner;
import src.metier.Bibliotheque;
import src.metier.Livre;
import src.metier.Magazine;
import src.utilitaire.DateUtils;

public class ConsoleUI {
    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque();
        Scanner scan = new Scanner(System.in);
        int choix;

        do {
            System.out.println("/********** Gestion de la bibliothèque **********/ \n\n");
            System.out.println("1. Ajouter un document");
            System.out.println("2. Emprunter un document");
            System.out.println("3. Retourner un document");
            System.out.println("4. Afficher tous les documents");
            System.out.println("5. Rechercher un document");
            System.out.println("6. Quitter \n\n");

            choix = getIntInput(scan, "Veuillez entrer votre choix (1-6) : ");

            switch (choix) {
                case 1:
                    int switchDoc = getIntInput(scan,
                            "Quel type de document voulez-vous ajouter ?\n 1. Livre  ##  2. Magazine: ");
                    switch (switchDoc) {
                        case 1:
                            int idLivre = getIntInput(scan, "Veuillez saisir l'ID du livre : ");
                            String titreL = getStringInput(scan, "Veuillez saisir le titre du livre : ");
                            String auteurL = getStringInput(scan, "Veuillez saisir l'auteur du livre : ");
                            int nbrePageL = getIntInput(scan, "Veuillez saisir le nombre de pages du livre : ");
                            String datePubL = getDateInput(scan,
                                    "Veuillez saisir la date de publication du livre (dd/MM/yyyy) : ");
                            String isbn = getStringInput(scan, "Veuillez saisir l'ISBN du livre : ");

                            Livre livre = new Livre(idLivre, titreL, auteurL, datePubL, nbrePageL, isbn);
                            bibliotheque.AjouterDocument(livre);
                            System.out.println("Livre " + titreL + " ajouté avec succès.");
                            break;
                        case 2:
                            int idMagazine = getIntInput(scan, "Veuillez saisir l'ID du magazine : ");
                            String titreM = getStringInput(scan, "Veuillez saisir le titre du magazine : ");
                            String auteurM = getStringInput(scan, "Veuillez saisir l'auteur du magazine : ");
                            int nbrePageM = getIntInput(scan, "Veuillez saisir le nombre de pages du magazine : ");
                            String datePubM = getDateInput(scan,
                                    "Veuillez saisir la date de publication du magazine (dd/MM/yyyy) : ");
                            int numero = getIntInput(scan, "Veuillez saisir le numéro du magazine : ");

                            Magazine magazine = new Magazine(idMagazine, titreM, auteurM, datePubM, nbrePageM, numero);
                            bibliotheque.AjouterDocument(magazine);
                            System.out.println("Magazine ajouté avec succès.");
                            break;
                        default:
                            System.out.println("Choix incorrect.");
                            break;
                    }
                    break;
                case 2:
                    int titreEmprunt = getIntInput(scan, "Veuillez saisir l'ID du document à emprunter : ");
                    bibliotheque.EmprunterDocument(titreEmprunt);
                    break;
                case 3:
                    int idRetour = getIntInput(scan, "Veuillez saisir l'ID du document à retourner : ");
                    bibliotheque.RetournerDocument(idRetour);
                    break;
                case 4:
                    bibliotheque.AfficherDocument();
                    ;
                    break;
                    case 5:
                    String titreRech = getStringInput(scan, "Tapez le titre du document que vous voulez chercher : ");
                    bibliotheque.RechercherDocument(titreRech);
                    break;
                case 6:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix incorrect, veuillez réessayer.");
                    break;
            }
        } while (choix != 6);

        scan.close();
    }

    private static int getIntInput(Scanner scan, String prompt) {
        int input;
        while (true) {
            System.out.print(prompt);
            if (scan.hasNextInt()) {
                input = scan.nextInt();
                scan.nextLine(); // Consommer la nouvelle ligne restante
                break;
            } else {
                System.out.println("Entrée invalide. Veuillez entrer un nombre entier.");
                scan.next(); // Consommer l'entrée invalide
            }
        }
        return input;
    }

    private static String getStringInput(Scanner scan, String prompt) {
        System.out.print(prompt);
        return scan.nextLine();
    }

    private static String getDateInput(Scanner scan, String prompt) {
        String date;
        while (true) {
            System.out.print(prompt);
            date = scan.nextLine();
            if (DateUtils.isValidDate(date)) {
                break;
            } else {
                System.out.println("Format de date invalide. Veuillez entrer une date au format dd/MM/yyyy.");
            }
        }
        return date;
    }
}

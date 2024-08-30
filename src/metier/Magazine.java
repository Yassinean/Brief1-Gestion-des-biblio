package src.metier;

import java.time.LocalDate;

public class Magazine extends Document {
    private int numero;

    public Magazine(int id, String titre, String auteur, LocalDate datePublication, int nombreDePages, int numero) {
        super(id, titre, auteur, datePublication, nombreDePages);
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int num){
        this.numero = num;
    }

    @Override
    public void emprunter() {
        System.out.println("^^^^^^^^^ Le magazine '" + titre + "' a été emprunté. ^^^^^^^^^");
    }

    @Override
    public void retourner() {
        System.out.println("^^^^^^^^^ Le magazine '" + titre + "' a été retourné. ^^^^^^^^^");
    }

    @Override
    public void afficherDetails() {
        System.out.println("Magazine [Numéro=" + numero + ", Titre=" + titre + ", Auteur=" + auteur + 
                           ", Date de publication=" + datePublication + ", Pages=" + nombreDePages + "]");
    }
}

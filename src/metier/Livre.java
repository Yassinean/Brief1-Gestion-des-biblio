package src.metier;

public class Livre extends Document {
    private String isbn;

    public Livre(String titre, String auteur, String datePublication, int nombreDePages, String isbn) {
        super(titre, auteur, datePublication, nombreDePages);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String toString() {
        return "Livre \n [ id : " + super.getId() +" ISBN=" + isbn + ", Titre=" + titre + ", Auteur=" + auteur +
                ", Date de publication=" + datePublication + ", Pages=" + nombreDePages + "]";
    }

    @Override
    public void emprunter() {
        System.out.println("^^^^^^^^^ Le livre :" + titre + " a été emprunté avec succes. ^^^^^^^^^");
    }

    @Override
    public void retourner() {
        System.out.println("^^^^^^^^^ Le livre :" + titre + " a été retourné avec succes. ^^^^^^^^^");
    }

    @Override
    public void afficherDetails() {
        System.out.println("Livre \n [ISBN=" + isbn + ", Titre=" + titre + ", Auteur=" + auteur +
                ", Date de publication=" + datePublication + ", Pages=" + nombreDePages + "]");
    }

}

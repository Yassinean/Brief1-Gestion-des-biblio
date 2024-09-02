package src.metier;


public class Magazine extends Document {
    private int numero;

    public Magazine(int id, String titre, String auteur, String datePublication, int nombreDePages, int numero) {
        super(id, titre, auteur, datePublication, nombreDePages);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int num) {
        this.numero = num;
    }

    public String toString(){
        return "Magazine \n[Numéro=" + numero + ", Titre=" + titre + ", Auteur=" + auteur +
                ", Date de publication=" + datePublication + ", Pages=" + nombreDePages + "]";
    }
    
    @Override
    public void emprunter() {
        System.out.println("^^^^^^^^^ Le magazine " + titre + " a été emprunté avec succes. ^^^^^^^^^");
    }

    @Override
    public void retourner() {
        System.out.println("^^^^^^^^^ Le magazine " + titre + " a été retourné avec succes. ^^^^^^^^^");
    }

    @Override
    public void afficherDetails() {
    }
}

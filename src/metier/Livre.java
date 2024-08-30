package src.metier;


public class Livre extends Document {
   private String isbn ;

    public Livre(int id, String titre, String auteur, String datePublication, int nombreDePages, String isbn) {
        super(id, titre, auteur, datePublication, nombreDePages);
        this.isbn = isbn;
    }

    public String getIsbn(){
        return isbn;
    }    

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    
    @Override
    public void emprunter() {
        System.out.println("^^^^^^^^^ Le livre '" + titre + "' a été emprunté. ^^^^^^^^^");
    }

    @Override
    public void retourner() {
        System.out.println("^^^^^^^^^ Le livre '" + titre + "' a été retourné. ^^^^^^^^^");
    }

    @Override
    public void afficherDetails() {
        System.out.println("Livre [ISBN=" + isbn + ", Titre=" + titre + ", Auteur=" + auteur + 
                           ", Date de publication=" + datePublication + ", Pages=" + nombreDePages + "]");
    }

}

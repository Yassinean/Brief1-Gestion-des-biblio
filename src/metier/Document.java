package src.metier;
import java.time.LocalDate;

public abstract class Document {
    protected int id;
    protected String titre;
    protected String auteur;
    protected LocalDate datePublication;
    protected int nombreDePages;

    public Document(int id, String titre, String auteur, LocalDate datePublication, int nombreDePages) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.datePublication = datePublication;
        this.nombreDePages = nombreDePages;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTitre(){
        return titre;
    }

    public void setTitre(String titre){
        this.titre = titre;
    }
    
    public String getAuteur(){
        return auteur;
    }

    public void setAuteur(String auteur){
        this.auteur = auteur;
    }

    public int getNombreDePages(){
        return nombreDePages;
    }

    public void setNombreDePages(int nombreDePages){
        this.nombreDePages = nombreDePages;
    }

    public LocalDate getDate(){
        return datePublication;
    }

    public void setDate(LocalDate datePublication){
        this.datePublication = datePublication;
    }

    public abstract void emprunter();
    public abstract void retourner();
    public abstract void afficherDetails();
}

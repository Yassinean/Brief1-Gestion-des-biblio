package src.metier;

public abstract class Document {
    private int id;
    protected String titre;
    protected String auteur;
    protected String datePublication;
    protected int nombreDePages;
    protected boolean isEmprunted = false;

    public Document(String titre, String auteur, String datePublication, int nombreDePages) {
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

    public String getDate(){
        return datePublication;
    }

    public void setDate(String datePublication){
        this.datePublication = datePublication;
    }

    public boolean getIsEmprunted(){
        return isEmprunted;
    }

    public void setIsEmprunted(boolean isEmprunted){
        this.isEmprunted = isEmprunted;
    }

    public abstract void emprunter();
    public abstract void retourner();
    public abstract void afficherDetails();
}

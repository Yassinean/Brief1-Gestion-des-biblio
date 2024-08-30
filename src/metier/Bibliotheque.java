package src.metier;

import java.util.ArrayList;
import java.util.HashMap;


public class Bibliotheque {
    ArrayList<Document> documents = new ArrayList<Document>();
    HashMap<Document,String> searchDocs = new HashMap<Document,String>();

    public void AjouterDocument(Document document){
        documents.add(document);
        System.out.println("Document ajoute avec succes");
    }

    public void EmprunterDocument(Document document){
        boolean isNotEmprunted = document.getIsEmprunted();
        for (Document doc : documents) {
            if (isNotEmprunted) {
                document.setIsEmprunted(true);
                System.out.println("Votre Document est emprunte avec succes");
            }else 
                System.out.println("Ce document est emprunte");
        }
    }

    public void RetournerDocument(Document document){
        document.setIsEmprunted(false);
        System.out.println("Document est retourne");
    }

    public void RechercheDocument(String document){
        for(Document doc : documents){
            if (doc.getTitre() == document) {
                System.out.println("Le documenr a recherche est : " + searchDocs.get(document));
            }
        }
    }


}

package src.metier;

import java.util.ArrayList;
import java.util.HashMap;

public class Bibliotheque {
    ArrayList<Document> documents;
    HashMap<String,Document> searchDocs;

    public Bibliotheque() {
        this.documents = new ArrayList<Document>();
        this.searchDocs = new HashMap<String,Document>();
    }

    public void AjouterDocument(Document document) {
        documents.add(document);
        searchDocs.put(document.titre, document);
        System.out.println("Document " + document.titre + " ajoute avec succes");
    }

    public void EmprunterDocument(int id) {
        Document doc = documents.get(id);
        if (doc.getIsEmprunted() == false || doc == null) {
            doc.emprunter();
            doc.setIsEmprunted(true);
        } else if (doc.getIsEmprunted() == true) {
            System.out.println("Desole ! Ce document est deja emprunte , vous pouvez pas l'emprunter");
        } else
            System.out.println("Ce document de ID " + doc.id + " n'exist pas");
    }

    public void RetournerDocument(int id) {
        Document doc = documents.get(id);
        if (doc.getIsEmprunted() == true) {
            doc.retourner();
            doc.setIsEmprunted(false);
        } else
            System.out.println("Ce document " + doc.id + " n'exist pas");
    }

    public void RechercherDocument(String titre) {
        Document doc = searchDocs.get(titre);
        if (doc == null) {
            System.out.println("Ce document n'existe pas.");
        } else {
            System.out.println("Le document recherché est :");
            doc.afficherDetails();
        }
    }

    public void AfficherDocument() {
        for (Document doc : documents) {
            System.out.println(doc);
        }
    }

}


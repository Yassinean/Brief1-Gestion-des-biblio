package src.metier;

import java.util.ArrayList;
import java.util.HashMap;

public class Bibliotheque {
    ArrayList<Document> documents;
    HashMap<String, Document> searchDocs;

    protected int count = 1;

    public Bibliotheque() {
        this.documents = new ArrayList<Document>();
        this.searchDocs = new HashMap<String, Document>();
    }

    public void AjouterDocument(Document document) {
        document.setId(count);
        documents.add(document);
        searchDocs.put(document.titre, document);
        count++;
    }

    public void EmprunterDocument(int id) {
        // Document doc = documents.get(id);
        for (Document docs : documents) {
            if (!docs.getIsEmprunted() && docs.getId() == id) {
                docs.emprunter();
                docs.setIsEmprunted(true);
            } else if (docs.getIsEmprunted() == true && docs.getId() == id) {
                System.out.println("Desole ! Ce document est deja emprunte , vous pouvez pas l'emprunter");
            } else
                System.out.println("Ce document de n'exist pas");
        }
    }

    public void RetournerDocument(int id) {
        Document doc = documents.get(id);
        if (doc.getIsEmprunted() == true) {
            doc.retourner();
            doc.setIsEmprunted(false);
        } else
            System.out.println("Ce document " + doc.getId() + " n'exist pas");
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

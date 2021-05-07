import java.util.ArrayList;

public class Bibliotheque{
    private ArrayList<Document> docs = new ArrayList<>();
    private String nom;
    private int capacite;
    public Bibliotheque(String nom, int capacite){
        this.nom = nom;
        this.capacite = capacite;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void findDocuments(){
        for(Document doc: docs){
            System.out.println(doc.toString());
            //System.out.println(doc.getTitre());
        }
    }
    public String findDocumentByTitre(String titre){
        for(Document doc : docs){
            if(doc.getTitre() == titre){
                System.out.println(doc.toString());
                return "";
            }
        }
        System.out.println("Votre recherche est introuvable !");
        return titre;
    }
    public void addDocuments(Document doc){
        docs.add(doc);
    }
}
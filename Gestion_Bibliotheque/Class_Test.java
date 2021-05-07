//30import java.util.ArrayList;

public class Class_Test{
    public static void main(String [] args){
        Document livre1 = new Livre("Khaly","La vie",256);
        Document livre2 = new Livre("Afiss","La sagesse",200);
        
        Document roman1 = new Roman("Joua","Dora",25);
        Document roman2 = new Roman("Amina","Les fleurs",186);

       // ArrayList<Document> docs = new ArrayList<>();
        Bibliotheque bio = new Bibliotheque("Central",25);

        bio.addDocuments(livre1);
        bio.addDocuments(livre2);

        bio.addDocuments(roman1);
        bio.addDocuments(roman2);

        bio.findDocuments();
    }
}

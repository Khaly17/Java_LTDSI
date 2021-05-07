public class Livre extends Document{
    private int nombre_page;
    Livre(String auteur,String titre, int nombre_page){
        super(auteur,titre);
        this.nombre_page = nombre_page;
    }

    public String toString(){
        return "Numero : "+this.num+" Auteur : "+this.auteur+" Titre : "+this.titre+" Nombre de Page"+this.nombre_page;
    }
}
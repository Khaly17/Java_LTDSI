public class Roman extends Document{
    private double prix;
    Roman(String auteur,String titre,double prix){
        super(auteur,titre);
        this.prix = prix;
        this.auteur = auteur;
    }
    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String toString(){
        return "Numero : "+this.num+" Auteur : "+this.auteur+" Titre : "+this.titre+" Prix : "+this.prix;
    }
}
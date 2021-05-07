abstract class Document{
    protected int num;
    protected String auteur;
    protected String titre;

    protected static int comp = 0;
    Document(String auteur,String titre){
        this.num = ++comp;
        this.auteur = auteur;
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}
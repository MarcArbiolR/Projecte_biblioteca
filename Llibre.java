public class Llibre {

    // ATRIBUTS DE LA CLASSE
    private String titol;
    private String autor;
    private boolean prestat;

    // CONSTRUCORS DE LA CLASSE
    // Constructor de la classe que rep tots els atributs de la classe.
    public Llibre(String titol, String autor) {
        this.titol = titol;
        this.autor = autor;
        this.prestat = false;
    }
}

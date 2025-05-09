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

    // MÈTODES GETTERS
        // Mètode getTitol
        public String getTitol() {
            return titol;
        }
        // Métode getAutor.
        public String getAutor() {
            return autor;
        }
    
    // MÉTODES AUXILIARS DE LA CLASSE 
        // Métode esPrestat.
        public boolean esPrestat() {
            return prestat;
        }
        // Métode prestar.
        public void prestar() {
            prestat = true;
        }
        // Métode retornar.
        public void retornar() {
            prestat = false;
        }
    
    // MÉTODES REDIFINITS DE LA CLASSE OBJECT.
    @Override
    public String toString() {
        return titol + " de " + autor + (prestat ? " (En préstec)" : " (Disponible)");
    }
}

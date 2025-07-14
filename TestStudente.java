public class TestStudente {
    public static void main(String[] args) {
        // Creazione di un oggetto Studente
        Studente studente1 = new Studente("Anselmo", "Bitta", 24);
        
        // Stampa delle informazioni dello studente
        System.out.println(studente1.getInfo());
        
        // Creazione di un altro studente per test
        Studente studente2 = new Studente("Mario", "Rossi", 22);
        System.out.println(studente2.getInfo());
    }
}
/**
 * Classe che rappresenta un registro di studenti.
 * Utilizza un array per memorizzare oggetti Studente e fornisce
 * metodi per gestire il registro degli studenti.
 */
public class RegistroStudenti {
    
    // Array privato per memorizzare gli studenti
    private Studente[] studenti;
    
    // Contatore per tenere traccia del numero di studenti inseriti
    private int numeroStudenti;
    
    // Capacità massima del registro (dimensione dell'array)
    private static final int CAPACITA_MASSIMA = 100;
    
    /**
     * Costruttore senza parametri per inizializzare il registro vuoto.
     * Crea un array vuoto con capacità predefinita.
     */
    public RegistroStudenti() {
        // Inizializza l'array con la capacità massima
        this.studenti = new Studente[CAPACITA_MASSIMA];
        // Inizializza il contatore a zero
        this.numeroStudenti = 0;
    }
    
    /**
     * Metodo pubblico per aggiungere uno studente al registro.
     * Verifica che ci sia spazio disponibile prima di aggiungere.
     * 
     * @param studente l'oggetto Studente da aggiungere al registro
     * @return true se lo studente è stato aggiunto con successo, false altrimenti
     */
    public boolean aggiungiStudente(Studente studente) {
        // Verifica se c'è ancora spazio nel registro
        if (numeroStudenti < CAPACITA_MASSIMA && studente != null) {
            // Aggiunge lo studente nella prima posizione libera
            studenti[numeroStudenti] = studente;
            // Incrementa il contatore
            numeroStudenti++;
            return true;
        } else {
            // Registro pieno o studente nullo
            System.out.println("Impossibile aggiungere lo studente: registro pieno o studente non valido.");
            return false;
        }
    }
    
    /**
     * Metodo che stampa la lista di tutti gli studenti nel registro.
     * Se il registro è vuoto, stampa un messaggio appropriato.
     */
    public void stampaListaStudenti() {
        System.out.println("=== REGISTRO STUDENTI ===");
        
        // Verifica se il registro è vuoto
        if (numeroStudenti == 0) {
            System.out.println("Il registro è vuoto.");
        } else {
            System.out.println("Numero totale di studenti: " + numeroStudenti);
            System.out.println();
            
            // Stampa le informazioni di ogni studente
            for (int i = 0; i < numeroStudenti; i++) {
                System.out.println((i + 1) + ". " + studenti[i].getInfo());
            }
        }
        
        System.out.println("=========================");
    }
    
    /**
     * Restituisce il numero di studenti attualmente nel registro.
     * 
     * @return il numero di studenti nel registro
     */
    public int getNumeroStudenti() {
        return numeroStudenti;
    }
    
    /**
     * Verifica se il registro è pieno.
     * 
     * @return true se il registro è pieno, false altrimenti
     */
    public boolean isRegistroPieno() {
        return numeroStudenti >= CAPACITA_MASSIMA;
    }
    
    /**
     * Verifica se il registro è vuoto.
     * 
     * @return true se il registro è vuoto, false altrimenti
     */
    public boolean isRegistroVuoto() {
        return numeroStudenti == 0;
    }
    
    /**
     * Restituisce la capacità massima del registro.
     * 
     * @return la capacità massima del registro
     */
    public int getCapacitaMassima() {
        return CAPACITA_MASSIMA;
    }
}
/**
 * Classe che rappresenta una domanda di un quiz a risposta aperta.
 * Permette di salvare il testo della domanda e la risposta corretta,
 * verificare le risposte degli utenti e stampare i risultati.
 */
public class DomandaQuiz {
    
    // Attributi privati della classe
    
    /** Il testo della domanda */
    private String testoDomanda;
    
    /** La risposta corretta alla domanda */
    private String rispostaCorretta;
    
    /**
     * Costruttore della classe DomandaQuiz.
     * Inizializza una nuova domanda con il testo e la risposta corretta.
     * 
     * @param testoDomanda il testo della domanda
     * @param rispostaCorretta la risposta corretta alla domanda
     */
    public DomandaQuiz(String testoDomanda, String rispostaCorretta) {
        this.testoDomanda = testoDomanda;
        this.rispostaCorretta = rispostaCorretta;
    }
    
    /**
     * Verifica se la risposta dell'utente è corretta.
     * Il confronto è case-insensitive e ignora spazi iniziali e finali.
     * 
     * @param rispostaUtente la risposta fornita dall'utente
     * @return true se la risposta è corretta, false altrimenti
     */
    public boolean verificaRisposta(String rispostaUtente) {
        // Verifica che la risposta dell'utente non sia nulla
        if (rispostaUtente == null) {
            return false;
        }
        
        // Confronta le risposte ignorando maiuscole/minuscole e spazi
        return rispostaCorretta.trim().equalsIgnoreCase(rispostaUtente.trim());
    }
    
    /**
     * Stampa direttamente il risultato della verifica della risposta.
     * Mostra se la risposta è corretta o sbagliata e quale era quella giusta.
     * 
     * @param rispostaUtente la risposta fornita dall'utente
     */
    public void stampaRisultato(String rispostaUtente) {
        boolean isCorretta = verificaRisposta(rispostaUtente);
        
        System.out.println("\n=== RISULTATO ===");
        System.out.println("Domanda: " + testoDomanda);
        System.out.println("La tua risposta: " + (rispostaUtente != null ? rispostaUtente : "[nessuna risposta]"));
        
        if (isCorretta) {
            System.out.println("✓ CORRETTO! Hai risposto bene.");
        } else {
            System.out.println("✗ SBAGLIATO! La risposta corretta era: " + rispostaCorretta);
        }
        System.out.println("=================");
    }
    
    /**
     * Restituisce il testo della domanda.
     * 
     * @return il testo della domanda
     */
    public String getTestoDomanda() {
        return testoDomanda;
    }
    
    /**
     * Restituisce la risposta corretta.
     * 
     * @return la risposta corretta
     */
    public String getRispostaCorretta() {
        return rispostaCorretta;
    }
    
    /**
     * Imposta un nuovo testo per la domanda.
     * 
     * @param testoDomanda il nuovo testo della domanda
     */
    public void setTestoDomanda(String testoDomanda) {
        this.testoDomanda = testoDomanda;
    }
    
    /**
     * Imposta una nuova risposta corretta.
     * 
     * @param rispostaCorretta la nuova risposta corretta
     */
    public void setRispostaCorretta(String rispostaCorretta) {
        this.rispostaCorretta = rispostaCorretta;
    }
    
    /**
     * Restituisce una rappresentazione testuale della domanda.
     * 
     * @return una stringa che rappresenta la domanda
     */
    @Override
    public String toString() {
        return "Domanda: " + testoDomanda + " | Risposta: " + rispostaCorretta;
    }
}
// Classe per una domanda del quiz
public class DomandaQuiz {
    
    private String testoDomanda;
    private String rispostaCorretta;
    
    // Costruttore
    public DomandaQuiz(String testoDomanda, String rispostaCorretta) {
        this.testoDomanda = testoDomanda;
        this.rispostaCorretta = rispostaCorretta;
    }
    
    // Metodo per verificare se la risposta è corretta
    public boolean verificaRisposta(String rispostaUtente) {
        return rispostaCorretta.equalsIgnoreCase(rispostaUtente);
    }
    
    // Metodo che stampa il risultato
    public void stampaRisultato(String rispostaUtente) {
        if (verificaRisposta(rispostaUtente)) {
            System.out.println("Corretto!");
        } else {
            System.out.println("Sbagliato! La risposta corretta era: " + rispostaCorretta);
        }
    }
    
    // Getter per la domanda
    public String getTestoDomanda() {
        return testoDomanda;
    }
}
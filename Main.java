import java.util.Scanner;

/**
 * Classe principale per testare il sistema di quiz a risposta aperta.
 * Contiene il metodo main che pone domande all'utente e valida le risposte.
 */
public class Main {
    
    /**
     * Metodo main per eseguire il quiz.
     * 
     * @param args argomenti della riga di comando (non utilizzati)
     */
    public static void main(String[] args) {
        
        // Crea uno scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== QUIZ A RISPOSTA APERTA ===");
        System.out.println("Benvenuto nel quiz! Rispondi alle domande seguenti.");
        System.out.println();
        
        // Crea alcune domande di esempio
        DomandaQuiz domanda1 = new DomandaQuiz(
            "Qual è la capitale d'Italia?", 
            "Roma"
        );
        
        DomandaQuiz domanda2 = new DomandaQuiz(
            "Quale linguaggio di programmazione stiamo studiando?", 
            "Java"
        );
        
        DomandaQuiz domanda3 = new DomandaQuiz(
            "Quanti giorni ci sono in una settimana?", 
            "7"
        );
        
        // Array di domande per facilitare l'iterazione
        DomandaQuiz[] domande = {domanda1, domanda2, domanda3};
        
        int punteggioTotale = 0;
        
        // Pone ogni domanda all'utente
        for (int i = 0; i < domande.length; i++) {
            DomandaQuiz domandaCorrente = domande[i];
            
            System.out.println("DOMANDA " + (i + 1) + " di " + domande.length);
            System.out.println(domandaCorrente.getTestoDomanda());
            System.out.print("La tua risposta: ");
            
            // Legge la risposta dell'utente
            String rispostaUtente = scanner.nextLine();
            
            // Verifica la risposta e stampa il risultato
            domandaCorrente.stampaRisultato(rispostaUtente);
            
            // Aggiorna il punteggio
            if (domandaCorrente.verificaRisposta(rispostaUtente)) {
                punteggioTotale++;
            }
            
            System.out.println();
        }
        
        // Stampa il risultato finale
        stampaRisultatoFinale(punteggioTotale, domande.length);
        
        // Test aggiuntivo con una domanda personalizzata
        System.out.println("\n=== DOMANDA BONUS ===");
        testDomandaPersonalizzata(scanner);
        
        // Chiude lo scanner
        scanner.close();
        
        System.out.println("\nGrazie per aver partecipato al quiz!");
    }
    
    /**
     * Stampa il risultato finale del quiz.
     * 
     * @param punteggioOttenuto il punteggio ottenuto dall'utente
     * @param punteggioMassimo il punteggio massimo possibile
     */
    private static void stampaRisultatoFinale(int punteggioOttenuto, int punteggioMassimo) {
        System.out.println("=== RISULTATO FINALE ===");
        System.out.println("Hai risposto correttamente a " + punteggioOttenuto + " domande su " + punteggioMassimo);
        
        double percentuale = (double) punteggioOttenuto / punteggioMassimo * 100;
        System.out.println("Percentuale: " + String.format("%.1f", percentuale) + "%");
        
        // Valutazione basata sulla percentuale
        if (percentuale >= 90) {
            System.out.println("Valutazione: ECCELLENTE! 🌟");
        } else if (percentuale >= 70) {
            System.out.println("Valutazione: BUONO! 👍");
        } else if (percentuale >= 50) {
            System.out.println("Valutazione: SUFFICIENTE 📚");
        } else {
            System.out.println("Valutazione: DA MIGLIORARE 💪");
        }
        
        System.out.println("========================");
    }
    
    /**
     * Test aggiuntivo con una domanda personalizzata per dimostrare
     * ulteriori funzionalità della classe DomandaQuiz.
     * 
     * @param scanner lo scanner per leggere l'input dell'utente
     */
    private static void testDomandaPersonalizzata(Scanner scanner) {
        // Crea una domanda più complessa
        DomandaQuiz domandaBonus = new DomandaQuiz(
            "Quale metodo viene chiamato automaticamente quando si crea un oggetto in Java?", 
            "costruttore"
        );
        
        System.out.println("DOMANDA BONUS:");
        System.out.println(domandaBonus.getTestoDomanda());
        System.out.print("La tua risposta: ");
        
        String rispostaBonus = scanner.nextLine();
        
        // Dimostra l'uso del metodo verificaRisposta separatamente
        boolean isCorretta = domandaBonus.verificaRisposta(rispostaBonus);
        
        System.out.println("\nVerifica manuale: " + (isCorretta ? "CORRETTO!" : "SBAGLIATO!"));
        
        // Poi usa anche il metodo stampaRisultato
        domandaBonus.stampaRisultato(rispostaBonus);
    }
}
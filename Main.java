import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quiz!");
        
        // Creo le domande
        DomandaQuiz domanda1 = new DomandaQuiz("Qual è la capitale d'Italia?", "Roma");
        DomandaQuiz domanda2 = new DomandaQuiz("Quanti continenti ci sono?", "7");
        DomandaQuiz domanda3 = new DomandaQuiz("Chi ha scritto I Promessi Sposi?", "Alessandro Manzoni");
        
        int punteggio = 0;
        
        // Prima domanda
        System.out.println(domanda1.getTestoDomanda());
        String risposta1 = scanner.nextLine();
        domanda1.stampaRisultato(risposta1);
        if (domanda1.verificaRisposta(risposta1)) {
            punteggio++;
        }
        
        // Seconda domanda
        System.out.println(domanda2.getTestoDomanda());
        String risposta2 = scanner.nextLine();
        domanda2.stampaRisultato(risposta2);
        if (domanda2.verificaRisposta(risposta2)) {
            punteggio++;
        }
        
        // Terza domanda
        System.out.println(domanda3.getTestoDomanda());
        String risposta3 = scanner.nextLine();
        domanda3.stampaRisultato(risposta3);
        if (domanda3.verificaRisposta(risposta3)) {
            punteggio++;
        }
        
        // Risultato finale
        System.out.println("Hai fatto " + punteggio + " punti su 3!");
        
        scanner.close();
    }
}
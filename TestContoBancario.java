/**
 * Classe di test per dimostrare il funzionamento della classe ContoBancario.
 * Esegue operazioni di deposito, prelievo e visualizzazione del saldo.
 * 
 * @author Boolean Course
 * @version 1.0
 */
public class TestContoBancario {
    
    public static void main(String[] args) {
        // Creazione di un nuovo conto bancario
        ContoBancario conto = new ContoBancario("IT60X0542811101000000123456");
        
        System.out.println("=== GESTIONE CONTO BANCARIO ===");
        System.out.println("Conto creato: " + conto.getInfo());
        System.out.println();
        
        // Test deposito
        System.out.println("--- OPERAZIONI DI DEPOSITO ---");
        boolean depositoRiuscito1 = conto.deposita(1000.50);
        System.out.println("Deposito di €1000.50: " + (depositoRiuscito1 ? "Riuscito" : "Fallito"));
        System.out.println("Saldo dopo deposito: €" + String.format("%.2f", conto.getSaldo()));
        
        boolean depositoRiuscito2 = conto.deposita(250.75);
        System.out.println("Deposito di €250.75: " + (depositoRiuscito2 ? "Riuscito" : "Fallito"));
        System.out.println("Saldo dopo secondo deposito: €" + String.format("%.2f", conto.getSaldo()));
        
        // Test deposito con importo negativo
        boolean depositoFallito = conto.deposita(-100);
        System.out.println("Tentativo deposito di €-100: " + (depositoFallito ? "Riuscito" : "Fallito"));
        System.out.println();
        
        // Test prelievo
        System.out.println("--- OPERAZIONI DI PRELIEVO ---");
        boolean prelieveRiuscito1 = conto.preleva(300.25);
        System.out.println("Prelievo di €300.25: " + (prelieveRiuscito1 ? "Riuscito" : "Fallito"));
        System.out.println("Saldo dopo prelievo: €" + String.format("%.2f", conto.getSaldo()));
        
        // Test prelievo con fondi insufficienti
        boolean prelieveRiuscito2 = conto.preleva(2000);
        System.out.println("Tentativo prelievo di €2000: " + (prelieveRiuscito2 ? "Riuscito" : "Fallito"));
        System.out.println("Saldo dopo tentativo: €" + String.format("%.2f", conto.getSaldo()));
        
        // Test prelievo con importo negativo
        boolean prelieveFallito = conto.preleva(-50);
        System.out.println("Tentativo prelievo di €-50: " + (prelieveFallito ? "Riuscito" : "Fallito"));
        System.out.println();
        
        // Stato finale del conto
        System.out.println("--- STATO FINALE ---");
        System.out.println(conto.getInfo());
        
        // Test con un secondo conto
        System.out.println();
        System.out.println("=== TEST SECONDO CONTO ===");
        ContoBancario conto2 = new ContoBancario("IT60X0542811101000000654321");
        System.out.println("Secondo conto creato: " + conto2.getInfo());
        
        conto2.deposita(500);
        System.out.println("Dopo deposito di €500: " + conto2.getInfo());
    }
}
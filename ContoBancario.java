/**
 * Classe che rappresenta un conto bancario con operazioni di base.
 * Gestisce il numero di conto, il saldo e le operazioni di deposito e prelievo.
 * 
 * @author Boolean Course
 * @version 1.0
 */
public class ContoBancario {
    
    // Attributi privati della classe per incapsulamento
    
    /** Il numero identificativo del conto bancario */
    private String numeroConto;
    
    /** Il saldo corrente del conto in euro */
    private double saldo;
    
    /**
     * Costruttore della classe ContoBancario.
     * Inizializza un nuovo conto bancario con il numero specificato e saldo zero.
     * 
     * @param numeroConto il numero identificativo del conto
     */
    public ContoBancario(String numeroConto) {
        this.numeroConto = numeroConto;  // Assegna il numero di conto
        this.saldo = 0.0;                // Inizializza il saldo a zero
    }
    
    /**
     * Deposita una somma di denaro sul conto.
     * Aumenta il saldo del conto dell'importo specificato.
     * 
     * @param importo l'importo da depositare (deve essere positivo)
     * @return true se il deposito è avvenuto con successo, false altrimenti
     */
    public boolean deposita(double importo) {
        // Verifica che l'importo sia positivo
        if (importo > 0) {
            saldo += importo;  // Aggiunge l'importo al saldo
            return true;       // Operazione riuscita
        }
        return false;  // Operazione fallita (importo non valido)
    }
    
    /**
     * Preleva una somma di denaro dal conto.
     * Diminuisce il saldo del conto dell'importo specificato se i fondi sono sufficienti.
     * 
     * @param importo l'importo da prelevare (deve essere positivo)
     * @return true se il prelievo è avvenuto con successo, false altrimenti
     */
    public boolean preleva(double importo) {
        // Verifica che l'importo sia positivo e che ci siano fondi sufficienti
        if (importo > 0 && saldo >= importo) {
            saldo -= importo;  // Sottrae l'importo dal saldo
            return true;       // Operazione riuscita
        }
        return false;  // Operazione fallita (importo non valido o fondi insufficienti)
    }
    
    /**
     * Restituisce il saldo corrente del conto.
     * 
     * @return il saldo attuale del conto in euro
     */
    public double getSaldo() {
        return saldo;
    }
    
    /**
     * Restituisce il numero del conto.
     * 
     * @return il numero identificativo del conto
     */
    public String getNumeroConto() {
        return numeroConto;
    }
    
    /**
     * Restituisce una rappresentazione testuale del conto bancario.
     * Include numero di conto e saldo corrente.
     * 
     * @return una stringa con le informazioni del conto
     */
    public String getInfo() {
        return "Conto: " + numeroConto + ", Saldo: €" + String.format("%.2f", saldo);
    }
}
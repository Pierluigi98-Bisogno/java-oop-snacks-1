/**
 * Classe che rappresenta uno studente con le sue informazioni principali.
 * Questa classe implementa gli attributi base di uno studente e fornisce
 * metodi per accedere e modificare tali informazioni.
 * 
 * @author Boolean Course
 * @version 1.0
 */
public class Studente {
    
    // Attributi privati della classe per incapsulamento
    
    /** Il nome dello studente */
    private String nome;
    
    /** Il cognome dello studente */
    private String cognome;
    
    /** L'età dello studente in anni */
    private int eta;
    
    /**
     * Costruttore della classe Studente.
     * Inizializza un nuovo oggetto studente con i parametri forniti.
     * 
     * @param nome il nome dello studente
     * @param cognome il cognome dello studente
     * @param eta l'età dello studente (deve essere un valore positivo)
     */
    public Studente(String nome, String cognome, int eta) {
        this.nome = nome;        // Assegna il nome passato come parametro
        this.cognome = cognome;  // Assegna il cognome passato come parametro
        this.eta = eta;          // Assegna l'età passata come parametro
    }
    
    /**
     * Metodo che restituisce una rappresentazione testuale dello studente.
     * Concatena nome, cognome ed età in un formato leggibile.
     * 
     * @return una stringa nel formato "Nome Cognome, XX anni"
     */
    public String getInfo() {
        // Concatena le informazioni dello studente in un formato standard
        return nome + " " + cognome + ", " + eta + " anni";
    }
    
    // ========== METODI GETTER ==========
    // Permettono di accedere ai valori degli attributi privati
    
    /**
     * Restituisce il nome dello studente.
     * 
     * @return il nome dello studente
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Restituisce il cognome dello studente.
     * 
     * @return il cognome dello studente
     */
    public String getCognome() {
        return cognome;
    }
    
    /**
     * Restituisce l'età dello studente.
     * 
     * @return l'età dello studente in anni
     */
    public int getEta() {
        return eta;
    }
    
    // ========== METODI SETTER ==========
    // Permettono di modificare i valori degli attributi privati
    
    /**
     * Imposta un nuovo nome per lo studente.
     * 
     * @param nome il nuovo nome da assegnare
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * Imposta un nuovo cognome per lo studente.
     * 
     * @param cognome il nuovo cognome da assegnare
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    /**
     * Imposta una nuova età per lo studente.
     * 
     * @param eta la nuova età da assegnare (dovrebbe essere un valore positivo)
     */
    public void setEta(int eta) {
        this.eta = eta;
    }
}
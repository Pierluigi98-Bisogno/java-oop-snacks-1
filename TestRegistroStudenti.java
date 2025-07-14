/**
 * Classe di test per dimostrare il funzionamento della classe RegistroStudenti.
 * Contiene esempi di utilizzo del registro studenti.
 */
public class TestRegistroStudenti {
    
    /**
     * Metodo main per testare la classe RegistroStudenti.
     * 
     * @param args argomenti della riga di comando (non utilizzati)
     */
    public static void main(String[] args) {
        
        System.out.println("=== TEST REGISTRO STUDENTI ===");
        System.out.println();
        
        // Crea un nuovo registro studenti
        RegistroStudenti registro = new RegistroStudenti();
        
        // Verifica iniziale: registro vuoto
        System.out.println("1. STATO INIZIALE DEL REGISTRO:");
        registro.stampaListaStudenti();
        System.out.println();
        
        // Crea alcuni studenti
        System.out.println("2. CREAZIONE STUDENTI:");
        Studente studente1 = new Studente("Mario", "Rossi", 20);
        Studente studente2 = new Studente("Giulia", "Bianchi", 22);
        Studente studente3 = new Studente("Luca", "Verdi", 19);
        Studente studente4 = new Studente("Anna", "Neri", 21);
        
        System.out.println("Studenti creati:");
        System.out.println("- " + studente1.getInfo());
        System.out.println("- " + studente2.getInfo());
        System.out.println("- " + studente3.getInfo());
        System.out.println("- " + studente4.getInfo());
        System.out.println();
        
        // Aggiunge studenti al registro
        System.out.println("3. AGGIUNTA STUDENTI AL REGISTRO:");
        
        boolean aggiunto1 = registro.aggiungiStudente(studente1);
        System.out.println("Aggiunto " + studente1.getNome() + " " + studente1.getCognome() + ": " + aggiunto1);
        
        boolean aggiunto2 = registro.aggiungiStudente(studente2);
        System.out.println("Aggiunto " + studente2.getNome() + " " + studente2.getCognome() + ": " + aggiunto2);
        
        boolean aggiunto3 = registro.aggiungiStudente(studente3);
        System.out.println("Aggiunto " + studente3.getNome() + " " + studente3.getCognome() + ": " + aggiunto3);
        
        boolean aggiunto4 = registro.aggiungiStudente(studente4);
        System.out.println("Aggiunto " + studente4.getNome() + " " + studente4.getCognome() + ": " + aggiunto4);
        
        System.out.println();
        
        // Stampa il registro aggiornato
        System.out.println("4. REGISTRO DOPO LE AGGIUNTE:");
        registro.stampaListaStudenti();
        System.out.println();
        
        // Informazioni sul registro
        System.out.println("5. INFORMAZIONI SUL REGISTRO:");
        System.out.println("Numero studenti nel registro: " + registro.getNumeroStudenti());
        System.out.println("Capacità massima: " + registro.getCapacitaMassima());
        System.out.println("Registro vuoto: " + registro.isRegistroVuoto());
        System.out.println("Registro pieno: " + registro.isRegistroPieno());
        System.out.println();
        
        // Test con studente nullo
        System.out.println("6. TEST CON STUDENTE NULLO:");
        boolean aggiuntoNull = registro.aggiungiStudente(null);
        System.out.println("Tentativo di aggiungere studente nullo: " + aggiuntoNull);
        System.out.println();
        
        // Aggiunge altri studenti per testare la capacità
        System.out.println("7. AGGIUNTA DI ALTRI STUDENTI:");
        for (int i = 5; i <= 8; i++) {
            Studente nuovoStudente = new Studente("Studente" + i, "Cognome" + i, 18 + i);
            boolean aggiunto = registro.aggiungiStudente(nuovoStudente);
            System.out.println("Aggiunto " + nuovoStudente.getNome() + ": " + aggiunto);
        }
        System.out.println();
        
        // Stampa finale del registro
        System.out.println("8. REGISTRO FINALE:");
        registro.stampaListaStudenti();
        
        System.out.println();
        System.out.println("=== FINE TEST ===");
    }
}
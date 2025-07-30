public class Main {
    public static void main(String[] args) {
        Studente s = new Studente("Michele");
        Corso c = new Corso("Informatica");

        c.iscrivi(s); // Output: Studente Mario iscritto al corso di Matematica
    }
}

public class Corso {
    private String nomeCorso;

    public Corso(String nomeCorso) {
        this.nomeCorso = nomeCorso;
    }

    public void iscrivi(Studente studente) {
        System.out.println("Studente " + studente.getNome() + " iscritto al corso di " + nomeCorso);
    }
}

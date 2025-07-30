package ElencoInteri;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private List<String> ingredienti = new ArrayList<>();

    public Pizza aggiungiMozzarella() {
        ingredienti.add("Mozzarella");
        return this; // ritorna l'oggetto corrente per consentire il chaining
    }

    public Pizza aggiungiPomodoro() {
        ingredienti.add("Pomodoro");
        return this;
    }

    public Pizza aggiungiProsciutto() {
        ingredienti.add("Prosciutto");
        return this;
    }

    // Metodo opzionale per mostrare la pizza creata
    public void stampaIngredienti() {
        System.out.println("Pizza con: " + String.join(", ", ingredienti));
    }

    
    }



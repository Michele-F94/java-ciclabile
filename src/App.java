import ElencoInteri.Pizza;

public class App {
        
        // Main di test
    public static void main(String[] args) {
        Pizza p = new Pizza()
            .aggiungiMozzarella()
            .aggiungiPomodoro()
            .aggiungiProsciutto();

        p.stampaIngredienti(); // Output: Pizza con: Mozzarella, Pomodoro, Prosciutto

    }

    }
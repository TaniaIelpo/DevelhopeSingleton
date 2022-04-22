public class Main {

    public static void main(String[] args) {
        PrimoSingleton primo=PrimoSingleton.getInstance();
        primo.stampa();
        primo=PrimoSingleton.getInstance();
        primo.stampa();
    }
}

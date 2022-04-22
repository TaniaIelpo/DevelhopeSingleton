import java.util.Optional;

public class PrimoSingleton {

    private static PrimoSingleton instance;

    private PrimoSingleton(){}

    public static PrimoSingleton getInstance(){

        //if(instance==null){
        if(!Optional.ofNullable(instance).isPresent()){
            System.out.println("Instanziato la prima volta");
            instance= new PrimoSingleton();
        }
        return instance;
    }

    public void stampa(){
        System.out.println("Ciao, sono il mio primo singleton");
    }
}

package SingletonClass;

public class SingletonClass {

    // A singleton Class can have only one object that is created for other classes to work with.
    // There are 3 main rules to make a class as a Singleton class
    // RULE 1: Object to be created should be a "PRIVATE" & "STATIC":

    private static SingletonClass Instance = new SingletonClass();

    // RULE 2: The constructor needs to be "PRIVATE":

    private SingletonClass(){

    }
    // All methods needs to have a return-type (int, string, void etc).
    // RULE 3: The getter method should be "PUBLIC" & "STATIC":
    public static SingletonClass getObjSingletonClass(){
        return Instance;
    }


    int age;
    String firstName = "Beenish";

    String lastName;

    public void firstName(){
        System.out.println("My first name is Furqan");
    }

    public void lastName(){
        System.out.println("last name is Javed");
    }



}

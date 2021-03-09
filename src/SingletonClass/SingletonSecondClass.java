package SingletonClass;

public class SingletonSecondClass {

    public static void main(String[] args) {

        SingletonClass obj1 = SingletonClass.getObjSingletonClass();
        SingletonClass obj2 = SingletonClass.getObjSingletonClass();
        SingletonClass obj3 = SingletonClass.getObjSingletonClass();

        obj1.firstName = "Furqan";
        obj2.firstName = "Kamal";
        obj3.firstName = "Anjuman";

        System.out.println(obj1.firstName);
        System.out.println(obj2.firstName);
        System.out.println(obj3.firstName);





    }

}

    // Data tye             // Variables            // Initialization
     // Primitive
                                                            // value given to the variable
//    int                           age         =           26;
//    long
//    short
//    double
//    float
//    byte
//    char
//    boolean

    // Non-Primitive
    //Strings
    // Arrays
    // User-defined classes

    // In order to declare and initialize a non-primitive data type, we need to create (use) objects.

//    public static void main(String[] args) {
//
//
//        String firstName = new String();
//        firstName = "Furqan";
//
//        String lastName = "Javed";
//
//        int[] nums = new int[5];
//        nums[0] = 35;
//        nums[3] = 24;
//        nums[1] = 3;
//
//        int[] num2 = {35,34,33,32,21};
//
//
//    }
//
//}

import java.util.*;
import java.util.function.Predicate;

@FunctionalInterface
interface A{
    // ABSTRACT METHOD
    void display();

    static int add(int a, int b){
        return a+b;
    }
    default int sub(int a, int b){
        return a-b;
    }
}

public class Sample {
    public static void printNames(String a){
        System.out.println("name : "+a );
    }
    public static boolean age(int a){
        if(a>18)
            return true;
        else return false;

    }

    public static void main(String[] args) {

        //old method
        System.out.println();
        A obj1 = new A(){
            public void display() {
                System.out.println("This is a Functional Interface");
            }
        };
        obj1.display();
        System.out.println();
        // USING LAMBDA EXPRESSION
        A obj2 = () -> System.out.println("lamda expression");
        obj2.display();
        System.out.println();

        // METHOD REFERENCE EXAMPLE
        List<String> arr = Arrays.asList("Apple","Orange","Grape","Tomato");

        // normal for each
        for(String name : arr){
            printNames(name);

        }

        //using lambda
        arr.forEach(name -> printNames(name));

        //using method reference
        arr.forEach(System.out::println);
        arr.forEach(Sample::printNames);

        //PREDICATE
        Predicate<Integer> predicate = age -> age>18;
        System.out.println(predicate.test(45));
    }


}
//for (String names : arr){
//printNames(names);
//        }
//                System.out.println();
//
//        arr.forEach(name -> System.out.println(name)); //lambda exp
//        arr.forEach(name -> printNames(name));
//
//        System.out.println();
//
//        System.out.println("using method reference");
//        arr.forEach(System.out::println);
//        System.out.println();
//        arr.forEach(Sample::printNames);
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
    public static void main(String[] args) {

        A obj1 = new A(){
            public void display() {
                System.out.println("This is a Functional Interface");
            }
        };
        obj1.display();

        A obj2 = () -> System.out.println("lamda expression");
        obj2.display();

    }
}

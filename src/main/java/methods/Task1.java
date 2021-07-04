package methods;

public class Task1 {

    static class Methods {
        public static void div(int a, int b) {
            if (( a == 0 ) || ( b == 0  )) {
                System.out.println("You cannot divide by zero");
            } else {
            System.out.println(a / b);
            }
        }
    }


    public static void main(String[] args) {
        Methods.div(10, 5);
    }
}
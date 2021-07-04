package methods;

public class Task4 {

    static class Methods {
        public static void multiply(String s, int count) {
            for (int i = 0; i < count; i++) {
                System.out.print(s);
            }
        }
        public static void multiply(String s) {
            for (int i = 0; i < 5; i++){
                System.out.print(s);
            }
        }
    }
        public static void main(String[] args) {
        Task4.Methods.multiply("Солнце", 10);
        System.out.println();
        Task4.Methods.multiply("Солнце");
    }
}



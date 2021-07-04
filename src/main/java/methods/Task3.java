package methods;

public class Task3 {

    static class Methods {
        public static void addTenPercent(double i) {
           double result = ((i * 0.1) + i);
           System.out.println(result);
        }
    }
    public static void main(String[] args) {
        Task3.Methods.addTenPercent(3030);
    }
}


package methods;

public class Task5 {
    public static void hackSalary(int salary) {
        System.out.println("Твоя зарплата составляет: " + ( salary + 100 ) +" долларов в месяц.");
    }

    public static void main(String[] args) {
        Task5.hackSalary(500);
    }
}


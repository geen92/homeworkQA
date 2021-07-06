//Homework
//        1) Счастливый билет.
//        Дан массив с 6 элементами типа int. Определить, является билет
//        счастливым. Билет является счастливым, если сумма первых трех
//        чисел сумме 4го, 5го и 6го числа.
//        Числа должны быть в промежутке от 0 до 9 включительно.
//        В результате вывести текст (пример):
//        “Билет счастливый: true”

package lesson6arrey;

public class Task1 {
    public static void main(String[] args) {
        int[] ticket = {(int)(Math.random()*10),(int)(Math.random()*10),(int)(Math.random()*10),(int)(Math.random()*10),(int)(Math.random()*10),(int)(Math.random()*10)};
        System.out.println("Номер билета: " + ticket[0] + " " +  ticket[1] + " " + ticket[2] + " " + ticket[3] + " " + ticket[4] + " " + ticket[5] );
        int sum_of_the_first_three = ticket[0] + ticket[1] + ticket[2];
        int sum_of_the_last_three = ticket[3] + ticket[4] + ticket[5];
        boolean lucky_ticket = sum_of_the_first_three == sum_of_the_last_three;
        System.out.println("Билет счастливый: " + lucky_ticket);
    }
}

// Решение лучше ниже
// public class tick {
//     public static void main(String[] args) {
//         int[] ticket = {1,3,4,6,1,1};
//         tick.printLuckyTicket(ticket);
//     }
//     public static void printLuckyTicket (int[] ticket) {
//         if ((ticket[0] + ticket[1] + ticket[2] == ticket[3] + ticket[4] + ticket[5])) {
//             System.out.println("true");
//         } else {
//             System.out.println("False");
//         }
//     }
// }

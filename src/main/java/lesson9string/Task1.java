package lesson9string;

public class Task1 {
    public static void lineOutput(String surname, int rating, String subject) {
        String result = String.format("Студент %s получил %d по %s",surname,rating,subject);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Task1.lineOutput("Пономарев", 4, "Географии");
    }
}

//    public static void main(String[] args) {
//    }
//        String surname = "1";
//        String rating = "2";
//        String subject = "3";
//        System.out.println("Студент" + surname + "получил" + rating + "по" + subject);
//    }
//    public static void lineOutput (String [] );
//        System.out.println("Студент" + surname + "получил" + rating + "по" + subject);
//
//    }
//}
//
//        String surname = "1";
//        int rating = 5;
//        String subject = "2";
//        String result = String.format("Студент %s получил %d по %s",surname,rating,subject);
//        System.out.println(result);
//    }
//    static class Methods {
//        public static void div(int a, int b) {
//            if (( a == 0 ) || ( b == 0  )) {
//                System.out.println("You cannot divide by zero");
//            } else {
//                System.out.println(a / b);
//            }
//        }
//}}
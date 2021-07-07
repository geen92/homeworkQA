//3) Посчитать результат выражений. Между числами могут быть
//слова только "plus" and "minus"
//String s1 = "1 plus 5";
//String s2 = "6 minus 5";
//String s3 = "8 plus 10";
//String s4 = "16 minus 5";
//Результат вывести на консоль в виде:
//“1 plus 5 = 6”

package lesson9string;

public class Task3 {
    public static void main(String[] args) {
        String s1 = "1 plus 5";
        String s2 = "6 minus 5";
        String s3 = "8 plus 10";
        String s4 = "16 minus 5";
        Task3.calculateTheResult(s1);
        Task3.calculateTheResult(s2);
        Task3.calculateTheResult(s3);
        Task3.calculateTheResult(s4);
    }
    public static void calculateTheResult (String expressions) {
        String[] expression = expressions.split("\\s");
        int temp = 0;
        if (expression[1].contains("plus"))
        {
            temp = (Integer.parseInt(expression[0]) + Integer.parseInt(expression[2]));
            System.out.println(expressions + " = " + temp);
        }
        else if ((expression[1].contains("minus")))
        {
            temp = (Integer.parseInt(expression[0]) - Integer.parseInt(expression[2]));
            System.out.println(expressions + " = " + temp);
        }
        else System.out.println("Некорректное выражение!");
    }
}

//public class Task3 {
//    public static void main(String[] args) {
//
//
//        String s1 = "1 plus 5";
//        String[] array1 = s1.split(" ");
//        s1.replace("plus", "");
//        int sum1 = 0;
//        for (int i = 0; i < array1.length; i++){
//            if(array1[i].equals("plus")){
//
//            }else {
//                int parseToInt = Integer.parseInt(array1[i]);
//                sum1 += parseToInt;
//            }
//        }
//        System.out.println(s1 + " = " + sum1);
//
//        String s2 = "6 minus 5";
//        String[] array2 = s2.split(" ");
//        s2.replace("minus", "");
//        int sum2 = 0;
//        for (int i = 0; i < array2.length; i++){
//            if(array2[i].equals("minus")){
//
//            }else {
//                int parseToInt2 = Integer.parseInt(array2[i]);
//                if (sum2 == 0){
//                    sum2 += parseToInt2;
//                }else{
//                    sum2 = sum2 - parseToInt2;
//                }
//            }
//        }
//        System.out.println(s2 + " = " + sum2);
//
//        String s3 = "8 plus 10";
//        String[] array3 = s3.split(" ");
//        s3.replace("plus", "");
//        int sum3 = 0;
//        for (int i = 0; i < array3.length; i++){
//            if(array3[i].equals("plus")){
//
//            }else {
//                int parseToInt3 = Integer.parseInt(array3[i]);
//                sum3 += parseToInt3;
//            }
//        }
//        System.out.println(s3 + " = " + sum3);
//
//
//        String s4 = "16 minus 5";
//        String[] array4 = s4.split(" ");
//        s4.replace("minus", "");
//        int sum4 = 0;
//        for (int i = 0; i < array4.length; i++){
//            if(array4[i].equals("minus")){
//
//            }else {
//                int parseToInt4 = Integer.parseInt(array4[i]);
//                if (sum4 == 0){
//                    sum4 += parseToInt4;
//                }else{
//                    sum4 = sum4 - parseToInt4;
//                }
//            }
//        }
//        System.out.println(s4 + " = " + sum4);
//
//
//    }
//
//}
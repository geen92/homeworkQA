//5) Дана строка:
//“It's the possibility of having a dream come true that makes life interesting.”
//Необходимо:а) перевести в верхний регистр все буквы в строке. Вывести
//результат в консоль
//б) перевести в нижний регистр все буквы в строке. Вывести
//результат в консоль
//в) каждое слово должно начинаться с большой буквы. Вывести
//результат в консоль.
//Note: для решения задачи использовать методы класса String

package lesson9string;

public class Task5 {
    public static String firstUpperCase(String word){
        if(word == null || word.isEmpty()) return "";
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
    public static void main(String[] args) {
        String str = "It's the possibility of having a dream come true that makes life interesting.";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        String[] letterUp = str.split("\\s");
        for (int i = 0; i < letterUp.length; i++) {
            System.out.print(Task5.firstUpperCase(letterUp[i]) + " ");
        }
    }
}

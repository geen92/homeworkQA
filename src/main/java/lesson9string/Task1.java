//1) Создать строку, используя форматирование: Студент [Фамилия]
//получил [оценка] по [предмету]. Форматирование и вывод строки на
//консоль написать в отдельном методе, который принимает
//фамилию, оценку и название предмета в качестве параметров.
//Пример:
//Студент Иванов получил 5 по биологии

package lesson9string;

public class Task1 {
    public static void lineOutput(String surname, int rating, String subject) {
        System.out.printf("Студент %s получил %d по %s%n",surname,rating,subject);
    }

    public static void main(String[] args) {
        Task1.lineOutput("Пономарев", 4, "Географии");
    }
}




//        Можно и так
//        String result = String.format("Студент %s получил %d по %s",surname,rating,subject);
//        System.out.println(result);
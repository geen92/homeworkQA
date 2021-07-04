package loop;

public class Task3V {
    public static void main(String[] args) {
        String chicken = "курица";
        String chickens = "курицы";
        String cow = "корова";
        String cows = "коровы";
        String x = null;
        String y = null;

        int a = 1;
        for (int i = 4; i > 0; i--, a++) {
            if (a == 1) {
                x = chicken;
            } if (a == 2 || a == 3 || a == 4)
            { x = chickens;
            } if (i == 1 )
            { y = cow;
            } if (i == 2 || i == 3 || i == 4)
            { y = cows;
            }
            {
                System.out.print("В доме есть " + a + " " + x + " и " + i + " " + y + ". Количество ног = " + ((a*2) + (i*4)));
                System.out.println();
            }
        }
    }
}

package loopother;
import java.util.*;

public class Task1max {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i;
        while (true){
            i = scanner.nextInt();
            if (i == (-1)){
                sum += i;
                break;
            }
            sum += i;
        }
        System.out.println(sum);

    }
}
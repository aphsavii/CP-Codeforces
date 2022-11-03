import java.util.*;;

public class Team_800 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, petya, vasya, tonya, count = 0;
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            petya = sc.nextInt();
            vasya = sc.nextInt();
            tonya = sc.nextInt();
            if (petya == 1 && tonya == 1) {
                count++;
            }
            else if (petya==1&& vasya==1) {
                count++;
            }
            else if (vasya==1&&tonya==1) {
                count++;
            }
        }
        System.out.println(count);
    }
}

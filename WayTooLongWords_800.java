import java.util.*;
public class WayTooLongWords_800 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for (int i = 0; i < t; i++) {
        String str=sc.next();
        int j=str.length();
        if (j<=10) {
        System.out.println(str);
        }
        else{
            System.out.print(str.charAt(0));
            System.out.print(j-2);
            System.out.println(str.charAt(j-1));
        }
    }
}
}
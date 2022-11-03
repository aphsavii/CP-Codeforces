import java.util.*;
public class watermelon_800 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int kilo=sc.nextInt();
    
    if (kilo%2==0) {
        if (kilo==2) {
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
    else{
        System.out.println("NO");
    }
}
}
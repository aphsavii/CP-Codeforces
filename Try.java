import java.util.*;
import java.lang.*;
public class Try {
    public static void main(String[] args) {
        int n=12;
        int num=1;
        for(int i=1;i<=n;i++){
            num=num*i+1;
            System.out.println(num%1000000000+7);
        }

}
};
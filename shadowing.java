import java.util.*;
public class shadowing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Boolean result = isArmStrong(a);
        System.out.println(result);


    }
    static Boolean isArmStrong(int n){
        int original = n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum = sum+rem*rem*rem;
        }
        return sum == original;
    }
}

import java.util.*;
public class hello{
public static void main(String[] args) {
    //sum();
    String res = Greetings("Asif");
    System.out.println(res);
}
static void sum(){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a+b;
    System.out.print(sum);
}
static String Greetings(String name){
    return "Hello "+ name;

}
}

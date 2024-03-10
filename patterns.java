public class patterns {
    public static void main(String[] args) {
        int n = 5;
        //Triangle(n);
        Triangle1(n);
    }
    static void Triangle(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Triangle1(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result=1;
        for(int i = N;i >=1;i--){
            result = result*i;

        }
        System.out.println(result);
        System.out.println(recFactorial(N));
    }

    static int recFactorial(int N){
       if(N<=1) return N;
       return N*recFactorial(N-1);
    }

}

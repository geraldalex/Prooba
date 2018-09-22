import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result=0;
        int N = sc.nextInt();
        boolean isNagative = false;

        for (int i = 1;i<=N;i++){
            if(isNagative) {
                result += i;
                System.out.println(result);
                isNagative = false;

            }else {
                result = -i;
                System.out.println(result);
                isNagative = false;
            }
        }
        System.out.println(result);
    }
}

import java.util.Scanner;

public class hwss0203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int N;
        if (n < 0) N = n*-1;
        else N = n;
        int sum = 0;
        while(N > 0) {
            sum += (N%10);
            N = N/10;
        }
        System.out.println("Tổng các chữ số là: " + sum);
    }
}

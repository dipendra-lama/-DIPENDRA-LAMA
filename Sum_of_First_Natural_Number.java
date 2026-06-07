import java.util.Scanner;

public class Sum_of_First_Natural_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//yha hme input le rakha hai
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);//use to output
    }
}
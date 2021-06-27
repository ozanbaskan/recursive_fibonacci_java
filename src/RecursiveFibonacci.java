import java.util.Scanner;

public class RecursiveFibonacci {



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an index to find in fibonacci series: ");
        int input = s.nextInt();
        if (input < 1)
        {
            System.out.println("Invalid entry.");
        }
        else
        {
            System.out.printf("%d. fibonacci sayısı: %d", input, fibo(input));
        }

    }

    static long fibo(int num)
    {
        if (num == 1 || num == 2)
        {
            return 1;
        }
        return fibo(num - 1) + fibo(num - 2);
    }
}

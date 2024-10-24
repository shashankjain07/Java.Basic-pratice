//2  Write a program to check whether a number is a Strong number or not. Strong number is a special number whose sum of factorial of digits is equal to the original number. For example: 145 is a strong number. Since, 1! + 4! + 5! = 145

import java.util.Scanner;
public class StrongNumOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a Digit: ");
        int in = s.nextInt();
        int fac,dig;
        int n = in;

        int sum = 0;

        for (; n != 0; n = n / 10) {
            dig = n % 10;
            fac = 1;

            for (int i = 1; i <= dig; i++) {
                fac *= i;
            }

            sum += fac;
        }

        if(sum == in)
            System.out.println(in + " is a strong number");
        else
            System.out.println(in + " is not a strong number");
    }
}

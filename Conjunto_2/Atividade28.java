package Conjunto_2;

import java.util.Scanner;

public class Atividade28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num1 > num3) {
            int temp = num1;
            num1 = num3;
            num3 = temp;
        }

        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println("The numbers in ascending order are: " + num1 + ", " + num2 + ", " + num3);

        sc.close();
    }
}

package week2_day2;

import java.util.Scanner;

public class armstrong {
    
    void printArmstrongNumber(int start, int end) {
        for (int i = start; i <= end; i++) {
            int num = i;
            int sum = 0;

            while (num > 0) {
                int r = num % 10;
                sum = sum + (r * r * r);
                num = num / 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        armstrong a1 = new armstrong();

        System.out.print("Enter the starting range: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending range: ");
        int end = sc.nextInt();

        a1.printArmstrongNumber(start, end);
    }
}

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
/*public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

 */
/*
public class Main {
    public static long computeFactorial(int n) {
        if (n == 0) return 1;
        return n * computeFactorial(n-1);
    }
    public static void main(String[] args) {
        int n = 20; // You can adjust this value
        long startTime = System.nanoTime();
        long result = computeFactorial(n);
        long endTime = System.nanoTime();
        double timeTaken = (endTime - startTime) / 1e9;
        System.out.println("Factorial of " + n + " is: " + result);
        System.out.println("Time taken: " + timeTaken + " s");
    }
}

 */

public class Main {
    public static void main(String[] args) {
        int totalNumbers = 0;
        int uniqueCount = 0;

        for (int i = 0; i <= 99; i++) {
            for (int j = 0; j <= 9999; j++) {
                String Number = String.format("%02d%04d", i, j);
                totalNumbers++;

                boolean hasUniqueDigits = true;
                boolean[] digits = new boolean[10];

                for (char digitChar : Number.toCharArray()) {
                    int digit = digitChar - '0'; //change string to int
                    if (digits[digit]) { //if digit is 1 in second time, 1 is duplicated. so true will be returned.
                        hasUniqueDigits = false;
                        break;
                    }
                    digits[digit] = true; //if digit = 1, 1000000000 (first time)
                }

                if (hasUniqueDigits) {
                    uniqueCount++;
                }
            }
        }

        double percentage = ((double) uniqueCount / totalNumbers) * 100;
        System.out.printf("The percentage of vehicle registration numbers with all unique numbers is %.2f%%. %n", percentage);
    }
}
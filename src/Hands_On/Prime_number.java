package Hands_On;
import java.util.Scanner;

public class Prime_number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check and display result
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }


    public static boolean isPrime(int number)
        {
            if (number <= 1)
                return false;
            if (number <= 3)
                return true;
            if (number % 2 == 0 || number % 3 == 0)
                return false;

            // Check from 5 to sqrt(number), skipping multiples of 2 and 3
            for (int i = 5; i * i <= number; i += 6)
            {
                if (number % i == 0 || number % (i + 2) == 0)
                {
                    return false;
                }
            }
            return true;
    }
}

/*
   ✅ Explanation: 6k ± 1 Optimization
    All primes greater than 3 are of the form:

            6k ± 1 (i.e., 5, 7, 11, 13, 17, 19, etc.)

    This is because:

    Every integer can be written in the form 6k, 6k±1, 6k±2, 6k±3

            6k, 6k±2, and 6k±3 are divisible by 2 or 3

    So only 6k-1 and 6k+1 need to be tested


🔍 How It Works:

    First filters out numbers divisible by 2 or 3.

    Then starts from 5 and checks:

    i (which is 6k - 1)

    i + 2 (which is 6k + 1)

    Increments i by 6 each loop.

            🧠 Example:
    To check n = 97, the loop checks:

    i = 5, 7, 11, 13 (only checks 6k ± 1 numbers)

    Skips 6, 8, 9, 10, 12, etc.
*/

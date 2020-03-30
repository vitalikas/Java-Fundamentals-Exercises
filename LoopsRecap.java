public class LoopsRecap {
    public static void main(String[] args) {
        //1
        printMultiplicationTableOfNum(8);
        //2
        printEvenNums(1, 100);
        //3
        printNumLoop(5);
        //4
        printDivisibleBy(1, 100, 3, 5);
        //
        printMultiplicationTable(1, 1, 1);
        //5
        printPowersOfNum(3, 100);
        //6
        printFibonacci(0, 1, 10);
        //7
        printPyramidPattern(5);
        //8
        printPrimeNumbers(4);
        //9
        printIncrement(4);
        //10
        printNumFactorial(5);
    }
    //1
    public static void printMultiplicationTableOfNum(int num) {
        System.out.printf("Multiplication table up to 10 of number %d:\n", num);
        for (int i = 0; i <= 10; i++) {
            int res = num * i;
            System.out.printf("%d ", res);
        }
    }
    //2
    public static void printEvenNums(int num1, int num2) {
        System.out.printf("\n\nList of even numbers from %d to %d:\n", num1, num2);
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d ",i);
            }
        }
    }
    //3
    public static void printNumLoop(int num) {
        System.out.printf("\n\nNumber's %d loop: \n", num);
        int previous = 0;
        for (int i = 0; i < num; i++) {
            int current = (int) (num * Math.pow(10, i) + previous);
            System.out.printf("%d ", current);
            previous = current;
        }
    }
    //4
    public static void printDivisibleBy(int num1, int num2, int by1, int by2) {
        System.out.printf("\n\nNumbers from %d to %d:", num1, num2);
        System.out.printf("\nDivided by %d: ", by1);
        for (int i = num1; i < num2; i++) {
            if (i % by1 == 0) {
                System.out.printf("%d ", i);
            }
        }
        System.out.printf("\nDivided by %d: ", by2);
        for (int i = num1; i < num2; i++) {
            if (i % by2 == 0) {
                System.out.printf("%d ", i);
            }
        }
        System.out.printf("\nDivided by %d: ", by1 * by2);
        for (int i = num1; i < num2; i++) {
            if (i % (by1 * by2) == 0) {
                System.out.printf("%d ", i);
            }
        }
        //or another method aka FizzBuzz
        System.out.printf("\n\nNumbers from %d to %d:\n", num1, num2);
        for (int i = num1; i < num2; i++) {
            if (i % (by1 * by2) == 0) {
                System.out.println("FizzBuzz");
            } else if (i % by1 == 0) {
                System.out.println("Fizz");
            } else if (i % by2 == 0) {
                System.out.println("Buzz");
            } else System.out.println(i);
        }
        //or another method with arrays
        System.out.printf("\nNumbers from %d to %d:\n", num1, num2);
        int[] divBy3 = new int[num2];
        int[] divBy5 = new int[num2];
        int[] divBy15 = new int[num2];
        int[] others = new int[num2];

        int counter3 = 0;
        int counter5 = 0;
        int counter15 = 0;
        int counterOthers = 0;

        for (int i = 1; i < num2; i++) {
            if (i % (by1 * by2) == 0) {
                divBy15[counter15] = i;
                counter15++;
            } else if (i % by1 == 0) {
                divBy3[counter3] = i;
                counter3++;
            } else if (i % by2 == 0) {
                divBy5[counter5] = i;
                counter5++;
            } else {
                others[counterOthers] = i;
                counterOthers++;
            }
        }
        System.out.printf("Divisible by 3: ");
        for (int i = 0; i < counter3; i++) {
            System.out.print(divBy3[i] + " ");
        }
        System.out.printf("\nDivisible by 5: ");
        for (int i = 0; i < counter5; i++) {
            System.out.print(divBy5[i] + " ");
        }
        System.out.printf("\nDivisible by 15: ");
        for (int i = 0; i < counter15; i++) {
            System.out.print(divBy15[i] + " ");
        }
        System.out.printf("\nOthers: ");
        for (int i = 0; i < counterOthers; i++) {
            System.out.print(others[i] + " ");
        }

    }
    //
    public static void printMultiplicationTable(int numFrom, int numTo, int multiplier) {
        System.out.printf("\n\nMultiplication table:");
        int numCount = numTo - numFrom;
        for (int i = 0; i <= numCount; i++) {
            System.out.printf("\n");
            for (int j = 0; j <= multiplier; j++) {
                int res = numFrom * j;
                System.out.printf("%d x %d = %d \n", numFrom, j, res);
            }
            numFrom++;
        }
    }
    //5
    public static void printPowersOfNum(int num, int limit) {
        System.out.printf("\nPowers of number %d under %d:\n", num, limit);
        for (int i = num; i < limit; i = i * num) {
            System.out.printf("%d ", i);
        }
    }
    //6
    public static void printFibonacci(int num1, int num2, int n) {
        System.out.printf("\n\nFibonacci series of %d terms: ", n);
        for (int i = 0; i < n; i++) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
    //7
    public static void printPyramidPattern(int num) {
        System.out.println("\n");
        int it = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < it; j++) {
                System.out.print(i);
            }
            System.out.println("");
            it += 2;
        }
    }
    //8
    public static void printPrimeNumbers(int limit) {
        System.out.printf("\nFirst %d prime numbers: ", limit);
        int primeNumbersCount = 1; // (1) is the first prime number
        int numberToCheck = 2;

        while (primeNumbersCount <= limit) {
            if (isPrime(numberToCheck)) {
                System.out.print(numberToCheck + " ");
                primeNumbersCount++;
            }
            numberToCheck++;
        }
    }
    public static boolean isPrime(int num) {
        if (num < 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        } return true;
    }
    //9
    public static void printIncrement(int n) {
        System.out.printf("\n\nFirst %d numbers with an %d increment: ", n, n);
        for (int i = n; i <= Math.pow(n, 2); i += n) {
            System.out.print(i + " ");
        }
    }
    //10
    public static void printNumFactorial(int n) {
        System.out.printf("\n\n%d! = ", n);
        int fact = 1;
        for (int i = 1; i <= n; i++) { //i=1 i=2 i=3 i=4 i=5
            fact = fact * i; //fact=1 fact=2 fact=6 fact=24 fact=120
            System.out.print(i + "*");
        }
        System.out.print("= " + fact);
    }
}
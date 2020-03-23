public class DataTypesRecap {
    public static void main(String[] args) {
        //1
        printSum(74, 36);

        //2
        printDivision(50, 3);

        //3
        printResultOfOperation1(-5, 8, 6);
        printResultOfOperation2(55, 9);
        printResultOfOperation3(20, -3, 5, 8);
        printResultOfOperation4(5, 15, 3, 2, 8);

        //4
        printResult(25.5, 3.5, 40.5, 4.5);

        //5
        printAreaAndPerimeterOfCircle(7.5);

        //6
        printAverageOfThreeNumbers(10, 20, 30);

        //7
        printAreaAndPerimeterOfRectangle(5.5, 8.5);

        //8
        printSwappedTwoVariables(5, 13);

        //9
        printComparison(25, 39);

        //10
        printDigitsSum(133);
    }

    //1
    private static void printSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.printf("%d + %d = %d\n", num1, num2, sum);
    }

    //2
    private static void printDivision(int num1, int num2) {
        int div = num1 / num2;
        int remainder = num1 % num2;
        System.out.printf("\n%d / %d = %d (remainder: %d)\n", num1, num2, div, remainder);
    }

    //3
    private static void printResultOfOperation1(int num1, int num2, int num3) {
        int result = num1 + num2 * num3;
        System.out.printf("\n%d + %d x %d = %d\n", num1, num2, num3, result);
    }
    private static void printResultOfOperation2(int num1, int num2) {
        int result = (num1 + num2) % num2;
        System.out.printf("\n(%d + %d) %s %d = %d\n", num1, num2, "%", num2, result);
    }
    private static void printResultOfOperation3(int num1, int num2, int num3, int num4) {
        int result = num1 + num2 * num3 / num4;
        System.out.printf("\n%d + %d x %d / %d = %d\n", num1, num2, num3, num4, result);
    }
    private static void printResultOfOperation4(int num1, int num2, int num3, int num4, int num5) {
        int result = num1 + num2 / num3 * num4 - num5 % num3;
        System.out.printf("\n%d + %d / %d x %d - %d %s %d = %d\n", num1, num2, num3, num4, num5, "%", num3, result);
    }

    //4
    private static void printResult(double num1, double num2, double num3, double num4) {
        double result = (num1 * num2 - num2 * num2) / (num3 - num4);
        System.out.printf("\n(%.1f x %.1f - %.1f x %.1f) / (%.1f - %.1f) = %.15f\n", num1, num2, num2, num2, num3, num4, result);
    }

    //5
    private static void printAreaAndPerimeterOfCircle(double radius) {
        double circleArea = Math.PI * Math.pow(radius, 2);
        double circlePerimeter = 2 * Math.PI * radius;
        System.out.printf("\nCircle: radius = %.1f Area = %.14f Perimeter = %.14f\n", radius, circleArea, circlePerimeter);
    }

    //6
    private static void printAverageOfThreeNumbers(int num1, int num2, int num3) {
        int average = (num1 + num2 + num3) / 3;
        System.out.printf("\nNumbers: %d, %d, %d Average = %d\n", num1, num2, num3, average);
    }

    //7
    private static void printAreaAndPerimeterOfRectangle(double width, double height) {
        double area = width * height;
        double perimeter = (width + height) * 2;
        System.out.printf("\nGeometric figure: Rectangle width = %.1f height = %.1f " +
                "Area = %.2f Perimeter = %.2f\n", width, height, area, perimeter);
    }

    //8
    private static void printSwappedTwoVariables(int num1, int num2) {
        System.out.printf("\na = %d b = %d => ", num1, num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.printf("a = %d b = %d\n", num1, num2);
        //or another method
        int a = 3;
        int b = 4;
        System.out.printf("a = %d b = %d => ", a, b);
        a = a + b; //7
        b = a - b; //3
        a = a - b; //4
        System.out.printf("a = %d b = %d\n\n", a, b);
    }

    //9
    private static void printComparison(int num1, int num2) {
        System.out.printf("Comparing %d with %d:\n", num1, num2);
        if (num1 == num2) {
            System.out.printf("%d = %d\n", num1, num2);
        } else {
            System.out.printf("%d != %d\n", num1, num2);
        }
        if (num1 > num2) {
            System.out.printf("%d > %d\n", num1, num2);
        }
        if (num1 >= num2) {
            System.out.printf("%d >= %d\n", num1, num2);
        }
        if (num1 < num2) {
            System.out.printf("%d < %d\n", num1, num2);
        }
        if (num1 <= num2) {
            System.out.printf("%d <= %d\n", num1, num2);
        }
    }

    //10
    private static void printDigitsSum(int num) {
        System.out.printf("\nThe number: %d ", num);
        int sum = 0;
        while (num > 0) {    // 133=true, 13=true, 1=true, 0=false -> END
            sum += num % 10; // 3, 3+3, 3+3+1
            num /= 10;       // 13, 1, 0
        }
        System.out.printf("Sum of number's digits = %d", sum);
    }
}
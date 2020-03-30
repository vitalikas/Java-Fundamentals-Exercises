import java.util.*;

public class ArraysRecap {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 10, 9};
        //1
        printArrSum(arr);
        //2
        printAverageValueOfArray(arr);
        //3
        printOddNumbersOfArray(arr);
        //4
        printMinAndMaxValueOfArray(arr);
        //5
        printReversedArray(arr);
        //6
        printCountOfEvenAndOddNumbersOfArr(arr);
        //7
        printArrayWithInsertedValue(arr);
        //8
        int[] arr1 = {1, 7, 3, 7, 10, 1, 9};
        printDuplicateValuesOfArr(arr1);
        //9
        printSecondLargestElementOfArray(arr);
        //10
        int[] arr2 = {1, 2, 7, 3, 10, 2, 9};
        int sum = 4;
        printPairsOfElementsWhoseSumIsEqualToSpecifiedNum(arr2, sum);
    }
    //1
    public static int printArrSum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        System.out.printf("Sum of values of array %s = %d", Arrays.toString(arr), sum);
        return sum;
    }
    //2
    public static void printAverageValueOfArray(int[] array) {
        int length = array.length;
        int avg = printArrSum(array) / length;
        System.out.printf("\n\nAverage value of array %s = %d", Arrays.toString(array), avg);
    }
    //3
    public static void printOddNumbersOfArray(int[] array) {
        System.out.printf("\n\nOdd numbers of array %s: ", Arrays.toString(array));
        for (int value : array) {
            if (value % 2 != 0) {
                System.out.print(value + " ");
            }
        }
    }
    //4
    public static void printMinAndMaxValueOfArray(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        System.out.printf("\n\nMin value of array %s = %d", Arrays.toString(array), min);
        System.out.printf("\nMax value of array %s = %d", Arrays.toString(array), max);
    }
    //5
    public static void printReversedArray(int[] array) {
        System.out.printf("\n\nArray before: %s", Arrays.toString(array));
        List<Integer> listOfNum = new ArrayList<>();
        for (int num : array) {
            listOfNum.add(num);
        }
        Collections.reverse(listOfNum);
        System.out.printf("\nArray after reverse: %s", listOfNum.toString());
        //my method with List
        List list = new ArrayList();
        for (int i = array.length - 1; i >= 0; i--) {
            list.add(array[i]);
        }
        System.out.printf("\n\nArray before: %s", Arrays.toString(array));
        System.out.printf("\nArray after reverse: %s", list);
    }
    //6
    public static void printCountOfEvenAndOddNumbersOfArr(int[] array) {
        int eventCount = 0;
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                eventCount++;
            } else oddCount++;
        }
        System.out.printf("\n\nArray's %s even numbers count is %d, odd numbers count is %d",
                Arrays.toString(array), eventCount, oddCount);
    }
    //7
    public static void printArrayWithInsertedValue(int[] array) {
        int index = 2;
        int value = 4;
        List list = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        list.add(index, value);
        System.out.printf("\n\nArray: %s\nValue to insert: %d at position: %d", Arrays.toString(array), value, index);
        System.out.printf("\nNew array: %s", list);
    }
    //8
    public static void printDuplicateValuesOfArr(int[] array) {
        System.out.printf("\n\nDuplicate values of %s: ", Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                }
            }
        }
        //another method with Set
        System.out.printf("\n\nDuplicate values of %s: ", Arrays.toString(array));
        Set<Integer> set = new HashSet<Integer>();
        for (int value : array) {
            if (set.add(value) == false) {
                System.out.print(value + " ");
            }
        }
    }
    //9
    public static void printSecondLargestElementOfArray(int[] array) {
        int n = 3;
        System.out.printf("\n\nArray = %s", Arrays.toString(array));
        System.out.printf("\nPosition of largest value: %d", n);
        Arrays.sort(array);
        int maxNValue = array[array.length-n];
        System.out.printf("\n%d largest element = %d", n, maxNValue);
    }
    //10
    public static void printPairsOfElementsWhoseSumIsEqualToSpecifiedNum(int[] array, int sum) {
        System.out.printf("\n\nArray = %s", Arrays.toString(array));
        System.out.printf("\nsum = %d\n", sum);
        // create an empty Hash Map
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            // check if pair (array[i], sum - array[i]) exists
            // if difference is seen before, print the pair
            if (map.containsKey(sum - array[i])) {
                System.out.println("Pair found at index " + map.get(sum - array[i]) + " and " + i);
            }
            // store index of current element in the map
            map.put(array[i], i);
            // System.out.println(map);
        }
        // No pair with given sum exists in the array
        // System.out.println("Pair not found");
        //or another method
        System.out.printf("\nArray = %s", Arrays.toString(array));
        System.out.printf("\nsum = %d\n", sum);
        System.out.printf("Pairs of elements: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    System.out.print(array[i] + "-" + array[j] + " ");
                }
            }
        }
    }
}

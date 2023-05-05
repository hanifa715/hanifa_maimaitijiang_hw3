import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        double numbers[] = {1.5, -7.2, 25, 56, -17.5, 87, -32.6, 23.5, 32, -45, -14, 71.5, -7, 2.4, 92};
        double sum = 0;
        int amount = 0;
        boolean isNegative = false;
        for (double num : numbers) {
            if (num < 0) {
                isNegative = true;
            } else if (num > 0 && isNegative) {
                sum += num;
                amount++;
                System.out.println(num);
            }
        }
        System.out.println("среднее арифметическое = " + sum / amount);
        Arrays.sort(numbers);
        for (double num : numbers) {
            System.out.print(num + ", ");
        }
        System.out.println();

        sortArray(numbers);
    }
    public static void sortArray(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    double temp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = temp;
                }
                System.out.println("Iteration " + (i + 1) + ": " + Arrays.toString(arr));
            }
            System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
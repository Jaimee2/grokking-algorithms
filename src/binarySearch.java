public class binarySearch {

    public static void main(String[] args) {
        System.out.println("Binary Search Algorithm");

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = binarySearch(array, 99);
        System.out.println("Result: " + result);

    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int midElement = low + high;
            if (arr[midElement] == key) return key;
            if (arr[midElement] > key) high = midElement - 1;
            if (arr[midElement] < key) low = midElement + 1;
        }

        return -1;

    }
}


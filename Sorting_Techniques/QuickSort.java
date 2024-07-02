package Sorting_Techniques;
public class QuickSort {
    
    // Function to partition the array and return the pivot index
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; // Choosing the first element as pivot
        int i = low; // Index of smaller element

        for (int j = low + 1; j <= high; j++) {
            // If current element is smaller than pivot
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[low] (pivot) and arr[i] (last smaller element position)
        int temp = arr[low];
        arr[low] = arr[i];
        arr[i] = temp;

        return i;
    }

    // Function to implement Quick Sort
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pi = partition(arr, low, high);

            // Recursively sort the elements before and after the pivot
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Main function to test the Quick Sort implementation
    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        int n = arr.length;

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

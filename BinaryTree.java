public class BinaryTree {
    public static void main(String[] args) {

        
 //Assignment : Binary Tree

//Use the recursive method to function binarySearch
//Updated Array values : int [] arr = { 21, 23, 51, 27, 9, 11, 18, 25, 58, 69, 90 };
//Use the existing void to create your own function to sort the values to Ascending Order
//Any used of Built-in Libraries is prohibited

        int[] arr = {21, 23, 51, 27, 9, 11, 18, 25, 58, 69, 90};

        // Sorting the array in ascending order using recursive method
        ascOrder(arr, arr.length);

        // Printing the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // New line after sorted array

        // Recursive binary search for number 27
        int index = binarySearch(arr, 27, 0, arr.length - 1);
        if (index != -1) {
            System.out.println("27 is at index " + index + " in the sorted array.");
        } else {
            System.out.println("27 is not found in the array.");
        }
    }

    // Recursive binary search function
    private static int binarySearch(int[] numbers, int numberToFind, int low, int high) {
        if (low > high) {
            return -1; 
        }

        int middlePosition = (low + high) / 2;
        int middleNumber = numbers[middlePosition];

        if (numberToFind == middleNumber) {
            return middlePosition; 
        }

        if (numberToFind < middleNumber) {
            return binarySearch(numbers, numberToFind, low, middlePosition - 1); 
        } else {
            return binarySearch(numbers, numberToFind, middlePosition + 1, high); 
        }
    }

    // Recursive method to sort the array in ascending order 
    private static void ascOrder(int[] arr, int n) {
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap arr[i] and arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        // it will call the function to sort the remaining array
        ascOrder(arr, n - 1);
    }
}

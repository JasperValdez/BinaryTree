import java.util.Arrays;

public class BinaryTree {
    public static void main(String[] args) {

//Assignment : Binary Tree

//Use the recursive method to function binarySearch
//Updated Array values : int [] arr = { 21, 23, 51, 27, 9, 11, 18, 25, 58, 69, 90 };
//Use the existing void to create your own function to sort the values to Ascending Order
//Any used of Built-in Libraries is prohibited
        
        int [] arr = {21, 23, 51, 27, 9, 11, 18, 25, 58, 69, 90 };
       
        ascOrder(arr);

        // for(int i = 0; i< arr.length; i++){
        //     System.out.println(arr[i] + " ");
        int index = binarySearch(arr, 27, 0, arr.length - 1);
        if (index != -1) {

            System.out.println();
     System.out.println("27 is at index " + index + " is the Index Number  ");
    } else {
        System.out.println("27 is not found in the array.");
    }
   
    
        System.out.println(Arrays.binarySearch(arr, 27)+ "" + " is the Built-in Index :");

    }
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

    private static void ascOrder (int [] arr){
        
        // Outer loop
        for (int i = 0; i < arr.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < arr.length; j++) {

                // Checking elements
                int temp = 0;
                if (arr[j] < arr[i]) {

                    // Swapping
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            // Printing sorted array elements
            System.out.println(arr[i] + " ");

    }
}
}
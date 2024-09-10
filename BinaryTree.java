import java.util.Arrays;

public class BinaryTree {
    public static void main(String[] args) {
        
        int [] arr = {21, 23, 51, 27, 9, 11, 18, 25, 58, 69, 90 };
       
        ascOrder(arr);

        // for(int i = 0; i< arr.length; i++){
        //     System.out.println(arr[i] + " ");
        
        System.out.println(binarySearch(arr, 27) +"" + " is the Index Number : ");
    
        System.out.println(Arrays.binarySearch(arr, 27)+ "" + " is the Built-in Index :");

    }
    private static int binarySearch(int [] numbers, int numberToFind){
        int low = 0;
        int high = numbers.length -1;

        while (low <= high) {
            int middlePosition = (low + high) /2;
            int middleNumber = numbers[middlePosition];

            if(numberToFind == middleNumber){
                return middlePosition;
            }
            if(numberToFind < middleNumber){
                high = middlePosition-1;
            }else{
                low = middlePosition+1;
            }
      }
      return -1;
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
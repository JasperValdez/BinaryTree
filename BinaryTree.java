
public class BinaryTree {
    public static void main(String[] args) {
    
        int [] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        System.out.println(binarySearch(arr, 11) +"" + " is the Index Number : ");

        System.out.println("PUTANGINA MO JAI");

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
}
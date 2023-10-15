public class FindLargestElement {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 32, 90, 8, 51, 62};
        
        int largest = findLargestElement(numbers);
        
        System.out.println("The largest element in the array is: " + largest);
    }
    
    public static int findLargestElement(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        
        int largest = arr[0]; // Assume the first element is the largest
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        return largest;
    }
}

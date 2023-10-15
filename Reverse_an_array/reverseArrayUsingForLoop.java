public class ReverseArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] reversedArray = reverseArray(originalArray);

        // Print the reversed array
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }

    public static int[] reverseArray(int[] arr) {
        int length = arr.length;
        int[] reversed = new int[length];

        for (int i = 0; i < length; i++) {
            reversed[i] = arr[length - 1 - i];
        }

        return reversed;
    }
}

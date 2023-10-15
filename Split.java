public int minSum(int num) {
    // Convert the integer to a string
    String numStr = String.valueOf(num);
    
    // Initialize an array to count the occurrences of each digit
    int[] digitCount = new int[10];
    
    // Count the occurrences of each digit
    for (char digit : numStr.toCharArray()) {
        int d = digit - '0';
        digitCount[d]++;
    }
    
    // Initialize two strings to build new1 and new2
    StringBuilder new1 = new StringBuilder();
    StringBuilder new2 = new StringBuilder();
    
    // Construct new1 and new2 while minimizing their values
    for (int digit = 1; digit <= 9; digit++) {
        while (digitCount[digit] > 0) {
            if (new1.length() == 0 || new2.length() == 0) {
                new1.append(digit);
                new2.append(digit);
            } else {
                // Place the digit in the smaller number
                int val1 = Integer.parseInt(new1.toString() + digit);
                int val2 = Integer.parseInt(new2.toString() + digit);
                
                if (val1 <= val2) {
                    new1.append(digit);
                } else {
                    new2.append(digit);
                }
            }
            
            // Decrement the count of the used digit
            digitCount[digit]--;
        }
    }
    
    // Convert new1 and new2 to integers and return their sum
    int sum = Integer.parseInt(new1.toString()) + Integer.parseInt(new2.toString());
    return sum;
}

public static void main(String[] args) {
    int num1 = 2932;
    int num2 = 4009;
    
    Solution solution = new Solution();
    System.out.println(solution.minSum(num1)); // Output: 52
    System.out.println(solution.minSum(num2)); // Output: 13
}

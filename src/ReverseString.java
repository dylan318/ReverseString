public class ReverseString {
    public static void main(String[] args) {
        
        String inputString = "Hello";
        String reversedString = reverseString(inputString);
        System.out.println(reversedString);
    }

    
    public static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            
            start++;
            end--;
        }

        
        return new String(charArray);
    }
}

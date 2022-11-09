package Harshad;

public class Harshad {
    
    /*
     * A number is said to be Harshad if it's exactly divisible by the 
     * sum of its digits. Create a function that determines whether a
     * number is a Harshad or not.
     * 11/7/22
     */
    public static int sumDigits(int num) {
        if (num < 1) return 0;
        int digit = num % 10;
        int nextNum = num / 10;
        return digit + sumDigits(nextNum);
    }
    public static boolean isHarshad(int num) {
        return num % sumDigits(num) == 0;
    }
    
    public static void main(String[] args) {
        System.out.println(isHarshad(75)); // false
        System.out.println(isHarshad(171)); // true
        System.out.println(isHarshad(481)); // true
        System.out.println(isHarshad(89)); // false
        System.out.println(isHarshad(516)); // true
        System.out.println(isHarshad(200)); // true
    }
}
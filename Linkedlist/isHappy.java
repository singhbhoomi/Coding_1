import java.util.LinkedList;

public class isHappy {
    public static boolean isHappy(int n) {
        LinkedList<Integer> seen = new LinkedList<>();
        while (n != 1) {
            if (seen.contains(n)) {
                return false;
            }
            seen.add(n);
            n = getSumOfSquares(n);
        }
        return true;
    }

    private static int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19)); 
        System.out.println(isHappy(2));  
    }
}

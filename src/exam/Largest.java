package exam;

public class Largest {
    public static void main(String[] args) {
        int sum = sumOfTwoLargestNumbers(3,4,5);
        System.out.println("Sum of two largest numbers - " + sum);
    }
    public static int sumOfTwoLargestNumbers(int num1, int num2, int num3) {
        int largest = Math.max(num1, Math.max(num2, num3));
        int secondLargest;
        if (num1 == largest) {
            secondLargest = Math.max(num2, num3);
        } else if (num2 == largest) {
            secondLargest = Math.max(num1, num3);
        } else {
            secondLargest = Math.max(num1, num2);
        }
        return largest + secondLargest;
    }
}

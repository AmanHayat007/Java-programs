public class ComparisonOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num1 + " is not greater than " + num2);
        }

        if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } else {
            System.out.println(num1 + " is not less than " + num2);
        }

        if (num1 == num2) {
            System.out.println(num1 + " is equal to " + num2);
        } else {
            System.out.println(num1 + " is not equal to " + num2);
        }

        if (num1 != num2) {
            System.out.println(num1 + " is not equal to " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
    }
}

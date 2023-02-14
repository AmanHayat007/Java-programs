import java.util.*;
public class Add {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = scanner.nextInt();
            
            if (choice == 1) {
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                int sum = add(num1, num2);
                System.out.println(sum);
            } else if (choice == 2) {
                String str1 = scanner.next();
                String str2 = scanner.next();
                String concatenatedStr = add(str1, str2);
                System.out.println(concatenatedStr);
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static String add(String str1, String str2) {
        return str1 + str2;
    }

    
}

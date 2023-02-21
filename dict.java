import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dict {
    private Map<String, String> words;

    public dict() {
        words = new HashMap<>();
    }

    public void addWord(String word, String definition) {
        words.put(word, definition);
    }

    public String findDefinition(String word) {
        return words.get(word);
    }

    public static void main(String[] args) {
        dict dictionary = new dict();
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("1. Add word");
                System.out.println("2. Find definition");
                System.out.println("3. Quit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();
                if (choice == 1) {
                    System.out.print("Enter word: ");
                    String word = sc.nextLine();
                    System.out.print("Enter definition: ");
                    String definition = sc.nextLine();
                    dictionary.addWord(word, definition);
                } else if (choice == 2) {
                    System.out.print("Enter word: ");
                    String word = sc.nextLine();
                    String definition = dictionary.findDefinition(word);
                    if (definition != null) {
                        System.out.println("Definition: " + definition);
                    } else {
                        System.out.println("Word not found");
                    }
                } else if (choice == 3) {
                    break;
                } else {
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}


import java.util.TreeSet;// I use TreeSet because it prints strings and numbers in sorted form automatically
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter name of student :");
            String name = scanner.nextLine();
            names.add(name);
        }

        System.out.println("\nThe student list in sorted order:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}


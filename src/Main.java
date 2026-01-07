import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter you name:");
            String name = scanner.nextLine();
            System.out.println("Enter your purpose:");
            String purpose = scanner.nextLine();

            if(Objects.equals(purpose, "SDE 2")){
                System.out.println("This is your name and purpose:" + name + " " + purpose);
                System.out.printf("This is your name and purpose: %s %s%n", name, purpose);
            } else {
                System.out.println("You might fail in life.");
            }

    }
}
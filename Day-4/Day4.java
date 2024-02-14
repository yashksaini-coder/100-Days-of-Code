import java.util.Scanner;

public class Day4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of iterations for the loop: ");
        int iterations = scanner.nextInt();

        for (int i = 1; i <= iterations; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}

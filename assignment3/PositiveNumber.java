import java.util.Scanner;

public class PositiveNumber {
    static void askForPositiveNumber(Scanner num_in) {
        int num; 
        
        do {
            System.out.print("Enter a positive number: ");
            num = num_in.nextInt(); 
            
        } while (num <= 0);

        System.out.println("You entered a positive number: " + num);
    }

    public static void main(String[] args) {
        Scanner num_in = new Scanner(System.in);

        askForPositiveNumber(num_in);
        
        num_in.close(); 
    }
}

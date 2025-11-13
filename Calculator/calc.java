import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again = "y";

        // TODO: Use a while loop to keep calculating while 'again' is 'y'
        while (again.equalsIgnoreCase("y")) {

            // TODO: Ask user for two numbers

            System.out.print("Enter first number: ");
            int num1 = input.nextInt();

            System.out.print("\nEnter second number: ");
            int num2 = input.nextInt();

            // TODO: Ask user for the operation (+, -, *, /)
            System.out.print("\nChoose operation (+, -, *, /): ");
            char op = input.next().charAt(0);

            // TODO: Use if-else to perform the operation
            switch (op) {
                case '+':
                    System.out.print("\nResult: ");
                    System.out.print(num1 + num2);
                    break;
                case '-':
                    System.out.print("\nResult: ");
                    System.out.print(num1 - num2);
                    break;
                case '*':
                    System.out.print("\nResult: ");
                    System.out.print(num1 * num2);
                    break;
                case '/':
                    if(num2==0){
                        System.out.print("\nCannot divide by zero.");
                        break;
                    }
                    System.out.print("\nResult: ");
                    System.out.print(num1 / num2);
                    break;

                default:
                    break;
            }

            // TODO: Handle division by zero case
            
            // TODO: Ask if user wants to continue
            input.nextLine(); //clear buffer
            System.out.print("\nDo you want to calculate again? (y/n): ");
            again=input.nextLine();
            // TODO: Exit the loop and print a thank you message
        }
        System.out.print("\nThank you for using the calculator.");
        input.close();
    }
}

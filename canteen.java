import java.util.Scanner;

public class Canteen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] food = {
            "Siopao",
            "Fried Potato",
            "Sitted Chicken",
            "Hotdogetti",
            "Beer"
        };

        double[] price = {
            50.00,
            30.00,
            80.00,
            60.00,
            250.00
        };

        int totalQuantity = 0;
        double totalAmount = 0;
        boolean student = false;
        boolean studentStatusSet = false;

        System.out.println("===== CANTEEN MENU =====");

        for (int i = 0; i < food.length; i++) {
            System.out.printf("%d. %-12s P%.2f%n", i + 1, food[i], price[i]);
        }

        char again = 'Y';

        while (again == 'Y' || again == 'y') {

            System.out.println("\n===== ORDER =====");

            System.out.print("Enter item number: ");
            int item = input.nextInt();

            System.out.print("Enter quantity (1-10): ");
            int quantity = input.nextInt();

            System.out.print("Are you a student? (Y/N): ");
            char status = input.next().charAt(0);

          
            if (item < 1 || item > 5) {
                System.out.println("Invalid item number. Please try again.");
                continue;
            }

           
            if (quantity < 1 || quantity > 10) {
                System.out.println("Invalid quantity. Please enter 1-10.");
                continue;
            }

            
            if (status != 'Y' && status != 'y' &&
                status != 'N' && status != 'n') {
                System.out.println("Invalid student status. Please enter Y or N.");
                continue;
            }

            
            if (!studentStatusSet) {
                student = (status == 'Y' || status == 'y');
                studentStatusSet = true;
            }

            
            double orderAmount = price[item - 1] * quantity;

            totalQuantity += quantity;
            totalAmount += orderAmount;

            System.out.printf("Order accepted. Amount: P%.2f%n", orderAmount);

            System.out.print("Do you want to order again? (Y/N): ");
            again = input.next().charAt(0);
        }

        
        double deduction;

        if (student && totalAmount >= 500) {
            deduction = totalAmount * 0.15;
        }
        else if (student) {
            deduction = totalAmount * 0.10;
        }
        else if (totalAmount >= 500) {
            deduction = totalAmount * 0.05;
        }
        else {
            deduction = 0;
        }

        double finalAmount = totalAmount - deduction;

        
        System.out.println("\n===== FINAL COMPUTATION =====");
        System.out.println("Total quantity of items purchased: " + totalQuantity);
        System.out.printf("Total amount before deduction: P%.2f%n", totalAmount);
        System.out.printf("Total deduction: P%.2f%n", deduction);
        System.out.printf("Final amount to pay: P%.2f%n", finalAmount);

        input.close();
    }
}
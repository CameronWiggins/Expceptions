import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number to find its Factors. (or Enter exit to leave the Program)");
        String userInput = scan.nextLine();

        while(!(userInput.equals("exit")))
        {
            try 
            {
                Integer.parseInt(userInput);
            }

            catch(NumberFormatException error)
            {
                System.out.println("Invalid Input " + error.getMessage());
            }

            int num = Integer.parseInt(userInput);

            System.out.println("Enter a Number to find its Factors. (or Enter exit to leave the Program)");
            userInput = scan.nextLine();
        }

        
    }
}



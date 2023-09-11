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
                int num = Integer.parseInt(userInput);
                System.out.print("Factors: 1, " + num);
                factor(num);
            }

            catch(NumberFormatException error)
            {
                System.out.println("Invalid Input " + error.getMessage());
            }

            System.out.println("");
            System.out.println("Enter a Number to find its Factors. (or Enter exit to leave the Program)");
            userInput = scan.nextLine();
        }
    }

    public static void factor(int num)
        {
            for (int i = 2; i < num; i++)
            {
                if ((num % i) == 0)
                {
                    System.out.print(", " + i);
                }
            }
        }
}



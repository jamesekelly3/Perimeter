import java.util.Scanner;

public class SquaresAndCubes {

    public static void main(String[] args)
    {
        // Welcome the user
        System.out.println("Learn your squares and cubes"+"\n");
        
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        do
        {
            // Get input from the user
            System.out.print("Enter an integer: ");
            int integer = sc.nextInt();

            // Create a header
            String header = "Number \t" + "Squared " + "Cubed \t" + "\n"
                        +   "====== \t" + "======= " + "===== \t   ";
            System.out.println(header);

            int square = 0;
            int cube = 0;

            String row = "";
            for (int i = 1; i <= integer; i++)
            {

                square = i * i;
                cube = i * i * i;

                row = i + "\t" + square + "\t" + cube;
                System.out.println(row);
            }
            // See if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();

        }
        while (!choice.equalsIgnoreCase("n"));  
    }
}

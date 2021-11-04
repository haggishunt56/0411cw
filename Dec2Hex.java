import java.util.Scanner;

class Dec2Hex
{

    public static int Arg1;

    public static void main(String args[])
    {
        //Dec2HexTest.testAll();
        System.out.println(run(args));
    }

    public static String run(String args[]) {
        try {
            Arg1 = Integer.parseInt(args[0]);
            int num;
            num = Arg1;
            System.out.println("Converting the Decimal Value " + num + " to Hex...");

            String hexadecimal=convert(num);
            if(hexadecimal == null) {
                return "There was an error processing your request, please try again";
            } else {
                return "Hexadecimal representation is: " + hexadecimal;
            }

        } catch(IndexOutOfBoundsException e) {
            return "Please provide a value to convert.";
        } catch(NumberFormatException e) {
            return "Error: value entered is invalid. Please provide a single integer value only";
        }
    }

    public static String convert(int input) {
        try {
            char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            String output = "";
            int rem;

            while (input != 0) {
                rem = input % 16;
                output = ch[rem] + output;
                input = input / 16;
            }

            return output;
        } catch(Exception e) {
            return null;
        }
    }
}
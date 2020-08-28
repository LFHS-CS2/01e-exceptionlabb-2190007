import java.io.*;

class ExceptionLabB
{
    public static void main (String args[]) throws IOException
    {
        int numberOne = 0, numberTwo = 0;
        while (numberOne != -99999)
        {
            try
            {
                BufferedReader console = new BufferedReader (new InputStreamReader (System.in));
                System.out.println ("Please enter one number (-99999 to stop):");
                String input = console.readLine ();
                numberOne = Integer.parseInt (input);
                if (numberOne == -99999)
                    break;
                System.out.println ("Please enter another number:");
                input = console.readLine ();
                numberTwo = Integer.parseInt (input);

                int numberThree = numberOne / numberTwo;
                System.out.println ("numberOne divided by numberTwo = " + numberThree);
            }
            catch (IOException IOE)
            {
                System.err.println ("Input Error ");
            }
            catch (NumberFormatException NFE)
            {
                System.err.println ("Not a number: " + NFE);
            }
            catch (ArithmeticException AE)
            {
                System.err.println ("Division by Zero Exception ");
            }
            catch (Exception E)
            {
                System.err.println ("General Exception ");
            }
        }
        System.out.println ("Goodbye");
    }
}


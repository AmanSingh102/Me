public class Java_12_Exception_Hnadling_Understanding 
{
    public static void main(String[] args) 
    {
        simpleExceptionHandling();
        multipleCatchBlock();

        System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n");
        finallyBlockCase1();
        //finallyBlockCase2();   

        /* ^^^^^^^^^^ remove for see the result 
           but then methods below of 
           this method will not be run okay, so careful*/

        finallyBlockCase3();
        System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n");

        NestedBlock();
    }

    static void simpleExceptionHandling()
    {
        System.out.println("\n---- Simple Exception Handling ----\n");
        
        int a = 1, b = 2, c = 0;
        try
        {
            a = b/c;
            System.out.println(a);
        }
        catch( ArithmeticException e )
        {
            System.out.println(e);
        }

        System.out.println("Rest of the code");

        System.out.println("\n-----------------------------------\n");
    }

    static void multipleCatchBlock()
    {
        System.out.println("\n---- Multiple Catch Block ----\n");

        try
        {
            int[] array = new int[3];
            array[5] = 30/0;
        }
        catch( ArithmeticException e )
        {
            System.out.print(e);
            System.out.print("    <--- At a time only one catch block is executed");
            System.out.println("\nYou can't divide any number by zero");
        }
        catch( ArrayIndexOutOfBoundsException e )
        {
            System.out.println(e);
            System.out.println("The size of lesser than you enter");
        }
        catch( Exception e )
        {
            System.out.println(e);
            System.out.println("Reat Exception");
        }

        System.out.println("Rest of the code");
        System.out.println("\n------------------------------\n");
    }

    static void finallyBlockCase1()
    {
        System.out.println("\n---- Finally Block Understanding ----\n");

        System.out.println("---- CASE : 1 ----");
        try
        {
            int result = 30 / 10;
            System.out.printf("Result = %d",result);
        }
        catch( NullPointerException e )
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("\nFinally block is always executed");
        }

        System.out.println("Rest of the code");

        System.out.println("\n-------------------------------------\n");
    }

    static void finallyBlockCase2()
    {
        System.out.println("\n---- Finally Block Understanding ----\n");

        System.out.println("\n---- CASE : 2 ----");
        try
        {
            int result = 2 / 0;
            System.out.println("\n" + result);
        }
        catch( NullPointerException e )
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("\nFinally block is always executed but exeception occurs and not be handled");
        }

        System.out.println("Rest of the code");

        System.out.println("\n-------------------------------------\n");
    }

    static void finallyBlockCase3()
    {
        System.out.println("\n---- Finally Block Understanding ----\n");

        System.out.println("\n---- CASE : 3 ----");
        try
        {
            int result = 2 / 0;
            System.out.println(result);
        }
        catch( ArithmeticException e )
        {
            System.out.println("\n" + e);
        }
        finally
        {
            System.out.println("\nFinally block is always executed");
            System.out.println("Where exception occurs and handled");
        }

        System.out.println("Rest of the code");

        System.out.println("\n-------------------------------------\n");
    }

    static void NestedBlock()
    {
        System.out.println("\n---- Nested try Block Understanding ----\n");
        
        try
        {
            try
            {
                System.out.println("First try Block");
                int result = 2/0;
                System.out.println(result);
            }
            catch( ArithmeticException e )
            {
                System.out.println(e);
            }

            try
            {
                System.out.println("\nSecond try Block");
                int[] numArray = new int[2];
                numArray[5] = 30;
            }
            catch( ArrayIndexOutOfBoundsException e )
            {
                System.out.println(e);
            }

            System.out.println("\nI am printed after the first and second try block");

        }
        catch( Exception e )
        {
            System.out.println("All exception handeled");
        }

        System.out.println("\n---------------------------------------\n");
    }
}

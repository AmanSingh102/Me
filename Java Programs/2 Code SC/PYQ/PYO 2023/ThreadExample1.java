class GenerateThread extends Thread
{
    public void run()
    {
        for( int i = 1; i <= 200; i++ )
        {
            System.out.print( i + " " );
        }
    }
}

public class ThreadExample1 
{
    public static void main(String[] args) 
    {
        startThreading();
    }    

    private static void startThreading()
    {
        GenerateThread gt1 = new GenerateThread();
        GenerateThread gt2 = new GenerateThread();

        gt1.start();
        gt2.start();
    }
}

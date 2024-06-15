class GenerateThread extends Thread
{
    public void run()
    {
        for( int i = 0; i < 5; i++ )
        {
            try
            {
                Thread.sleep(500);
            }
            catch( InterruptedException e )
            {
                System.out.println(e);
            }

            System.out.println();
        }
    }
}

public class ThreadExample3 
{
    public static void main(String[] args) 
    {
        GenerateThread gt1 = new GenerateThread();
        GenerateThread gt2 = new GenerateThread();
        
        System.out.println("State of thread gt1 after creating it - " + gt1.getState());  //NEW

        gt1.start();

        System.out.println("State of thread gt1 after calling gt1.start() method - " + gt1.getState());  //RUNNABLE

        gt2.start();    // moving gt2 to runnable state
        
        // moving gt1 to timed waiting state
        try
        {
            Thread.sleep(200);
        }
        catch( InterruptedException e )
        {
            e.printStackTrace();
        }
        System.out.println("State of thread gt1 after calling sleep() method on it - " + gt1.getState());   // TIMED_WAITING

        try
        {
            gt1.join();   // waiting for gt1 tpo die
        }
        catch( InterruptedException e )
        {
            e.printStackTrace();
        } 
        System.out.println("State of thread gt1 after completion - " + gt1.getState());

    }    
}

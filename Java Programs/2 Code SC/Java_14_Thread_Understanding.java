class Generate1 extends Thread
{
    public void run()
    {
        for( int i = 1; i<= 200; i++ )
        {
            System.out.print(i + " ");
        }
    }
}

class Generate2 extends Thread
{
    public void run()
    {
        int i = 1;
        try
        {
            if( i == 50 )
            {
                Thread.sleep(1000);
            }
        }
        catch( InterruptedException e)
        {
            System.out.println(e);
        }


        for( i = 1 ; i <= 200; i++ )
        {
            System.out.print(i + " ");
        }
    }
}


public class Java_14_Thread_Understanding
{
    public static void main(String[] args) 
    {
        // RUN ONE BY ONE FOR UNDERSTANDING BY COMMENT THE METHOD

        startFirstThreading();
        
        startFirstThreadingWithMaxPriority();
        startFirstThreadingWithMinPriority();
        startFirstThreadingWithNormalPriority();

        startSecondThreading();
    }

    private static void startFirstThreading()
    {
        Generate1 g1 = new Generate1();
        Generate1 g2 = new Generate1();
        
        System.out.println("\n---- Thread Understanding ----");
        g1.start();
        g2.start();
    }

    private static void startFirstThreadingWithMaxPriority()
    {
        Generate1 g1 = new Generate1();
        Generate1 g2 = new Generate1();
        
        System.out.println("\n---- Thread Understanding With Max Priority ----");

        g1.setPriority(Thread.MAX_PRIORITY);
        g1.getPriority();

        g1.start();
        g2.start();
    }

    private static void startFirstThreadingWithMinPriority()
    {
        Generate1 g1 = new Generate1();
        Generate1 g2 = new Generate1();
        
        System.out.println("\n---- Thread Understanding With Min Priority ----");

        g1.setPriority(Thread.MIN_PRIORITY);
        g1.getPriority();

        g1.start();
        g2.start();
    }

    private static void startFirstThreadingWithNormalPriority()
    {
        Generate1 g1 = new Generate1();
        Generate1 g2 = new Generate1();
        
        System.out.println("\n---- Thread Understanding With Normal Priority ----");

        g1.setPriority(Thread.NORM_PRIORITY);
        g1.getPriority();

        g1.start();
        g2.start();
    }
   
    private static void startSecondThreading()
    {
        Generate2 g1 = new Generate2();
        Generate2 g2 = new Generate2();
        
        System.out.println("\n---- Thread Understanding With Sleep Time ----");
        g1.start();
        g2.start();
    }
}

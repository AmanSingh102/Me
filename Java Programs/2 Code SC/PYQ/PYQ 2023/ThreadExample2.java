class GenerateThread extends Thread
{
    private String threadName;

    GenerateThread( String name )
    {
        this.threadName = name;
    }

    public void run()
    {
        for( int i = 0; i < 200; i++ ) 
        {
            System.out.println( threadName + " is running...");    
        }
    }
}

public class ThreadExample2 
{
    public static void main(String[] args) 
    {
        GenerateThread gt1 = new GenerateThread("Thread 1");
        GenerateThread gt2 = new GenerateThread("Thread 2");

        gt1.start();
        gt2.start();
    }    
}

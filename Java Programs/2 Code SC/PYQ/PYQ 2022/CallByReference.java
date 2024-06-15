public class CallByReference 
{
    int data = 50;
    
    void change( CallByReference object )
    {
        object.data = object.data + 100;
    }

    public static void main(String args[])
    {
        CallByReference classObject = new CallByReference();
        System.out.println("Before Change : " + classObject.data);

        classObject.change(classObject);        // Passing Object
        System.out.println("After Change : " + classObject.data);
    }
}

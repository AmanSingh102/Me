class Phone  // Parent Class
{   
    void ring() { System.out.println("Ringing...."); }
    void call() { System.out.println("Calling...."); }
    void sms()  { System.out.println("Messaging....");}
}

class SmartPhone extends Phone  // Child Class
{
    void whatsapp() { System.out.println("Typing...."); }
    void insta()    { System.out.println("Scrolling.....");} 
    void mxPlayer() { System.out.println("Playing...."); }
    void pubg()     { System.out.println("Winner Winner Chicken Dinner !!!!"); }
    void youtube()  { System.out.println("Youtube opening...."); }
    void camera()   { System.out.println("Recording....");}
} 

public class Java_9_Inheritance_Understanding 
{
    public static void main(String[] args) 
    {
        System.out.println("\n------ Inheritance Unerstanding ------\n");

        SmartPhone Samsung = new SmartPhone();
        Samsung.whatsapp();
        System.out.println();

        SmartPhone Asus = new SmartPhone();
        Asus.pubg();
        System.out.println();

        SmartPhone Lenovo = new SmartPhone();
        Lenovo.mxPlayer();
        System.out.println();

        SmartPhone Redmi = new SmartPhone();
        Redmi.insta();
        System.out.println();

        SmartPhone Google = new SmartPhone();
        Google.youtube();
        System.out.println();

        SmartPhone IPhone = new SmartPhone();
        IPhone.camera();
        System.out.println();

        Phone NokiaKeypad = new Phone();
        NokiaKeypad.call();
        System.out.println();

        Phone MicromaxKeypad = new Phone();
        MicromaxKeypad.ring();    
        System.out.println();

        Phone KarbonKeypad = new Phone();
        KarbonKeypad.sms();    
        System.out.println();

        System.out.println("--------------------------------------\n");
    }  
}

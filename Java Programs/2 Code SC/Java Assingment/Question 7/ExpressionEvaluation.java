// Q7. Write a Java program to find the value of a specified expression. 
// (a) 101 + 0) / 3
// (b) 3.0e-6 * 10000000.1
// (c) true && true
// (d) false && true
// (e) (false && false) || (true && true)
// (f) (false || false) && (true & true)

public class ExpressionEvaluation 
{
    public static void main(String[] args) 
    {
        double resultA = (101 + 0) / 3.0;
        System.out.println("Result of (a) : " + resultA);
        
        double resultB = 3.0e-6 * 10000000.1;
        System.out.println("Result of (b) : " + resultB);
        
        boolean resultC = true && true;
        System.out.println("Result of (c) : " + resultC);
        
        boolean resultD = false && true;
        System.out.println("Result of (d) : " + resultD);
        
        boolean resultE = (false && false) || (true && true);
        System.out.println("Result of (e) : " + resultE);
        
        boolean resultF = (false || false) && (true && true);
        System.out.println("Result of (f) : " + resultF);
    }
}

// Output :-
// Result of (a) : 33.666666666666664
// Result of (b) : 30.0000003
// Result of (c) : true      
// Result of (d) : false     
// Result of (e) : true      
// Result of (f) : false  
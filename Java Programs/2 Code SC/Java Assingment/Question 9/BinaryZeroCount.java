// Q9. Write a Java program that will accept an integer and convert it into a binary representation. Now count the number of bits equal to zero in this representation.
import java.util.Scanner;

public class BinaryZeroCount 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number : ");
        int number = sc.nextInt();

        String binary = Integer.toBinaryString(number);
        System.out.println("Binary representation of " + number + " is : " + binary);

        int zeroCount = countZeroBits(binary);
        System.out.println("Number of zero bits : " + zeroCount);

        sc.close();
    }

    public static int countZeroBits(String binary) 
    {
        int zeroCount = 0;
        for (int i = 0; i < binary.length(); i++) 
        {
            if (binary.charAt(i) == '0') 
            {
                zeroCount++;
            }
        }

        return zeroCount;
    }
}

// Output :-
// Enter Decimal Number : 8
// Binary representation of 8 is : 1000
// Number of zero bits : 3
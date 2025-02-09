Module Module1

    Sub Main()

        Console.Write("Enter the First Number : ")
        Dim num1 As Integer = Console.ReadLine()
        Console.Write("Enter the First Number : ")
        Dim num2 As Integer = Console.ReadLine()

        Console.WriteLine($"Before Swapping {num1} and {num2}")

        Dim temp As Integer = num1
        num1 = num2
        num2 = temp

        Console.WriteLine($"After Swapping {num1} and {num2}")

        Console.ReadKey()

    End Sub

End Module

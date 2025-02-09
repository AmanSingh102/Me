Module Module1

    Sub Main()
        Dim num1, num2, result As Integer

        Console.Write("Enter the first number : ")
        num1 = Console.ReadLine()
        Console.Write("Enter the second number : ")
        num2 = Console.ReadLine()

        result = num1 + num2
        Console.WriteLine("Sum of {0} and {1} is {2}", num1, num2, result)
        Console.ReadKey()
    End Sub

End Module

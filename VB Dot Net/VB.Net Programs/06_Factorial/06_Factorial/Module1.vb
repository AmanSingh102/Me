Module Module1

    Sub Main()

        Dim num As Integer
        Dim fact As Integer = 1

        Console.Write("Enter the number : ")
        num = Console.ReadLine()

        For i As Integer = 1 To num Step 1
            fact *= i
        Next

        Console.WriteLine("Factorial of {0} is {1}", num, fact)
        Console.ReadKey()

    End Sub

End Module

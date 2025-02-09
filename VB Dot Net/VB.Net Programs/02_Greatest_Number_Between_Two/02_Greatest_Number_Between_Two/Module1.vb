Module Module1

    Sub Main()

        Dim num1, num2 As Integer

        Console.Write("Enter the first number : ")
        num1 = Console.ReadLine()
        Console.Write("Enter the second number : ")
        num2 = Console.ReadLine()

        If num1 > num2 Then
            Console.WriteLine("{0} is greater than {1}", num1, num2)
        Else
            Console.WriteLine("{0} is greater than {1}", num2, num1)
        End If

        Console.ReadKey()

    End Sub

End Module

Module Module1

    Sub Main()

        Dim num1, num2, num3 As Integer

        Console.Write("Enter the first number : ")
        num1 = Console.ReadLine()
        Console.Write("Enter the second number : ")
        num2 = Console.ReadLine()
        Console.Write("Enter the third number : ")
        num3 = Console.ReadLine()

        If num1 > num2 Then
            If num1 > num3 Then
                Console.WriteLine("{0} is Greatest Number", num1)
            Else
                Console.WriteLine("{0} is Greatest Number", num3)
            End If
        Else
            If num2 > num3 Then
                Console.WriteLine("{0} is Greatest Number", num2)
            Else
                Console.WriteLine("{0} is Greatest Number", num3)
            End If
        End If

        Console.ReadKey()

    End Sub

End Module

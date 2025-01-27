Module Module1

    Function Simple_IF()
        Dim number As Integer = 10

        If (number < 20) Then
            Console.WriteLine("Number is less then 20")
        End If

        Console.WriteLine("Value of number is {0}", number)
        Console.ReadLine()
    End Function

    Function If_Else()
        Dim num1, num2, result As Integer

        Console.Write("Enter 1st number : ")
        num1 = Console.ReadLine()
        Console.Write("Enter 2nd number : ")
        num2 = Console.ReadLine()

        result = num1 + num2

        Console.WriteLine("Sum of {0} and {1} is {2}", num1, num2, result)
        Console.ReadKey()
    End Function

    Function If_Else_ElseIf()
        Dim num1, num2 As Integer

        Console.Write("Enter first number : ")
        num1 = Console.ReadLine()
        Console.Write("Enter second number : ")
        num2 = Console.ReadLine()

        If num1 < num2 Then
            Console.WriteLine("{0} is greater than {1}", num1, num2)
        ElseIf num1 > num2 Then
            Console.WriteLine("{0} is greater than {1}", num1, num2)
        Else
            Console.WriteLine("{0} is equal to {1}", num1, num2)
        End If

        Console.ReadKey()
    End Function

    Sub Main()

        Simple_IF()
        If_Else()
        Console.WriteLine()
        If_Else_ElseIf()

    End Sub

End Module


'Output ----------------------------------------------------------

'Number Is less then 20
'Value of number Is 10

'Enter 1St number :  5
'Enter 2nd number :  13
'Sum of 5 And 13 Is 18

'Enter first number : 6
'Enter second number : 8
'6 Is greater than 8
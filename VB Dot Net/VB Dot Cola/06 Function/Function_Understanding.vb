
Module Function_Understanding

    Function MyAddFunction1(ByVal num1 As Integer, ByVal num2 As Integer) As Integer
        Return num1 + num2
    End Function

    Function MyAddFunction2(n1, n2)
        Return n1 + n2
    End Function

    Function GreetingFunction1(ByVal name As String) As String
        Return "Good Morning " & name
    End Function

    Function GreetingFunction2(naam)
        Return "Good Morning " & naam
    End Function

    Function FunctionWithBooleanRetureTypeToCheckEvenOdd(ByVal num As Integer) As Boolean
        If num Mod 2 = 0 Then
            Return True
        Else
            Return False
        End If
    End Function

    Function FunctionWithDefaultParameter(ByVal num1 As Integer, Optional ByVal num2 As Integer = 10) As Integer
        Return num1 + num2
    End Function

    Sub Main()
        ' Function Undertsanding 1
        Dim sum_of_numbers1 As Integer = MyAddFunction1(10, 20)
        Console.WriteLine($"Sum of numbers {sum_of_numbers1}")

        ' Function Undertsanding 2
        Dim sum_of_numbers2 As Integer = MyAddFunction2(10, 20)
        Console.WriteLine($"Sum of numbers {sum_of_numbers2}")

        ' Function Undertsanding 3
        Console.Write("Enter Your name : ")
        Dim message1 As String = GreetingFunction1(Console.ReadLine())
        Console.WriteLine(message1)

        ' Function Undertsanding 4
        Console.Write("Enter Your name : ")
        Dim message2 As String = GreetingFunction2(Console.ReadLine())
        Console.WriteLine(message2)

        ' Function Undertsanding 5
        Console.Write("Enter number to check Even or Odd : ")
        Dim number As Integer = Console.ReadLine()
        If FunctionWithBooleanRetureTypeToCheckEvenOdd(number) Then
            Console.WriteLine($"{number} is Even")
        Else
            Console.WriteLine($"{number} is Odd")
        End If

        ' Function Undertsanding 6
        Dim result1 As Integer = FunctionWithDefaultParameter(10)
        Console.WriteLine(result1)

        Console.ReadKey()
    End Sub

End Module


'OUTPUT
'Sum of numbers 30
'Sum of numbers 30
'Enter Your name : Aman Singh
'Good Morning Aman Singh
'Enter Your name : Raju Prasad
'Good Morning Raju Prasad
'Enter number To check Even Or Odd : 8
'8 Is Even
'20

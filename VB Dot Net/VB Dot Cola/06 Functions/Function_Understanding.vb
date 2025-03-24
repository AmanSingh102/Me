
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

        ' Function Undertsanding 3
        Console.Write("Enter Your name : ")
        Dim message2 As String = GreetingFunction2(Console.ReadLine())
        Console.WriteLine(message2)

        Console.ReadKey()
    End Sub

End Module


'OUTPUT
'Sum of numbers 30
'Sum of numbers 30
'Enter Your name : Suresh
'Good Morning Suresh
'Enter Your name : Durgesh
'Good Morning Durgesh

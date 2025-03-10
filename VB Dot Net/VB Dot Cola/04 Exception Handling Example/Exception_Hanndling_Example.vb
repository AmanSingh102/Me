Module Exception_Hanndling_Example

    Function Exception_Handling_Example_1()
        Console.Write("Enter a number : ")

        Try
            Dim number As Integer = Convert.ToInt32(Console.ReadLine())
            Console.WriteLine("You entered : " & number)
        Catch ex As Exception
            Console.WriteLine("Invalid Input !!, Please enter a valid number.")
        End Try

        Console.ReadKey()
    End Function

    Function Exception_Handling_Example_2()
        Console.Write("Enter a number : ")
        Dim number As Integer

        If Integer.TryParse(Console.ReadLine(), number) Then
            Console.WriteLine("You entered : " & number)
        Else
            Console.WriteLine("Invalid Input !!, Please enter a valid number.")
        End If

        Console.ReadKey()
    End Function

    Sub Main()

        Exception_Handling_Example_1()

        Console.WriteLine()

        Exception_Handling_Example_2()

    End Sub

End Module

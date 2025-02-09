Module Module1

    Sub Main()

        Console.Write("Enter the number : ")
        Dim num As Integer = Console.ReadLine()

        Dim first_no As Integer = 0
        Dim second_no As Integer = 1

        Console.Write("Fibonacci Series : ")
        For i As Integer = 1 To num Step 1
            Console.Write(first_no & " ")
            Dim next_no As Integer = first_no + second_no
            first_no = second_no
            second_no = next_no
        Next

        Console.ReadKey()

    End Sub

End Module


'Output -------------------------------------------------------------

'Enter the number : 5
'Fibonacci Series :  0 1 1 2 3
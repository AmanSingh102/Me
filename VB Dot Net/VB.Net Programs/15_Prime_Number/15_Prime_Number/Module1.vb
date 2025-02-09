Module Module1

    Sub Main()

        Console.Write("Enter the number : ")
        Dim num As Integer = Console.ReadLine

        Dim isPrime As Boolean = True

        If num <= 1 Then
            isPrime = False
        Else
            For i As Integer = 2 To Math.Sqrt(num) Step 1
                If num Mod 2 = 0 Then
                    isPrime = False
                End If
            Next
        End If

        If isPrime Then
            Console.WriteLine($"{num} is a Prime Number")
        Else
            Console.WriteLine($"{num} is not a Prime Number")
        End If

        Console.ReadKey()

    End Sub

End Module

Module Module1

    Sub Main()

        Console.Write("Enter the number : ")
        Dim num As Integer = Console.ReadLine()

        Dim temp As Integer = num
        Dim reverse As Integer = 0

        While temp > 0
            Dim r As Integer = temp Mod 10
            temp = temp \ 10
            reverse = reverse * 10 + r
        End While

        If reverse = num Then
            Console.WriteLine($"{num} is a Palindrome Number")
        Else
            Console.WriteLine($"{num} is not a Palindrome Number")
        End If

        Console.ReadKey()

    End Sub

End Module

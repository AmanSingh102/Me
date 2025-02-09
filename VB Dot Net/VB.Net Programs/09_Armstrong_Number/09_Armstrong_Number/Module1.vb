Module Module1

    Sub Main()

        Console.Write("Enter the number : ")
        Dim num As Integer = Console.ReadLine()

        Dim temp As Integer = num
        Dim digit As Integer = num.ToString().Length
        Dim sum As Integer = 0

        While temp > 0
            Dim r As Integer = temp Mod 10
            sum = sum + Math.Pow(r, digit)
            temp = temp \ 10
        End While

        If sum = num Then
            Console.WriteLine($"{num} is a Armstrong Number")
        Else
            Console.WriteLine($"{num} is not a Armstrong Number")
        End If

        Console.ReadKey()

    End Sub

End Module


'Output --------------------------------------------------------------------

'Enter the number : 153
'153 Is a Armstrong Number

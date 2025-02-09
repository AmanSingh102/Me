Module Module1

    Sub Main()

        Dim num As Integer
        Dim sum As Integer = 0

        Console.Write("Enter the number : ")
        num = Console.ReadLine()

        'Using While Loop --------------------------------
        Dim i As Integer = 1
        While i <= num
            sum = sum + i
            i += 1
        End While

        Console.WriteLine("Sum of Number : {0}", sum)

        'Using For Loop ----------------------------------
        sum = 0
        For j As Integer = 1 To num Step 1
            sum += j
        Next

        Console.WriteLine("Sum of Number : {0}", sum)

    End Sub

End Module

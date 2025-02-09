Module Module1

    Sub Main()

        Console.Write("Enter the number : ")
        Dim num As Integer = Console.ReadLine()

        Console.WriteLine(Environment.NewLine & "Multiplication Table of {0}", num)
        For i As Integer = 1 To 10 Step 1
            Console.WriteLine("{0} X {1} = {2}", num, i, num * i)
        Next

        Console.ReadKey()

    End Sub

End Module

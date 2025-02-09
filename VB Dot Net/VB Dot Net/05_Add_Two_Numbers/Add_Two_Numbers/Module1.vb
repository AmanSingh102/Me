Module Module1

    Sub Main()
        Dim num1 As Integer = 5
        Dim num2 As Integer = 10
        Dim result As Integer = num1 + num2

        Console.WriteLine("{0} + {1} = {2}", num1, num2, result)

        Console.WriteLine(vbCrLf & "---- Extended Version ----")   'Environment.NewLine equal to vbCrLf' 
        Dim n1 As Integer
        Dim n2 As Integer
        Dim sum As Integer

        n1 = 4
        n2 = 6
        sum = n1 + n2

        Console.WriteLine("a = {0}, b = {1}, c = {2}", n1, n2, sum)
        Console.ReadLine()
    End Sub

End Module


'Output -----------------------------------------------------

'5 + 10 = 15

'---- Extended Version ----
'a = 4, b = 6, c = 10

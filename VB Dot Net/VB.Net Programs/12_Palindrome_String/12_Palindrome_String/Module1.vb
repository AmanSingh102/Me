Module Module1

    Sub Main()

        Console.Write("Enter the String : ")
        Dim str As String = Console.ReadLine()

        Dim temp_str As String = str.Replace(" ", "").ToLower()
        Dim reversed_str As String = StrReverse(temp_str)

        If temp_str = reversed_str Then
            Console.WriteLine($"{str} is a Palindrome String")
        Else
            Console.WriteLine($"{str} is not a Palindrome String")
        End If

        Console.ReadKey()

    End Sub

End Module


'Output -----------------------------------------------------

'Enter the String : Madam
'Madam Is a Palindrome String
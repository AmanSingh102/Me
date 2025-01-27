Module Module1

    Sub Main()
        Dim n As Integer
        Dim da As Date
        Dim bl As Boolean = True

        n = 1234567
        da = Today

        Console.WriteLine(bl)

        'Type conversion -----> '
        Console.WriteLine(CSByte(bl))
        Console.WriteLine(CStr(bl))
        Console.WriteLine(CStr(da))
        Console.WriteLine(CChar(CChar(CStr(n))))
        Console.WriteLine(CChar(CStr(da)))

        Console.ReadKey()
    End Sub

End Module


'Output --------------------------------------------------------- 

'True
'-1
'True
'27-01-2025
'1
'2
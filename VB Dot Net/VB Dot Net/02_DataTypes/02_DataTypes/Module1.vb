Module Module1

    Sub Main()
        Dim b As Byte
        Dim n As Integer
        Dim si As Single
        Dim d As Double
        Dim da As Date
        Dim c As Char
        Dim s As String
        Dim bl As Boolean

        b = 2
        n = 1234567
        si = 0.1234567891
        d = 0.12345678911223344
        da = Today
        c = "U"c
        s = "Me"

        If ScriptEngine = "VB" Then
            bl = True
        Else
            bl = False
        End If

        If bl Then
            Console.Write(c & " and, " & s & vbCrLf)
            Console.WriteLine("declaring on the day of : {0}", da)
            Console.WriteLine("We will learn VB.net seriously")
            Console.WriteLine("Lets see what happens to the floating point variables : ")
            Console.WriteLine("The Single : {0}, The Double : {1}", si, d)
        End If

        Console.ReadKey()
    End Sub

End Module

'Output -------------------------------------------------------

'U And, Me
'declaring on the day of : 27-01-2025 00:00:00
'We will learn VB.net seriously
'Lets see what happens To the floating point variables 
'The Single :  0.1234568, The Double : 0.123456789112233

Module Module1

    Function Right_Triangle()
        Dim n As Integer = 5
        For i As Integer = 1 To n Step 1
            For j As Integer = 1 To i Step 1
                Console.Write("* ")
            Next
            Console.WriteLine()
        Next
        Console.ReadKey()
    End Function

    Function Inverted_Right_Triangle()
        Dim n As Integer = 5
        For i As Integer = n To 1 Step -1
            For j As Integer = 1 To i Step 1
                Console.Write("* ")
            Next
            Console.WriteLine()
        Next
        Console.ReadKey()
    End Function

    Function Pyramid()
        Dim n As Integer = 5
        For i As Integer = 1 To n
            For j As Integer = 1 To n - i
                Console.Write(" ")
            Next
            For k As Integer = 1 To (2 * i - 1)
                Console.Write("*")
            Next
            Console.WriteLine()
        Next
        Console.ReadKey()
    End Function

    Function Square()
        Dim n As Integer = 5
        For i As Integer = 1 To n
            For j As Integer = 1 To n
                Console.Write("* ")
            Next
            Console.WriteLine()
        Next
        Console.ReadKey()
    End Function

    Function Hollow_Square()
        Dim n As Integer = 5
        For i As Integer = 1 To n
            For j As Integer = 1 To n
                If i = 1 Or i = n Or j = 1 Or j = n Then
                    Console.Write("* ")
                Else
                    Console.Write("  ")
                End If
            Next
            Console.WriteLine()
        Next
        Console.ReadKey()
    End Function

    Function Inverted_Pyramid()
        Dim n As Integer = 5
        For i As Integer = n To 1 Step -1
            For j As Integer = i To n - 1
                Console.Write(" ")
            Next
            For k As Integer = 1 To (2 * i - 1)
                Console.Write("*")
            Next
            Console.WriteLine()
        Next
        Console.ReadKey()
    End Function

    Sub Main()

        Right_Triangle()
        Console.WriteLine()
        Inverted_Right_Triangle()
        Console.WriteLine()
        Pyramid()
        Console.WriteLine()
        Square()
        Console.WriteLine()
        Hollow_Square()
        Console.WriteLine()
        Inverted_Pyramid()

    End Sub

End Module


'Output ----------------------------------------------------

'*
'* *
'* * *
'* * * *
'* * * * *

'* * * * *
'* * * *
'* * *
'* *
'*

'    *
'   ***
'  *****
' *******
'*********

'* * * * *
'* * * * *
'* * * * *
'* * * * *
'* * * * *

'* * * * *
'*       *
'*       *
'*       *
'* * * * *

'*********
' *******
'  *****
'   ***
'    *


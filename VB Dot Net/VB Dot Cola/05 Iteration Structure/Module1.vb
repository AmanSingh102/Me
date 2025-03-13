'Iteration Structure
'1. For...Next Loop
'2. For Each...Next Loop
'3. While...End While Loop
'4. Do...Loop

Module Module1

    Function For_Next_Loop_Example()

        Dim i As Integer
        For i = 1 To 5
            Console.WriteLine($"Number : {i}")
        Next
        Console.ReadLine()

        Console.WriteLine("---------------------------------" & Environment.NewLine)

        Console.Write("Even Number from 2 to 10 : ")
        For j As Integer = 2 To 10 Step 2
            Console.Write(j & " ")
        Next
        Console.ReadLine()

        Console.WriteLine(Environment.NewLine & "---------------------------------" & Environment.NewLine)

        Console.Write("Reverse Counting : ")
        For k As Integer = 10 To i Step -1
            Console.Write(k & " ")
        Next
        Console.ReadLine()

    End Function

    Function For_Each_Next_Loop()
        Console.WriteLine(Environment.NewLine & "---------------------------------" & Environment.NewLine)
        Dim colors As String() = {"Red", "Green", "Blue"}
        For Each color In colors
            Console.WriteLine("Colors : " & color)
        Next
        Console.ReadLine()
    End Function

    Function While_End_While_Loop()
        Console.WriteLine("---------------------------------" & Environment.NewLine)
        Dim i As Integer = 1
        While i <= 5
            Console.WriteLine("Number : " & i)
            i += 1
        End While
        Console.ReadLine()
    End Function

    Function Do_Loop()
        Console.WriteLine("---------------------------------" & Environment.NewLine)
        Dim i As Integer = 1
        Do While i <= 5
            Console.WriteLine("Number : " & i)
            i += 1
        Loop
        Console.ReadLine()

        Console.WriteLine("---------------------------------" & Environment.NewLine)
        Dim j As Integer = 1
        Do Until j > 5
            Console.WriteLine("Number : " & j)
            j += 1
        Loop
        Console.ReadLine()
    End Function


    Sub Main()
        For_Next_Loop_Example()
        For_Each_Next_Loop()
        While_End_While_Loop()
        Do_Loop()
    End Sub

End Module


'OUTPUT

'Number: 1
'Number: 2
'Number: 3
'Number: 4
'Number: 5

'---------------------------------

'Even Number from 2 To 10 : 2 4 6 8 10

'---------------------------------

'Reverse Counting :  10 9 8 7 6

'---------------------------------

'Colors: Red
'Colors: Green
'Colors: Blue

'---------------------------------

'Number: 1
'Number: 2
'Number: 3
'Number: 4
'Number: 5

'---------------------------------

'Number: 1
'Number: 2
'Number: 3
'Number: 4
'Number: 5

'---------------------------------

'Number: 1
'Number: 2
'Number: 3
'Number: 4
'Number: 5
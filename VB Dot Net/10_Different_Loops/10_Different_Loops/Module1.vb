Module Module1

    'Simple for loop --> Executes a block of code for a specified number of iterations
    Function For_Loop()
        For i As Integer = 1 To 5
            Console.WriteLine("Value of i : " & i)
        Next

        Console.ReadKey()
    End Function

    'Iterates through each element of a collection or array
    Function For_Each_Loop()
        Dim number_array As Integer() = {1, 2, 3, 4, 5}

        For Each num As Integer In number_array
            Console.WriteLine("Number : " & num)
        Next

        Console.ReadKey()
    End Function

    'Simple While Loop --> Executes a block of code as long as specified condition is true
    Function While_Loop()
        Dim i As Integer = 1
        While i <= 5
            Console.WriteLine("Value of i : " & i)
            i += 1
        End While

        Console.ReadKey()
    End Function

    'do While Loop --> Executes a block of code while a specified condition True.
    'The condition is checked before the loop starts
    Function Do_While_Loop()
        Dim i As Integer = 1
        Do While i <= 5
            Console.WriteLine("Value of i : " & i)
            i += 1
        Loop

        Console.ReadKey()
    End Function

    'Do Until Loop --> Executes a block of code until a specified condition becomes True.
    'The condition is checked before the loop starts
    Function Do_Until_Loop()
        Dim i As Integer = 1
        Do Until i > 5
            Console.WriteLine("Value of i : " & i)
            i += 1
        Loop

        Console.ReadKey()
    End Function

    'Do.....Loop While --> Executes a block of code at least once, then continues while a specified condition is True.
    Function Do___Loop_While()
        Dim i As Integer = 1
        Do
            Console.WriteLine("Value of i : " & i)
            i += 1
        Loop While i <= 5

        Console.ReadKey()
    End Function

    'Do..Loop Until --> Executes a block of code at least once, then continues until a specified condition becomes True.
    Function Do___Loop_Until()
        Dim i As Integer = 1
        Do
            Console.WriteLine("Value of i : " & i)
            i += 1
        Loop While i > 5

        Console.ReadKey()
    End Function

    Sub Main()

        For_Loop()
        Console.WriteLine()
        For_Each_Loop()
        Console.WriteLine()
        While_Loop()
        Console.WriteLine()
        Do_While_Loop()
        Console.WriteLine()
        Do_Until_Loop()
        Console.WriteLine()
        Do___Loop_While()
        Console.WriteLine()
        Do___Loop_Until()

    End Sub

End Module

'Output ---------------------------------------------------

'Value of i : 1
'Value of i : 2
'Value of i : 3
'Value of i : 4
'Value of i : 5

'Number: 1
'Number: 2
'Number: 3
'Number: 4
'Number: 5

'Value of i : 1
'Value of i : 2
'Value of i : 3
'Value of i : 4
'Value of i : 5

'Value of i : 1
'Value of i : 2
'Value of i : 3
'Value of i : 4
'Value of i : 5

'Value of i : 1
'Value of i : 2
'Value of i : 3
'Value of i : 4
'Value of i : 5

'Value of i : 1
'Value of i : 2
'Value of i : 3
'Value of i : 4
'Value of i : 5

'Value of i : 1

'Output ---------------------------------------------------
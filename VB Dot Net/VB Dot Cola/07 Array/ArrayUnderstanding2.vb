Module ArrayUnderstanding

    'Resizing an Array using ReDim
    Function ResizeArray()
        ' Declare an array
        Dim numbers() As Integer = {10, 20, 30}

        ' Resize the array
        ReDim Preserve numbers(5)

        ' Assign new values
        numbers(3) = 40
        numbers(4) = 50
        numbers(5) = 60

        ' Display the elements
        For Each num In numbers
            Console.WriteLine(num)
        Next

        Console.ReadLine()
    End Function

    'Finding Array Length
    Function FindLenghtOfAnArray()
        Dim arr() As Integer = {5, 10, 15, 20, 25}

        ' Find length of array
        Console.WriteLine("Array Length: " & arr.Length)

        Console.ReadLine()
    End Function

    'Sorting an Array
    'Function SortAnArray()
    '    Dim numbers() As Integer = {50, 10, 40, 20, 30}

    '    ' Sorting the array
    '    Array.Sort(numbers)

    '    ' Display sorted elements
    '    Console.WriteLine("Sorted Array:")
    '    For Each num In numbers
    '        Console.WriteLine(num)
    '    Next

    '    Console.ReadLine()

    '    Return True
    'End Function

    'Find the maximum and minimum element in an array
    Function FindMaxMinInArray()
        ' Declare and initialize an array
        Dim numbers() As Integer = {23, 89, 15, 67, 45}

        ' Find max and min
        Dim max As Integer = numbers(0)
        Dim min As Integer = numbers(0)

        For Each num In numbers
            If num > max Then
                max = num
            End If
            If num < min Then
                min = num
            End If
        Next

        ' Display results
        Console.WriteLine("Maximum element: " & max)
        Console.WriteLine("Minimum element: " & min)
        Console.ReadLine()
    End Function

    'Write a program to reverse an array
    'Function ReverseAnArray()
    '    ' Declare and initialize an array
    '    Dim numbers() As Integer = {10, 20, 30, 40, 50}

    '    ' Reverse the array
    '    Array.Reverse(numbers)

    '    ' Display reversed array
    '    Console.WriteLine("Reversed array:")
    '    For Each num In numbers
    '        Console.WriteLine(num)
    '    Next

    '    Console.ReadLine()
    'End Function


    Sub Main()

        'Resizing an Array using ReDim
        ResizeArray()

        'Finding Array Length
        FindLenghtOfAnArray()

        'Sorting an Array
        'SortAnArray()

        'Find the maximum and minimum element in an array
        FindMaxMinInArray()

        'Write a program to reverse an array
        'ReverseAnArray()

    End Sub

End Module


'OUTPUT --------------------------------------------------

'Resizing an Array using ReDim
'10
'20
'30
'40
'50
'60

'Array Length :   5
'Finding Array Length

'Sorting an Array

'Find the maximum and minimum element in an array
'Maximum element :  89
'Minimum element :  15
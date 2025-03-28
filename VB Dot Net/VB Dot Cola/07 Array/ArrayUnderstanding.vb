Module ArrayUnderstanding

    Function SimpleArray()
        Dim number(3) As Integer
        number(0) = 10
        number(1) = 20
        number(2) = 30
        number(3) = 40

        For i As Integer = 0 To number.Length - 1
            Console.WriteLine($"Element {i} : {number(i)}")
        Next

        Console.ReadLine()
    End Function

    Function InitializingAtDeclaration()
        Dim fruits() As String = {"Apple", "Banana", "Mango", "Orange"}

        For Each fruit As String In fruits
            Console.WriteLine(fruit)
        Next
        Console.ReadLine()
    End Function

    Function MultiDimensionalArray()
        Dim matrix(,) As Integer = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}

        For i As Integer = 0 To 2
            For j As Integer = 0 To 2
                Console.Write(matrix(i, j) & " ")
            Next
            Console.WriteLine()
        Next
        Console.ReadLine()
    End Function

    Function JaggedArrayExample()
        Dim jaggedArray As Integer()() = New Integer(2)() {}

        jaggedArray(0) = New Integer() {1, 2, 3}
        jaggedArray(1) = New Integer() {4, 5}
        jaggedArray(2) = New Integer() {6, 7, 8, 9}

        For i As Integer = 0 To jaggedArray.Length - 1
            For j As Integer = 0 To jaggedArray(i).Length - 1
                Console.Write(jaggedArray(i)(j) & " ")
            Next
            Console.WriteLine()
        Next
        Console.ReadLine()
    End Function

    Sub Main()

        ' Array Understanding 1
        SimpleArray()

        ' Array Understanding 2
        InitializingAtDeclaration()

        ' Array Understanding 3
        MultiDimensionalArray()

        ' Array Understanding 4
        JaggedArrayExample()

    End Sub

End Module

'OUTPUT

'Element 0 :  10
'Element 1 :  20
'Element 2 :  30
'Element 3 :  40

'Apple
'Banana
'Mango
'Orange

'1 2 3
'4 5 6
'7 8 9

'1 2 3
'4 5
'6 7 8 9
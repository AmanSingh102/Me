Module Module1

    Sub Main()

        ' Value Type
        Dim num As Integer = 30
        Console.WriteLine($"Integer Value : {num}")

        ' Reference Type 
        Dim text As String = "Aman Singh"
        Console.WriteLine($"String Value : {text}")

        ' Boxing
        Dim obj As Object = num
        Console.WriteLine($"Boxed Object : {obj}")

        ' Unboxing 
        Dim unboxingNum As Integer = CType(obj, Integer)
        Console.WriteLine($"Unboxed Integer : {unboxingNum}")

        'OUTPUT -----------------------------------------------
        'Integer Value :   30
        'String Value : Aman Singh
        'Boxed Object :  30
        'Unboxed Integer :  30

    End Sub

End Module

Module enum_example
    Enum Colors
        red = 1
        orange = 2
        yellow = 3
        green = 4
        azure = 5
        blue = 6
        violet = 7
    End Enum

    Sub main()

        Console.WriteLine("The Color Red is : " & Colors.red)
        Console.WriteLine("The Color Orange is : " & Colors.orange)
        Console.WriteLine("The Color Yellow is : " & Colors.yellow)
        Console.WriteLine("The Color Green is : " & Colors.green)
        Console.WriteLine("The Color Azure is : " & Colors.azure)
        Console.WriteLine("The Color Blue is : " & Colors.blue)
        Console.WriteLine("The Color Violet is : " & Colors.violet)

        Console.ReadKey()

    End Sub

End Module

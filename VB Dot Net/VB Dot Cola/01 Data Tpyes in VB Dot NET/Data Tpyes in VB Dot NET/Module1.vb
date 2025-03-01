Module Module1

    Sub Main()

        ' DATA TYPES - Value Type

        '----------------------------------------

        ' (i) Intger Type
        Dim u As Byte = 255
        Dim x As Short = 32767
        Dim y As Integer = 2147483647
        Dim z As Long = 9223372036854775807

        Console.WriteLine("Byte : " & u)
        Console.WriteLine("Short : {0}", x)
        Console.WriteLine($"Integer : {y}")
        Console.WriteLine($"Integer : {z}" & Environment.NewLine)

        'OUTPUT ---------------------------------
        'Byte :  255
        'Short :  32767
        'Integer :  2147483647
        'Integer :  9223372036854775807

        ' (ii) Floating Type
        Dim a As Single = 253.656465
        Dim b As Double = 100.1234
        Dim c As Decimal = 99.99D

        Console.WriteLine($"Single : {a}")
        Console.WriteLine($"Double : {b}")
        Console.WriteLine($"Decimal : {c}" & Environment.NewLine)

        'OUTPUT ---------------------------------
        'Single :  253.6565
        'Double :  100.1234
        'Decimal :  99.99

        ' (ii) Boolean Type
        Dim flag As Boolean = True
        Console.WriteLine($"Boolean : {flag}" & Environment.NewLine)

        'OUTPUT ---------------------------------
        'Boolean :  True

        ' (iii) Char Type
        Dim letter As Char = "A"c
        Console.WriteLine($"Char : {letter}" & Environment.NewLine)

        'OUTPUT ---------------------------------
        'Char : a

        Dim name As String = "Aman Singh"
        Console.WriteLine($"String : {name}" & Environment.NewLine)

        'OUTPUT ---------------------------------
        'String : Aman Singh

        ' (iv) String Methods
        Dim txt1 As String = "hello"
        Dim txt2 As String = "WORLD"

        Console.WriteLine($"Lenght of String : {txt1.Length}")
        Console.WriteLine($"Upper Case of String : {txt1.ToUpper}")
        Console.WriteLine($"Lower Case of String : {txt2.ToLower}" & Environment.NewLine)

        'OUTPUT ---------------------------------
        'Lenght of String : 5
        'Upper Case of String : HELLO
        'Lower Case of String : world


        '-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-


        ' DATA TYPES - Reference Type

        '----------------------------------------

        ' (i) Object Type
        Dim obj As Object = 100
        Console.WriteLine($"Object : {obj}" & Environment.NewLine)

        'OUTPUT ---------------------------------
        'Object : 100

        ' (ii) Date Type
        Dim today As Date = Date.Now
        Console.WriteLine($"Today Date and Time : {today}" & Environment.NewLine)

        'OUTPUT ---------------------------------
        'Today Date and Time :  01-03-2025 13:59:21

        ' (iii) Enum Type
        Dim myColor As Colors = Colors.Laal
        Console.WriteLine($"Color Choosed : {myColor}" & Environment.NewLine)

        'OUTPUT ---------------------------------
        'Color Choosed : Laal

        ' (iv) Structure
        Dim studnet_1 As Student
        studnet_1.name = "Aman Singh"
        studnet_1.roll = 30

        Console.WriteLine($"Name : {studnet_1.name}")
        Console.WriteLine($"Roll : {studnet_1.roll}" & Environment.NewLine)

        'OUTPUT ---------------------------------
        'Name : Aman Singh
        'Roll : 30

    End Sub

    Enum Colors
        Kala
        Gullabi
        Laal
        Nilaa
        Pila
        Ujla
    End Enum

    Structure Student
        Dim name As String
        Dim roll As Byte
    End Structure

End Module

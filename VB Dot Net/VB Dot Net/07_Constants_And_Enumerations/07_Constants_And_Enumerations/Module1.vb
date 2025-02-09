Module Module1

    Sub Main()
        Const PI = 3.14149
        Dim radius, area As Single

        radius = 7
        area = PI * radius * radius

        Console.WriteLine("Area of Circle when radius is {0} = {1}", radius, area)
        Console.ReadKey()
    End Sub

End Module


'Output -------------------------------------------------------------

'Area of Circle when radius Is 7 = 153.933


Module Module1

    Sub Main()

        Console.Write("Enter the sentence : ")
        Dim str As String = Console.ReadLine().ToLower()

        Dim vowels As Integer = 0
        Dim consonants As Integer = 0

        For Each ch As Char In str
            If Char.IsLetter(ch) Then
                If "aeiou".Contains(ch) Then
                    vowels += 1
                Else
                    consonants += 1
                End If
            End If
        Next

        Console.WriteLine("Vowels : " & vowels)
        Console.WriteLine("Consonants : " & consonants)

        Console.ReadKey()

    End Sub

End Module


'Output --------------------------------------------------
'Enter the sentence : Hello World
'Vowels: 3
'Consonants: 7

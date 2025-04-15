Module Module1
    Sub Main()

        Console.WriteLine("Current Date & Time: " & Now)
        Console.WriteLine("Year: " & Year(Now))
        Console.WriteLine("Month: " & Month(Now))
        Console.WriteLine("Day: " & Day(Now))
        Console.WriteLine("Hour: " & Hour(Now))
        Console.WriteLine("Minute: " & Minute(Now))
        Console.WriteLine("Second: " & Second(Now))

        Console.WriteLine("Date after 10 days: " & DateAdd("d", 10, Now))
        Console.WriteLine("Days between 1st Jan 2025 and today: " & DateDiff("d", #1/1/2025#, Now))

    End Sub
End Module


'OUTPUT
'Current Date & Time:  11-04-2025 16:08:06
'Year: 2025
'Month: 4
'Day: 11
'Hour: 16
'Minute: 8
'Second: 6
'Date after 10 days:  21-04-2025 16:08:06
'Days between 1St Jan 2025 And today: 100

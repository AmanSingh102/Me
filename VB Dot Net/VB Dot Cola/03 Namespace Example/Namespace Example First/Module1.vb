Namespace UniversityExam
    Class Student
        Public Sub Display()
            Console.WriteLine("I am a student from UniversityExam Namespace")
        End Sub
    End Class
End Namespace

Namespace CollegeExam
    Class Student
        Public Sub Display()
            Console.WriteLine("I am a student from CollegeExam Namespace")
        End Sub
    End Class
End Namespace

Namespace CustomNameSpaceA
    Public Class Same_Class
        Public Sub ShowMessage()
            Console.WriteLine("Hello from CustomNameSpaceA.Same_Class")
        End Sub
    End Class
End Namespace

Namespace CustomNameSpaceB
    Public Class Same_Class
        Public Sub ShowMessage()
            Console.WriteLine("Hello from CustomNameSpaceB.Same_Class")
        End Sub
    End Class
End Namespace

Module Module1
    Sub Main()

        Dim student1 As New UniversityExam.Student()
        student1.Display()

        'OUTPUT ----
        'I am a student from UniversityExam Namespace

        Dim student2 As New CollegeExam.Student()
        student2.Display()

        ' OUTPUT ----
        'I am a student from CollegeExam Namespace

        Dim obj_A As New CustomNameSpaceA.Same_Class
        obj_A.ShowMessage()

        ' OUTPUT ----
        'Hello From CustomNameSpaceA.Same_Class

        Dim obj_B As New CustomNameSpaceB.Same_Class
        obj_B.ShowMessage()

        ' OUTPUT ----
        'Hello From CustomNameSpaceB.Same_Class

    End Sub
End Module



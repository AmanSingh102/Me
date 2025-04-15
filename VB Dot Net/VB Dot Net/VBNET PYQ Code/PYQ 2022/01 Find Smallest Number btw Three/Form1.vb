Public Class Form1
    Private Sub btnResult_Click(sender As Object, e As EventArgs) Handles btnResult.Click
        Dim num1, num2, num3, smallest As Integer

        num1 = Val(txtNum1.Text)
        num2 = Val(txtNum2.Text)
        num3 = Val(txtNum3.Text)

        smallest = Math.Min(num1, Math.Min(num2, num3))

        lblREsult.Text = "Smallest Number : " & smallest
    End Sub
End Class

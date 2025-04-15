Public Class Form1

    Private Sub btnCalculate_Click(sender As Object, e As EventArgs) Handles btnCalculate.Click
        ' Accept marks from 5 TextBoxes
        Dim s1 As Integer = Val(txtSub1.Text)
        Dim s2 As Integer = Val(txtSub2.Text)
        Dim s3 As Integer = Val(txtSub3.Text)
        Dim s4 As Integer = Val(txtSub4.Text)
        Dim s5 As Integer = Val(txtSub5.Text)

        ' Calculate Total
        Dim total As Integer = s1 + s2 + s3 + s4 + s5

        ' Calculate Percentage (Assuming each subject is out of 100)
        Dim percentage As Double = (total / 500) * 100

        ' Display Results
        lblTotal.Text = "Total Marks : " & total
        lblPercent.Text = "Percentage : " & Format(percentage, "0.00") & "%"
    End Sub

End Class

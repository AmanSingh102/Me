Public Class Form1

    ' Change Background Color of the Button
    Private Sub btnChangeBG_Click(sender As Object, e As EventArgs) Handles btnChangeBG.Click
        btnColor.BackColor = Color.LightBlue
    End Sub

    ' Change Text Color (Foreground Color) of the Button
    Private Sub btnChangeText_Click(sender As Object, e As EventArgs) Handles btnChangeText.Click
        btnColor.ForeColor = Color.Red
    End Sub

End Class

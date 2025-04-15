Public Class Form1

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Timer1.Interval = 1000 ' 1 second
        Timer1.Enabled = True
    End Sub

    Private Sub Timer1_Tick(sender As Object, e As EventArgs) Handles Timer1.Tick
        'lblTime.Text = DateTime.Now.ToLongTimeString()
        lblTime.Text = DateTime.Now.ToString("hh : mm : ss tt")
    End Sub

End Class

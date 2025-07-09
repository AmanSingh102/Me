Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Username.Text = "Username"
        Username.ForeColor = Color.DarkGray

        Password.Text = "Password"
        Password.ForeColor = Color.DarkGray
    End Sub

    Private Sub Username_GotFocus(sender As Object, e As EventArgs) Handles Username.GotFocus
        If Username.Text = "Username" Then
            Username.Text = ""
            Username.ForeColor = Color.Black
        End If
    End Sub

    Private Sub Username_LostFocus(sender As Object, e As EventArgs) Handles Username.LostFocus
        If Username.Text = "" Then
            Username.Text = "Username"
            Username.ForeColor = Color.DarkGray
        End If
    End Sub

    Private Sub Password_GotFocus(sender As Object, e As EventArgs) Handles Password.GotFocus
        If Password.Text = "Password" Then
            Password.Text = ""
            Password.PasswordChar = "*"
            Password.ForeColor = Color.Black
        End If
    End Sub

    Private Sub Password_LostFocus(sender As Object, e As EventArgs) Handles Password.LostFocus
        If Password.Text = "" Then
            Password.Text = "Password"
            Password.PasswordChar = ""
            Password.ForeColor = Color.DarkGray
        End If
    End Sub
End Class

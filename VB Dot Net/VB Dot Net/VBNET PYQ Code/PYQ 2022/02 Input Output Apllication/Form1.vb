Public Class Form1
    Private Sub btnCalculate_Click(sender As Object, e As EventArgs) Handles btnCalculate.Click
        ' Input
        Dim itemCode As String = txtItemCode.Text
        Dim itemName As String = txtItemName.Text
        Dim quantity As Integer = Val(txtQty.Text)
        Dim pricePerUnit As Decimal = Val(txtPrice.Text)

        ' Calculation
        Dim totalPrice As Decimal = quantity * pricePerUnit
        Dim discount As Decimal = 0

        If quantity > 100 Then
            discount = totalPrice * 0.1D ' 10% discount
        End If

        Dim netPrice As Decimal = totalPrice - discount

        ' Output
        lblTotal.Text = "Total Price : " & totalPrice.ToString("C")
        lblDiscount.Text = "Discount : " & discount.ToString("C")
        lblNet.Text = "Net Price : " & netPrice.ToString("C")
    End Sub
End Class

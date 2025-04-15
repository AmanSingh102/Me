Public Class Form1
    Private Sub btnAdd_Click(sender As Object, e As EventArgs) Handles btnAdd.Click
        If txtItem.Text <> "" Then
            lstItems.Items.Add(txtItem.Text)
            txtItem.Clear()
        Else
            MessageBox.Show("Please enter an item to add.")
        End If
    End Sub

    Private Sub btnRemove_Click(sender As Object, e As EventArgs) Handles btnRemove.Click
        If lstItems.SelectedIndex <> -1 Then
            lstItems.Items.RemoveAt(lstItems.SelectedIndex)
        Else
            MessageBox.Show("Please select an item to remove.")
        End If
    End Sub

    ' Add item to ListBox
    'Private Sub btnAdd_Click(sender As Object, e As EventArgs) Handles btnAdd.Click
    '    lstItems.Items.Add(txtItem.Text)
    '    txtItem.Clear()
    'End Sub

    ' Remove selected item from ListBox
    'Private Sub btnRemove_Click(sender As Object, e As EventArgs) Handles btnRemove.Click
    '    lstItems.Items.Remove(lstItems.SelectedItem)
    'End Sub

End Class

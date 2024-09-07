print("\n\n---> Appending elements")
listNo1 = [1, 2, 3, 4]
listNo1.append("Aman")
listNo1.append(30)
print("New List :",listNo1)             # New List : [1, 2, 3, 4, 'Aman', 30]


listNo2 = [5, 6, 7, 8]
listNo1.append(listNo2)
print("New List :",listNo1)             # New List : [1, 2, 3, 4, 'Aman', 30, [5, 6, 7, 8]]

print("Accessing 1st element of 2nd list :",listNo1[6][0])      # Accessing 1st element of 2nd list : 5

listNo3 = [1, 2, 3, 4]
listNo3[3] = 100
print(listNo3)          # [1, 2, 3, 100]
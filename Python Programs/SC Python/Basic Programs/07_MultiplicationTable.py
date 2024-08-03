num = int(input("\nEnter number : "))

print(f"\n-------- Multiplication Table of {num} --------\n")
for i in range(1, 11):
    print(f"{num} X {i} = {num*i}")
print(f"\n--------------------------------------------\n")


# OUTPUT ------------------------>
'''
Enter number : 5

-------- Multiplication Table of 5 --------

5 X 1 = 5
5 X 2 = 10
5 X 3 = 15
5 X 4 = 20
5 X 5 = 25
5 X 6 = 30
5 X 7 = 35
5 X 8 = 40
5 X 9 = 45
5 X 10 = 50

--------------------------------------------

'''
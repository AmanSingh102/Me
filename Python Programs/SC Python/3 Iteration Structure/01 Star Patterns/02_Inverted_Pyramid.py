# >>>>>>>>>>>>>>>>>> Simple Inverted Pyramid >>>>>>>>>>>>>>>>>>
print("\n---- Simple Inverted Pyramid ----\n")
rows = int(input("Enter the number of rows : "))
print()
for i in range(rows+1,0,-1):
    for j in range(0,i - 1):
        print("* ",end="")
    print()

'''
---- Simple Inverted Pyramid ----

Enter the number of rows : 5

* * * * * 
* * * * 
* * * 
* * 
* 
'''

# >>>>>>>>>>>>>>>>>> Inverted Number Pyramid >>>>>>>>>>>>>>>>>>
print("\n---- Inverted Number Pyramid ----\n")
rows = int(input("Enter the number of rows : "))
print()
for num in range(rows, 0, -1):
    for i in range(0, num):
        print(num, end=" ")
    print()

'''
---- Inverted Number Pyramid ----

Enter the number of rows : 5     

5 5 5 5 5 
4 4 4 4   
3 3 3     
2 2
1
'''

# >>>>>>>>>>>>>>>>>> Inverted Number Pyramid >>>>>>>>>>>>>>>>>>
print("\n---- Inverted Number Pyramid ----\n")
rows = int(input("Enter number of rows : "))
print()

for i in range(rows, -1, -1):
    for j in range(1, i + 1):
        print(j, end=' ')
    print()

'''
---- Inverted Number Pyramid ----

Enter number of rows : 5

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
'''

# >>>>>>>>>>>>>>>>>> Alphabet Pyramid >>>>>>>>>>>>>>>>>>
print("\n---- Alphabet Pyramid ----\n")
rows = int(input("Enter number of rows : "))
ascii_value = 65
print()

for i in range(rows, 0, -1):
    for j in range(i):
        alphabet = chr(ascii_value)
        print(alphabet, end=" ")
    ascii_value += 1
    print()

'''
---- Alphabet Pyramid ----

Enter number of rows : 5

A A A A A
B B B B
C C C
D D
E
'''
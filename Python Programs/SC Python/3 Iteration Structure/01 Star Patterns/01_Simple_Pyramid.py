# >>>>>>>>>>>>>>>>>> Simple Pyramid >>>>>>>>>>>>>>>>>>
print("\n---- Simple Pyramid ----\n")
for i in range(0,5):
    for j in range(0, i+1):
        print("* ", end="")
    print()


'''
---- Simple Pyramid ----

* 
* * 
* * * 
* * * * 
* * * * *
'''

# >>>>>>>>>>>>>>>>>> Number Pyramid >>>>>>>>>>>>>>>>>>
print("\n---- Number Pyramid ----\n")
rows = int(input("Enter number of rows : "))
for num in range(rows + 1):
    for i in range(num):
        print(num, end=" ")
    print()


'''
---- Number Pyramid ----

Enter number of rows : 5

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
'''

# >>>>>>>>>>>>>>>>>> Number Pyramid >>>>>>>>>>>>>>>>>>
print("\n---- Number Pyramid ----\n")
rows = int(input("Enter number of rows : "))
for i in range(1, rows + 1):
    for j in range(1, i + 1):
        print(j, end=' ')
    print()

'''
---- Number Pyramid ----

Enter number of rows : 5
1 
1 2
1 2 3
1 2 3 4
1 2 3 4 5
'''

# >>>>>>>>>>>>>>>>>> Alphabet Pyramid >>>>>>>>>>>>>>>>>>
print("\n---- Alphabet Pyramid ----\n")
rows = int(input("Enter number of rows : "))
ascii_value = 65
print()

for i in range(rows):
    for j in range(i+1):
        alphabet = chr(ascii_value)
        print(alphabet, end=" ")
    ascii_value += 1
    print()


'''
---- Alphabet Pyramid ----

Enter number of rows : 5

A
B B
C C C
D D D D
E E E E E
'''
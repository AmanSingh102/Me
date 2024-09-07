# >>>>>>>>>>>>>>>>>> Equilatorial Pyramid >>>>>>>>>>>>>>>>>>
print("\n---- Alphabet Pyramid ----\n")
num = int(input("Enter number : "))
print()

for i in range(1,num + 1):
    print("  " * ( num - i ), end = "" )
    print("* " * ( 2*i - 1 ), end = " ")
    print()

'''
---- Alphabet Pyramid ----

Enter number : 5

        *  
      * * *  
    * * * * *  
  * * * * * * *  
* * * * * * * * *   
'''

# >>>>>>>>>>>>>>>>>> Equilatorial Pyramid >>>>>>>>>>>>>>>>>>
print("\n---- Equilatorial Pyramid ----\n")
num = int(input("Enter number : "))
print()
for i in range(1,num + 1):
    print(" " * ( num - i ), end = "")
    print("*" * ( 2*i - 1 ), end = "")
    print()

'''
---- Alphabet Pyramid ----

Enter number : 5

    *   
   ***  
  ***** 
 *******
*********
'''

# >>>>>>>>>>>>>>>>>> Inverted Equilatorial Pyramid >>>>>>>>>>>>>>>>>>
print("\n---- Inverted Equilatorial Pyramid ----\n")
num = int(input("Enter number : "))
print()
for i in range(num , -1, -1):
    print(" " * ( num - i ), end = "" )
    print("*" * ( 2*i - 1 ), end = "")
    print()

'''
---- Inverted Equilatorial Pyramid ----

Enter number : 5

*********
 *******
  *****
   ***
    *
'''

# >>>>>>>>>>>>>>>>>> Inverted Equilatorial Pyramid >>>>>>>>>>>>>>>>>>
print("\n---- Inverted Equilatorial Pyramid ----\n")
num = int(input("Enter number : "))
print()

for i in range(num, -1, -1):
    print("  " * ( num - i ), end = "" )
    print("* " * ( 2*i - 1 ), end = " ")
    print()

'''
---- Inverted Equilatorial Pyramid ----

Enter number : 5

* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
'''
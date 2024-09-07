print("\n-------- Greatest Number Program --------\n")

num1 = int(input("Enter 1st number : "))
num2 = int(input("Enter 2nd number : "))
num3 = int(input("Enter 3rd number : "))

if( num1 > num2 ):
    if( num1 > num3 ):
        print(f"\n{num1} is Greatest Number")
    else:
        print(f"\n{num3} is Greatest Number")
else:
    if( num2 > num3 ):
        print(f"\n{num2} is Greatest Number")
    else:
        print(f"\n{num3} is Greatest Number")

print("\n-----------------------------------------\n")


# OUTPUT --------------->
'''
-------- Greatest Number Program --------

Enter 1st number : 1
Enter 2nd number : 2
Enter 3rd number : 3

3 is Greatest Number

-----------------------------------------

'''
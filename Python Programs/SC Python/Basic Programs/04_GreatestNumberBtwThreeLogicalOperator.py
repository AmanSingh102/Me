print("\n-------- Greatest Number Program --------\n")

num1 = int(input("Enter 1st number : "))
num2 = int(input("Enter 2nd number : "))
num3 = int(input("Enter 3rd number : "))

if( num1 > num2 and num1 > num3 ):
    print(f"\n{num1} is Greatest Number")
elif( num2 > num1 and num2 > num3 ):
    print(f"\n{num2} is Greatest Number")
elif( num3 > num1 and num3 > num2 ):
    print(f"\n{num3} is Greatest Number")
else:
    print("All Numbers are Equal !!!")

print("\n-----------------------------------------\n")


# OUTPUT --------------------->
'''
-------- Greatest Number Program --------

Enter 1st number : 1
Enter 2nd number : 2
Enter 3rd number : 3

3 is Greatest Number

----------------------------------------- 

'''
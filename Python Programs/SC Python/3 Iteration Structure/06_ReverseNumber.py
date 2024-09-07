print("\n-------- Reverse Number Program --------\n")

num = int(input("Enter Number : "))

reverse = 0
temp = num
while( temp > 0 ):
    remainder = temp % 10
    temp //= 10
    reverse = ( reverse * 10 ) + remainder

print(f"Reverse of {num} is {reverse}")

print("\n----------------------------------------\n")


# OUTPUT ------------------------------------>
'''
-------- Reverse Number Program --------

Enter Number : 153
Reverse of 153 is 351

----------------------------------------

'''
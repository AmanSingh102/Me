print("\n-------- Armstrong Number Program --------\n")

num = int(input("Enter Number : "))

sum = 0
temp = num
while( temp > 0 ):
    remainder = temp % 10
    sum += remainder ** 3        # sum = sum + ( remainder * remainder * remainder )
    # temp = temp - remainder
    # temp = temp / 10
    temp //= 10                 # also work as above

if( sum == num ):
    print(f"{num} is a Armstrong Number")
else:
    print(f"{num} is not a Armstrong Number")

print("\n------------------------------------------\n")


# ------------ Explaination of temp //= 10
number = 153
temp = number

while( temp > 0 ):
    lastDigit = temp % 10
    print(f"Last digit : {lastDigit}")
    temp //= 10
    print(f"Remaining number : {temp}")


# OUTPUT ---------------------------------------->
'''
-------- Armstrong Number Program --------

Enter Number : 153
153 is a Armstrong Number

------------------------------------------

Last digit : 3
Remaining number : 15
Last digit : 5
Remaining number : 1
Last digit : 1
Remaining number : 0

'''
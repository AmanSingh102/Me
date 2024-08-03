print("\n-------- Palindrome Number Program --------\n")

num = int(input("Enter Number : "))

reverse = 0
temp = num
while( temp > 0 ):
    remainder = temp % 10
    temp //= 10
    reverse = ( reverse * 10 ) + remainder

if( num == reverse ):
    print(f"{num} is a Palindrome Number") 
else:
    print(f"{num} is not a Palindrome Number")

print("\n-------------------------------------------\n")


# OUTPUT --------------------------------->
'''
-------- Palindrome Number Program --------

Enter Number : 222
222 is a Palindrome Number

-------------------------------------------

'''
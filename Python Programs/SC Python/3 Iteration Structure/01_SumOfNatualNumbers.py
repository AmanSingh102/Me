print("\n-------- Sum of Natural Number Program --------\n")

num = int(input("Enter the number : "))
sum = 0

i = 1
while( i <= num ):
    sum += i
    i += 1

print(f"Sum of {num} Natural Number : {sum}")


# for loop method ---------------------------------->
sum_ = 0
for i in range(1, num + 1):
    sum_ += i
print(f"Sum of {num} Natural Number : {sum_}")

print("\n-----------------------------------------------\n")


# OUTPUT ------------------------>
'''
-------- Sum of Natural Number Program --------

Enter the number : 5
Sum of 5 Natural Number : 15
Sum of 5 Natural Number : 15

-----------------------------------------------

'''
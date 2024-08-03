print("\n-------- Factorial Program --------\n")
num = int(input("Enter number : "))
fact = 1

for i in range(1, num + 1):
    fact *= i

print(f"Factorial of {num} is {fact}")
print("\n-----------------------------------\n")


# OUTPUT ------------------------>
'''
-------- Factorial Program --------

Enter number : 5
Factorial of 5 is 120

-----------------------------------

'''
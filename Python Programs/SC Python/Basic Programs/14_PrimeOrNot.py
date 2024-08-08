import math

print("\n----------- Prime Number Checker Program -----------\n")

number = int(input("Enter Number : "))

isPrime = True

if( number <= 1 ) :
    isPrime = False
else :
    for i in range(2, int(math.sqrt(number)) + 1) :
        if( number % i == 0 ) :
            isPrime = False
            break

if isPrime :
    print(f"{number} is a Prime Number")
else :
    print(f"{number} is not a Prime Number")

print("\n----------------------------------------------------\n")
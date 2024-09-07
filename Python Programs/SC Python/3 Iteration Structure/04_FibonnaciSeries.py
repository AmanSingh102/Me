print("\n-------- Fibonacci Program --------\n")

num = int(input("Enter Number : "))

print("Fibonacci Series : ",end="")
firstNo = 0
secondNo = 1
for i in range(1, num + 1):
    print(str(firstNo) + " ", end ="")

    nextNo = firstNo + secondNo
    firstNo = secondNo
    secondNo = nextNo

print("\n\n-----------------------------------\n")


# OUTPUT -------------------------->
'''
-------- Fibonacci Program --------

Enter Number : 5
Fibonacci Series : 0 1 1 2 3 

----------------------------------- 

'''
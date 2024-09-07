listNumbers = [1, 2, 3]
print(listNumbers[-1], listNumbers[ 0 - len(listNumbers) ])     # Output : 3 1      
print(listNumbers[::-1])                                        # Output : [3, 2, 1]


print()


ages = [5, 12, 17, 18, 24 ,32]
def checkAge(x):
    if x < 18:
        return False
    else:
        return True
    
adults = filter(checkAge, ages)

print("Adult : ",end="")
for x in adults:
    print(x, end=' ')

# OUTPUT --> Adult : 18 24 32 
print("\n----> bin Function")
print("Binary Number of 5 :",bin(5))    
# Binary Number of 5 : 0b101

print("\n----> oct Function")
print("Octal Number of 5 :",oct(5))     
# Octal Number of 5 : 0o5

print("\n----> hex Function")
print("Hexadecimal or Hash value of 5 :",hex(5))     
# Hexadecimal or Hash value of 5 : 0x5

print("\n----> chr Function")
print("Character of 65 :",chr(65))     
# Character of 65 : A

print("\n----> dict Function")
print("dict :",dict())     
# dict : {}

print("\n----> list Function")
print("list :",list())     
# list : []

print("\n----> set Function")
print("set :",set())     
# set : set()

print("\n----> tuple Function")
print("tuple :",tuple())     
# tuple : ()

print("\n----> min,max Function")
print("Minimum value in [1,2,3] :",min([1,2,3]))     
print("Maximun value in [1,2,3] :",max([1,2,3]))     
# Minimum value in [1,2,3] : 1
# Maximun value in [1,2,3] : 3

print("\n----> int Function")
print("Integer :",int("10"))
# Integer : 10

print("\n----> divmod Function")
print("divmod of 5,3 :",divmod(5,3))
# divmod of 5,3 : (1, 2)

print("\n----> abs Function")
print("abs of -10 :",abs(-10))
# abs of -10 : 10

print("\n----> round Function")
print(round(10.455,2))              # 10.46
print(round(-10.455,2))             # -10.46 
print(round(-10.455,-2))            # -0.0
# print(round())
print(round(-10.455,-1))            # -10.0
print(round(15.555,1))              # 15.6

print(round(500,-3))                # 0
print(round(500.45,-3))             # 1000.0
print(round(123,3))                 # 123
print(round(123))                   # 123

print("\n----> filter Function")
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

# Output --->  Adult : 18 24 32
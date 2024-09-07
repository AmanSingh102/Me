print("\n----> len Function")
alphabet = "abcdefghijklmnopqrstuvwxyz"
print("Lenght of 'abcdefghijklmnopqrstuvwxyz' :",len(alphabet))

# OUTPUT 
# ----> len Function
# Lenght of 'abcdefghijklmnopqrstuvwxyz' : 26

print("\n----> capitalize Function")
name = "aman kumar singh"
print("Name :",name.capitalize())

# OUTPUT 
# ----> capitalize Function
# Name : Aman kumar singh

print("\n----> title Function")
name = "aman kumar singh"
print("Name :",name.title())

# OUTPUT
# ----> title Function
# Name : Aman Kumar Singh

print("\n----> casefold or lower Function")
name = "AMAN KUMAR SINGH"
print("Name :",name.casefold())

# OUTPUT
# ----> casefold or lower Function
# Name : aman kumar singh

print("\n----> upper Function")
name = "aman kumar singh"
print("Name :",name.upper())

# OUTPUT
# ----> upper Function
# Name : AMAN KUMAR SINGH

print("\n----> count Function")
name1 = "aman aman kumar singh"
print("Count 'aman' :",name1.count("aman"))

greet = "Hello World, Hello World"
print("Count 'Hello' :",greet.count("Hello",10,25))

# OUTPUT
# ----> count Function
# Count 'aman' : 2
# Count 'Hello' : 1

print("\n----> replace Function")
text = "I am Learning C"
textReplace = text.replace("C","Python")
print(textReplace)

text = "one one one"
textReplace = text.replace("one","two",2)
print(textReplace)

# OUTPUT
# ----> replace Function
# I am Learning Python
# two two one

print("\n----> index Function")
text = "Hello World"
index = text.index("World")
print("Index of 'World :",index)

text = "Hello, World! Welcome to the World!"
index = text.index("World",0,20)
print("Index of 'World :",index)

# OUTPUT
# ----> index Function
# Index of 'World : 6
# Index of 'World : 7

print("\n----> format Function")
salary = 5000.495
msd = "The salary of the servent is {0:.2f}"
print(msd.format(salary))

# OUTPUT
# ----> format Function
# The salary of the servent is 5000.49

roll = 1
name = 'ABC'
msg = "My Name : {0:8} My Roll : {1:8}. My Details"
print(msg.format(name,roll))

print('Binary of 5 is {0:b}'.format(5))
print('Price is {0:.2f}'.format(50.5456))
print('Price id {0}'.format(50.5456))

# My Name : ABC      My Roll :        1. My Details
# Binary of 5 is 101
# Price is 50.55
# Price id 50.5456
student = {
    "Roll No" : 30,
    "Name"    : "Aman",
    "Sem"     : 3,
    "Sgpa"    : 8.90
}

print()
for x in student:
    print(x)

# OUTPUT -------->
# Roll No
# Name
# Sem
# Sgpa

print()
for x in student.items():
    print(x)

# OUTPUT -------->
# ('Roll No', 30)
# ('Name', 'Aman')
# ('Sem', 3)
# ('Sgpa', 8.9)

print()
for k,v in student.items():
    print(k, "=", v)

# OUTPUT -------->
# Roll No = 30
# Name = Aman
# Sem = 3
# Sgpa = 8.9
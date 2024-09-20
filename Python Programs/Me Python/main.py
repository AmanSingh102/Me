import math
from statistics import mean,median,mode

# Simple Calculator 
def calculator():
    print("\n-------- Simple Calculator --------\n")
    n1 = float(input("Enter 1st Number : "))
    n2 = float(input("Enter 2nd Number : "))
    operator =  input("Enter operator [ +, -, *, /, % ] : ")

    if operator == '+':
        print(f"{n1} + {n2} = {n1 + n2}")
    elif operator == '-':
        print(f"{n1} - {n2} = {n1 - n2}")
    elif operator == '*':
        print(f"{n1} * {n2} = {n1 * n2}")
    elif operator == '/':
        print(f"{n1} / {n2} = {n1 / n2}")
    elif operator == '%':
        print(f"{n1} % {n2} = {n1 % n2}")
    else : 
        print("Invalid Operator !!!!")

    print("\n-----------------------------------\n")


# Find value of x from quardratic equation 
def quardratic_equation():
    print("\n-------- Quardratic Equation --------\n")
    a = int(input("Enter value of a : "))
    b = int(input("Enter value of b : "))
    c = int(input("Enter value of c : "))

    print(f"{a}x^2 + {b}x + c")
    
    d = (b**2) - (4*a*c)

    if d > 0:
        x1 = ( -b + math.sqrt(d)) / ( 2*a )
        x2 = ( -b - math.sqrt(d)) / ( 2*a )
        print(f"Two Real Solution : x1 = {x1}, x2 = {x2}")
    elif d == 0:
        x = -b / (2*a)
        print(f"One Real Solution : x = {x}")
    else :
        real_part = -b / (2*a)
        imaginary_part = math.sqrt(-d) / (2*a)
        print(f"No Real Solution, but two complex solutions : {real_part} +- {imaginary_part}i ")

    print("\n-----------------------------------\n")


# Display square and cube of number and data type
def find_square_cube():
    print("\n-------- Find Square and Cube of number --------\n")

    num = float(input("Enter an Integer : "))

    print("Data type of input value is",type(num))
    print(f"Square of {num} : {num**2}")
    print(f"Cube of {num} : {num**3}")

    print("\n------------------------------------------------\n")


# Remove unwanted space
def remove_unwantd_space():
    print("\n-------- Remove Unwanted Space --------\n")

    text = input("Write any in english : ")

    remove_space = text.replace(" ", "")
    print("Text without space :",remove_space)

    print("\n---------------------------------------\n")


# Check Prime or not
def check_prime_or_not():
    print("\n-------- Prime or Not --------\n")

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

    print("\n------------------------------\n")


# Mensuration Formula
def mensuration_formula():

    def area_of_rectangle():
        lenght = float(input("Enter Lenght of Rectangle : "))
        width = float(input("Enter Widht of Rectangle : "))
        print(f"Area of Rectangle : {lenght * width}")

    def perimeter_of_rectangle():
        lenght = float(input("Enter Lenght of Rectangle : "))
        width = float(input("Enter Widht of Rectangle : "))
        print(f"Perimeter of Rectangle : { 2 * (lenght + width)}")

    def area_of_sqaure():
        side = float(input("Enter Side of Square : "))
        print(f"Area of Square : { side**2 }")

    def perimeter_of_sqaure():
        side = float(input("Enter Side of Square : "))
        print(f"Perimeter of Square : { 4 * side }")

    def area_of_triangle():
        base = float(input("Enter Base of Triangle : "))
        height = float(input("Enter Height of Triangle : "))
        print(f"Area of Triangle : { 0.5 * base * height}")

    def perimeter_of_triangle():
        side1 = float(input("Enter 1st Side of Triangle : "))
        side2 = float(input("Enter 2nd Side of Triangle : "))
        side3 = float(input("Enter 3rd Side of Triangle : "))
        print(f"Perimeter of Triangle : { side1 + side2 + side3 }")

    def area_of_circle():
        radius = float(input("Enter Radius of Circle : "))
        print(f"Area of Circle : { 3.14 * (radius**2) }")

    def perimeter_of_circle():
        radius = float(input("Enter Radius of Circle : "))
        print(f"Perimeter of Circle : { 2 * 3.14 * radius }")

    def surface_area_of_cube():
        side = float(input("Enter Side of the Cube : "))
        print(f"Surface Area of Cube : { 6 * (side**2) }")

    def volume_of_cube():
        side = float(input("Enter Side of the Cube : "))
        print(f"Volume of Cube : { side**3 }")

    def surface_area_of_cylinder():
        radius = float(input("Enter Radius of Cylinder : "))
        height = float(input("Enter Height of Cylinder : "))
        print(f"Surface Area of Cylinder : { 2 * 3.14 * radius * ( radius + height ) }")

    def volume_of_cylinder():
        radius = float(input("Enter Radius of Cylinder : "))
        height = float(input("Enter Height of Cylinder : "))
        print(f"Volume of Cylinder : { 3.14 * radius**2 * height }")

    while(True):
        menu = '''
|--------------------------------------|
| 1. Area of Rectangle                 |
| 2. Perimeter of Rectangle            |
| 3. Area of Square                    |
| 4. Perimeter of Square               |
| 5. Area of Triangle                  |
| 6. Perimeter of Triangle             |
| 7. Area of Circle                    |
| 8. Perimeter of Circle               |
| 9. Surface Area of Cube              |
| 10. Volume of Cube                   |
| 11. Surface Area of Cylinder         |
| 12. Volume of Cylinder               |
|--------------------------------------|
'''
        print(menu)
        option = int(input("Enter your option [ for stop : 0 ] : "))

        if option == 0:
            break
        if option == 1 :
            area_of_rectangle()
        elif option == 2 :
            perimeter_of_rectangle()
        elif option == 3 :
            area_of_sqaure()
        elif option == 4 :
            perimeter_of_sqaure()
        elif option == 5 :
            area_of_triangle()
        elif option == 6 :
            perimeter_of_triangle()
        elif option == 7 :
            area_of_circle()
        elif option == 8 :
            perimeter_of_circle()
        elif option == 9 :
            surface_area_of_cube()
        elif option == 10 :
            volume_of_cube()
        elif option == 11 :
            surface_area_of_cylinder()
        elif option == 12 :
            volume_of_cylinder()
        else:
            print("Invalid Option !!!")
    

# Find mean, median, mode
def mean_median_mode():
    print("\n-------- Mean, Median, Mode --------\n")

    size = int(input("Enter the size of list number : "))
    number_list = [""]*size

    for i in range(size):
        number_list[i] = int(input(f"Enter {i+1} element : "))

    print("\nEntered List :",number_list)
    print()
    mean_value = mean(number_list)
    print(f"Mean : {mean_value}")

    median_value = median(number_list)
    print(f"Median : {median_value}")
    
    mode_value = mode(number_list)
    print(f"Mode : {mode_value}")

    print("\n------------------------------------\n")



#------------------------------------------------
while(True):
    menu = '''
|--------------------------------------|
| 1. Simple Calculator                 |
| 2. Find x from Quardratic Equation   |
| 3. Find Square and Cube of Number    |
| 4. Remove Unwanted Space             |
| 5. Check Prime or Not                |
| 6. Mensurations Formula              |
| 7. Mean, Median, Mode                |
|--------------------------------------|
'''
    print(menu)
    option = int(input("Enter your option [ for stop : 0 ] : "))

    if option == 0:
        break
    if option == 1 :
        calculator()
    elif option == 2 :
        quardratic_equation()
    elif option == 3 :
        find_square_cube()
    elif option == 4 :
        remove_unwantd_space()
    elif option == 5 :
        check_prime_or_not()
    elif option == 6 :
        mensuration_formula()
    elif option == 7 :
        mean_median_mode()
    else:
        print("Invalid Option !!!")
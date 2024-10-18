# Sum of all elements present in the list
def sum_of_elements():
    l1 = [1, 2, 3, 4, 5]
    sum = 0
    for i in l1:
        sum = sum + i
    
    print("List of Numbers :",l1)
    print(f"Sum of all elements of the list : {sum}")

# Find the Largest element in the list
def largest_element():
    l2 = [1, 2, 3, 4, 5]
    print("List of Numbers :",l2)
    print("Largest element present in list :",max(l2))

# Count number of occurence in the list
def count_specific_element():
    l3 = [1, 2, 3, 4, 4, 4, 5]
    print("List of Numbers :",l3)
    print(f"Occurence of 4 number in list : {l3.count(4)} times")

# Find the Second Largest element in the list
def second_largest_element():
    l4 = [1, 2, 3, 4, 5]
    print("List of Numbers :",l4)

    largest_number = max(l4)
    l4.remove(largest_number)

    second_largest_number = max(l4)
    print("Second Largest present in the list :",second_largest_number)

# Check the list empty or not
def check_list_empty_or_not():
    l5 = []
    print("List of Numbers :",l5)

    if l5 == []:
        print("List is Empty")
    else:
        print("List is not Empty")

# Remove duplicate elements from the list
def remove_duplicate_elements():
    l6 = [3, 4, 5, 4, 6, 5, 3, 6, 7]
    print("List of Numbers :",l6)
    unique_numbers = []

    for element in l6:
        if element not in unique_numbers:
            unique_numbers.append(element)
    
    print("Removed Duplicate Numbers :",unique_numbers)

# Reverse the List
def reverse_list():
    l7 = [1, 2, 3, 4, 5]
    print("List of Numbers :",l7)

    l7.reverse()
    print("Reversed List :",l7)

# Merge two List
def merge_two_list():
    l8 = [1, 2, 3]
    print("List 1 :",l8)
    l9 = [4, 5, 6]
    print("List 2 :",l9)

    merged_list = l8 + l9
    print("Merged List :",merged_list)

# Common elements of the list
def commomn_elements_list():
    l10 = [1, 2, 3, 4]
    print("List 1 :",l10)
    l11 = [3, 4, 5, 6]
    print("List 2 :",l11)

    commomn_elements = []

    for element in l10:
        if element in l11:
            commomn_elements.append(element)

    print("Common elements in List :",commomn_elements)

# Check if a list contains any voweles or not
def check_list_contains_vowels_or_not():
    l12 = ['a', 'b', 'c', 'd', 'e']
    vowels = ['a', 'e', 'i', 'o', 'u']

    contains_vowels = False
    for character in l12:
        if character in vowels:
            contains_vowels = True
            break
            
    print("Characters in List :",l12)
    if contains_vowels:
        print("The list contains vowels.")
    else:
        print("The list does not contains any vowels.")


# --------------------------------------------------------------

print()
sum_of_elements()
print()
largest_element()
print()
count_specific_element()
print()
second_largest_element()
print()
check_list_empty_or_not()
print()
remove_duplicate_elements()
print()
reverse_list()
print()
merge_two_list()
print()
commomn_elements_list()
print()
check_list_contains_vowels_or_not()
print()

# --------------------------------------------------------------

'''
 ----------------- OUTPUT -----------------

List of Numbers : [1, 2, 3, 4, 5]      
Sum of all elements of the list : 15   

List of Numbers : [1, 2, 3, 4, 5]      
Largest element present in list : 5    

List of Numbers : [1, 2, 3, 4, 4, 4, 5]
Occurence of 4 number in list : 3 times

List of Numbers : [1, 2, 3, 4, 5]
Second Largest present in the list : 4

List of Numbers : []
List is Empty

List of Numbers : [3, 4, 5, 4, 6, 5, 3, 6, 7]
Removed Duplicate Numbers : [3, 4, 5, 6, 7]

List of Numbers : [1, 2, 3, 4, 5]
Reversed List : [5, 4, 3, 2, 1]

List 1 : [1, 2, 3]
List 2 : [4, 5, 6]
Merged List : [1, 2, 3, 4, 5, 6]

List 1 : [1, 2, 3, 4]
List 2 : [3, 4, 5, 6]
Common elements in List : [3, 4]

Characters in List : ['a', 'b', 'c', 'd', 'e']
The list contains vowels.

'''
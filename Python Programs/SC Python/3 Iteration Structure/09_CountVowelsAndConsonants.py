print("\n----------- Count Vowels and Consonants from the String -----------\n")

string = input("Enter a string : ")
string = string.lower()

vowels = 0
consonants = 0
vowels_list = "aeiou"

for character in string:
    if character.isalpha():
        if character in vowels_list:
            vowels += 1
        else:
            consonants += 1

print(f"Number of vowels present in {string} : {vowels}")
print(f"Number of consonants present in {string} : {consonants}")

print("\n-------------------------------------------------------------------\n")
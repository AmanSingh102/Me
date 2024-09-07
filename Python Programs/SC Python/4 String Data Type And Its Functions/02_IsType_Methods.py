print("\n----> isalnum Function")
print("Hello123".isalnum())         # True
print("Hello 123".isalnum())        # False
print("12345".isalnum())            # True
print("Hello!".isalnum())           # False
print("".isalnum())                 # False

print("\n----> isalpha Function")
print("hello".isalpha())            # True
print("hello aman".isalpha())       # False
print("hello123".isalpha())         # False
print("hello!".isalpha())           # False
print("".isalpha())                 # False

print("\n----> isacii Function")
print("hello".isascii())            # True
print("hello!@#".isascii())         # True
print("hello world".isascii())      # True
print(" ".isascii())                # True
print("😍".isascii())               # False

print("\n----> isdecimal Function")
print("12345".isdecimal())          # True
print("123ABC".isdecimal())         # False
print("123.45".isdecimal())         # False
print(" 12345 ".isdecimal())        # False
print(" ".isdecimal())              # False

print("\n----> isdigit Function")
print("123".isdigit())              # True    
print("123ABC".isdigit())           # False
''' print(123.isdigit()) '''        # Error
print("12.3".isdigit())             # False

print("\n----> isnumeric Function")
print("123".isnumeric())            # True
print("123ABC".isnumeric())         # False
print("123.45".isnumeric())         # False
print("1/2".isnumeric())            # False
print("\u0030".isnumeric())         # True
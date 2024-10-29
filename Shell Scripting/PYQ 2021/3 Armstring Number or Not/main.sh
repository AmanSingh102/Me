#!/bin/bash

# Read number from user
read -p "Enter a number: " num

# Initialize variables
sum=0
temp=$num
digits=${#num}

# Calculate the sum of each digit raised to the power of the number of digits
while [ $temp -gt 0 ]; do
    digit=$((temp % 10))
    sum=$((sum + digit ** digits))
    temp=$((temp / 10))
done

# Check if the sum is equal to the original number
if [ $sum -eq $num ]; then
    echo "$num is an Armstrong number."
else
    echo "$num is not an Armstrong number."
fi


# OUTPUT -----------------------------------------------
# Enter a number: 153
# 153 is an Armstrong number.
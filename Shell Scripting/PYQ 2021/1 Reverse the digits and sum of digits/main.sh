#!/bin/bash

read -p "Enter a number : " number

reverse=0
sum=0
temp=$number

while [ $temp -gt 0 ]
do 
    digit=$((temp % 10))
    temp=$((temp / 10))
    reverse=$((reverse * 10 + digit))
    sum=$((sum + digit))
done

echo "Reversed Number : $reverse"
echo "Sum of digits : $sum" 


# OUTPUT ------------------------------------
# Enter a number : 1234
# Reversed Number : 4321
# Sum of digits : 10  
#!/bin/bash

read -p "Enter 1st number : " num_1
read -p "Enter 2nd number : " num_2

echo "Before Swaping : $num_1 and $num_2"

temp=$num_1
num_1=$num_2
num_2=$temp

echo "After Swaping : $num_1 and $num_2"


# OUTPUT --------------------------------------
# Enter 1st number : 1
# Enter 2nd number : 2
# Before Swaping : 1 and 2
# After Swaping : 2 and 1 
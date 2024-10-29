#!/bin/bash

read -p "Enter 1st number : " num_1
read -p "Enter 2nd number : " num_2

echo "Before Swapping : $num_1 and $num_2"

num_1=$((num_1 + num_2))
num_2=$((num_1 - num_2))
num_1=$((num_1 - num_2))

echo "After Swapping : $num_1 and $num_2"


# OUTPUT --------------------------------------------
# Enter 1st number : 2
# Enter 2nd number : 5
# Before Swapping  : 2 and 5
# After Swapping   : 5 and 2 
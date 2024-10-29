#!/bin/bash

read -p "Enter a string : " string

reverse=""
lenght=${#string}

for (( i=$lenght-1; i>=0; i-- ))
do
    reverse="$reverse${string:$i:1}"
done

echo "Reversed String : $reverse"

# OUTPUT ------------------------------------
# Enter a string : abcd
# Reversed String : dcba
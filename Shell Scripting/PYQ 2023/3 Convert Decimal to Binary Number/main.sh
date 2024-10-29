#!/bin/bash

read -p "Enter a decimal number : " number
echo "Decimal Representation : $number"

binary=""

if [ "$number" -eq 0 ]; then
    binary="0"
else 
    while [ "$number" -gt 0 ]; do 
        remainder=$((number % 2))

        binary="$remainder$binary"

        number=$((number / 2))
    done
fi

echo "Binary Representation : $binary"


# OUTPUT ---------------------------------------------
# Enter a decimal number : 10
# Decimal Representation : 10
# Binary Representation : 1010
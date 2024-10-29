#!/bin/bash

sum=0

for (( i=1; i<=50; i++ )); 
do
    sum=$((sum + i))
done

echo "Sum of numbers from 1 to 50 : $sum"


# OUTPUT -------------------------------------------
# Sum of numbers from 1 to 50 : 1275
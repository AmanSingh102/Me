#!/bin/bash

read -p "Enter the number of rows : " rows

for (( i=1; i<=rows; i++ )); do
    for (( j=1; j<=i; j++ )); do
        echo -n "* "
    done
    echo
done

# OUTPUT ---------------------------------------
# Enter the number of rows : 5
# *
# * *       
# * * *     
# * * * *   
# * * * * * 
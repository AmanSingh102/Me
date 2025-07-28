#include<stdio.h>

int main()
{
    int num;
    int numArr[] = {30, 16, 89, 74, 55};
    int found = 0;

    printf("Enter the number to search : ");
    scanf("%d", &num);

    for (int i = 0; i < 5; i++)
    {
        if (numArr[i] == num)
        {
            found = 1;
            break;
        }
    }

    if (found)
        printf("%d is found in array\n", num);
    else
        printf("%d is not found in array\n", num);

    return 0;
}

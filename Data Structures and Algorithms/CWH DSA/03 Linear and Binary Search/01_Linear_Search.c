#include <stdio.h>

int Linear_Search(int arr[], int size, int element)
{
    for (int i = 0; i < size; i++)
    {
        if (arr[i] == element)
        {
            return i;
        }
    }
    return -1;
}

int main()
{
    int arr[] = {1, 2, 3, 56, 98, 97, 54, 47, 11, 36, 96, 44};
    int size = sizeof(arr)/sizeof(int);
    int element = 96;

    int searchIndex = Linear_Search(arr, size, element);
    printf("The element %d was found at index %d\n", element, searchIndex);
    
    return 0;
}
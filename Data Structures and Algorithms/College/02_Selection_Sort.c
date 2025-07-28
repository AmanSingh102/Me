#include<stdio.h>

int main()
{
    int list[] = {12, 7, 19, 6, 5}; 
    int size = 5;
    
    printf("Original List : ");
    for(int i = 0; i < size; i++)
    {
        printf("%d ", list[i]);
    }
    printf("\n");
    

    for( int i = 0; i < size; i++ )
    {
        int select = i;
        for (int j = i + 1; j < size; j++)
        {
            if( list[j] < list[select] )
            {
                select = j;
            }
        }

        int temp = list[i];
        list[i] = list[select];
        list[select] = temp;
    }-

    printf("Sorted List : ");
    for(int i = 0; i < size; i++)
    {
        printf("%d ", list[i]);
    }
    printf("\n");
    
    return 0;
}
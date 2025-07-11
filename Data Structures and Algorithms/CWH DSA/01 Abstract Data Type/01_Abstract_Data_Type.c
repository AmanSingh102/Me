#include <stdio.h>
#include <stdlib.h>

struct myArray
{
    int total_size;
    int use_size;
    int *ptr;
};

void createArray(struct myArray *a, int tSize, int uSize)
{
    // (*a).total_size = tSize;
    // (*a).use_size = uSize;
    // (*a).ptr = (int *)malloc(tSize * sizeof(int));
    a->total_size = tSize;
    a->use_size = uSize;
    a->ptr = (int *)malloc(tSize * sizeof(int));
}

void show( struct myArray *a )
{
    for (int i = 0; i < a->use_size; i++)
    {
        printf("Value : %d\n", (a->ptr)[i]);
    }
    
}

void setValue( struct myArray *a )
{
    int n;
    for (int i = 0; i < a->use_size; i++)
    {
        printf("Enter element %d : ", i);
        scanf("%d", &n);
        (a->ptr)[i] = n;
    }
    
}

int main()
{
    struct myArray marks;
    createArray(&marks, 10, 2);

    printf("\nWe are running setValue now ------>\n");
    setValue(&marks);
    printf("\nWe are running show now ------>\n");
    show(&marks);
    printf("\n");
    
    return 0;
}
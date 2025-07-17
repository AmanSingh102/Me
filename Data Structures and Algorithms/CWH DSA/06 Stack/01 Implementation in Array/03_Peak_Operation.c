// Peak Operation ------------------------------
#include <stdio.h>
#include <stdlib.h>

struct stack
{
    int size;
    int top;
    int *arr;
};

int isEmpty(struct stack *ptr)
{
    if (ptr->top == -1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int isFull(struct stack *ptr)
{
    if (ptr->top == ptr->size - 1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

void push(struct stack *ptr, int val)
{
    if (isFull(ptr))
    {
        printf("\nStack Overfllow !!, Cannot push %d to the stack\n", val);
    }
    else
    {
        ptr -> top++;
        ptr -> arr[ptr -> top] = val;
    }
}

int pop(struct stack *ptr)
{
    if (isEmpty(ptr))
    {
        printf("\nStack Underfllow !!, Cannot pop from the stack\n");
        return -1;
    }
    else
    {
        int val = ptr-> arr[ptr -> top];
        ptr -> top--;                       // ptr -> top = ptr -> top - 1;
        return val;
    }
}

int peek( struct stack *sp, int i )
{
    int arrayInd = sp -> top - i + 1;
    if( arrayInd < 0 )
    {
        printf("Not a valid position for the stack\n");
        return -1;
    }
    else 
    {
        return sp -> arr[ arrayInd ];
    }
}


int main()
{
    struct stack *sp = (struct stack *)malloc(sizeof(struct stack));
    sp->size = 10;
    sp->top = -1;
    sp->arr = (int *)malloc(sp->size * sizeof(int));
    printf("\nStack has been created successfully....\n");

    printf("\nBefore ---- \n");
    printf("Before pushing, Full : %d\n", isFull(sp));
    printf("Before pushing, Empty : %d\n", isEmpty(sp));

    push(sp, 11);
    push(sp, 12);
    push(sp, 13);
    push(sp, 14);
    push(sp, 15);
    push(sp, 16);
    push(sp, 17);
    push(sp, 18);
    push(sp, 19);
    push(sp, 20);
    push(sp, 21);  
    
    printf("\nAfter ---- \n");
    printf("After pushing, Full : %d\n", isFull(sp));
    printf("After pushing, Empty : %d\n", isEmpty(sp));

    printf("\nPrinting value from the stack ------>\n\n");
    for ( int k = 1; k <= sp -> top + 1; k++)
    {
        printf("The value at position %d is %d\n", k, peek(sp, k));
    }

    printf("\nPopped %d from the stack\n", pop(sp));       // last in first out!!

    printf("\n");
    return 0;
}

// Stack Operation using an arrays
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

    printf("\nPopped %d from the stack\n", pop(sp));       // last in first out!!

    printf("\n");
    return 0;
}


// -- CHATGPT
// Example of a complete stack operation program
// Uncomment the below code to run a complete stack operation example          
// #include <stdio.h>
// #include <stdlib.h>

// struct stack {
//     int size;
//     int top;
//     int *arr;
// };

// int isEmpty(struct stack *ptr) {
//     if (ptr->top == -1) {
//         return 1;
//     } else {
//         return 0;
//     }
// }

// int isFull(struct stack *ptr) {
//     if (ptr->top == ptr->size - 1) {
//         return 1;
//     } else {
//         return 0;
//     }
// }

// int main() {
//     struct stack *s;
//     s = (struct stack *)malloc(sizeof(struct stack));
//     s->size = 8;
//     s->top = -1;
//     s->arr = (int *)malloc(s->size * sizeof(int));

//     int val = 7; // ✅ declare val before use

//     // Push
//     if (isFull(s)) {
//         printf("Stack Overflow\n");
//     } else {
//         s->top++;
//         s->arr[s->top] = val;
//     }

//     // Pop
//     if (isEmpty(s)) {
//         printf("Stack Underflow\n");
//     } else {
//         val = s->arr[s->top];
//         s->top = s->top - 1;
//         printf("Popped value: %d\n", val); // ✅ print instead of return
//     }

//     return 0;
// }
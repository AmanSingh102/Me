#include <stdio.h>
#include <stdlib.h>

// Creation
struct Node
{
    int data;
    struct Node *next;
};

void linkedListTraversal(struct Node *ptr)
{
    while (ptr != NULL)
    {
        printf("Element : %d\n", ptr->data);
        ptr = ptr->next;
    }
}

// Case 1 : Delete Head or First element ( begining )
struct Node *deleteAtFirst(struct Node *head)
{
    struct Node *ptr = head;
    head = head -> next;
    free(ptr);
    return head;
}   

// Case 2 : Delete in Between ( in specific/given index )
struct Node *deleteAtIndex(struct Node *head, int index)
{
    struct Node *p = head;
    struct Node *q = head -> next; 

    for (int i = 0; i < index - 1; i++)
    {
        p = p -> next;
        q = q -> next;
    }
    
    p -> next = q -> next;
    return head;
}

// Case 3 : Delete at End ( Delete the last element )
struct Node *deleteAtEnd(struct Node *head)
{
    struct Node *p = head;
    struct Node *q = head -> next; 

    while ( q -> next != NULL )
    {
        p = p -> next;
        q = q -> next;
    }
    
    p -> next = NULL;
    return head;
}

// Case 4 : Delete with given value ( Deleting the element with a given value )
struct Node *deleteAtNode(struct Node *head, int value)
{
    struct Node *p = head;
    struct Node *q = head -> next; 

    while( q->data != value && q->next != NULL )
    {
        p = p -> next;
        q = q -> next;
    }
    
    if( q->data == value )
    {
        p->next = q->next;
        free(q);
    }
    return head;
}   


int main()
{
    // Creating head of the node similarly second, third and so on.
    struct Node *head;
    struct Node *second;
    struct Node *third;
    struct Node *fourth;

    // Allocate memory for nodes in the linked list in Heap.
    head = (struct Node *)malloc(sizeof(struct Node));
    second = (struct Node *)malloc(sizeof(struct Node));
    third = (struct Node *)malloc(sizeof(struct Node));
    fourth = (struct Node *)malloc(sizeof(struct Node));

    // Link first and second nodes
    head->data = 4;
    head->next = second;

    // Link second and third nodes
    second->data = 3;
    second->next = third;

    // Terminate the list at the third node
    third->data = 8;
    third->next = fourth;
    
    // Terminate the list at the third node
    fourth->data = 1;
    fourth->next = NULL;

    // CALLING THE FUNCTION TO PRINT 
    printf("\n-----------------------------\n\n");
    linkedListTraversal(head);

    // Case 1 : Delete Head or First element ( begining )
    printf("\n-----------------------------\n\n");
    // head = deleteAtFirst(head);
    linkedListTraversal(head);
    printf("\n-----------------------------\n\n");

    // Case 2 : Delete in Between ( in specific/given index )
    printf("\n-----------------------------\n\n");
    // head = deleteAtIndex(head, 2);
    linkedListTraversal(head);
    printf("\n-----------------------------\n\n");
    
    // Case 3 : Delete at End ( Delete the last element )
    printf("\n-----------------------------\n\n");
    // head = deleteAtEnd(head);
    linkedListTraversal(head);
    printf("\n-----------------------------\n\n");
    
    // Case 4 : Delete with given value ( Deleting the element with a given value )
    printf("\n-----------------------------\n\n");
    head = deleteAtNode(head, 3);
    linkedListTraversal(head);
    printf("\n-----------------------------\n\n");
   
    return 0;
} 
#include <stdio.h>
#include <stdlib.h>

// Creation
struct Node
{
    int data;
    struct Node *next;
};

void linkedListTraversal(struct Node *head)
{
    struct Node *ptr = head;

    // ---------------------------------------------------------
    // printf("Element : %d\n", ptr->data);
    // ptr = ptr->next;
    // while (ptr != head)
    // {
    //     printf("Element : %d\n", ptr->data);
    //     ptr = ptr->next;
    // }
    // ---------------------------------------------------------

    // Better way using do while loop
    do
    {
        printf("Element : %d\n", ptr->data);
        ptr = ptr->next;
    }while (ptr != head);
}

// Insert at first
struct Node *insertAtFirst( struct Node *head, int data )
{
    struct Node *ptr = ( struct Node *) malloc(sizeof(struct Node));
    ptr -> data = data;

    struct Node *p = head -> next;
    while ( p->next != head )
    {
        p = p -> next;
    }
    // At this point a points to the last node of the circular linked list.

    p -> next = ptr;
    ptr -> next = head;
    head = ptr;
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
    fourth->next = head;

    // CALLING THE FUNCTION TO PRINT 
    printf("\n-----------------------------\n\n");
    linkedListTraversal(head);
    
    // Insert at first
    printf("\n-----------------------------\n\n");
    head = insertAtFirst(head, 54);
    linkedListTraversal(head);
    printf("\n-----------------------------\n\n");

    return 0;
}
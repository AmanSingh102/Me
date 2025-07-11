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

// Case 1 : Insert in Head or First ( begining )
struct Node *insertAtFirst(struct Node *head, int data)
{
    struct Node *ptr = (struct Node *) malloc(sizeof(struct Node));
    ptr -> next = head;
    ptr -> data = data;
    return ptr;
}   

// Case 2 : Insert in Between ( in specific index )
struct Node *insertAtIndex(struct Node *head, int data, int index)
{
    struct Node *ptr = (struct Node *) malloc(sizeof(struct Node));
    struct Node *p = head;

    int i = 0;
    while ( i != index - 1 )
    {
        p = p -> next;
        i++;
    }
    ptr -> data = data;
    ptr -> next = p -> next;
    p -> next = ptr;
    return head;
}

// Case 3 : Insert at End
struct Node *insertAtEnd(struct Node *head, int data)
{
    struct Node *ptr = (struct Node *) malloc(sizeof(struct Node));
    ptr -> data = data;
    struct Node *p = head;

    while( p -> next != NULL )
    {
        p = p -> next;
    }
    p -> next = ptr;
    ptr -> next = NULL;
    return head;
}

// Case 4 : Insert After Node
struct Node *insertAfterNode(struct Node *head, struct Node *previous_node, int data)
{
    struct Node *ptr = (struct Node *) malloc(sizeof(struct Node));
    ptr -> data = data;

    ptr -> next = previous_node -> next;
    previous_node -> next = ptr;

    return head;
}   


int main()
{
    // Creating head of the node similarly second, third and so on.
    struct Node *head;
    struct Node *second;
    struct Node *third;

    // Allocate memory for nodes in the linked list in Heap.
    head = (struct Node *)malloc(sizeof(struct Node));
    second = (struct Node *)malloc(sizeof(struct Node));
    third = (struct Node *)malloc(sizeof(struct Node));

    // Link first and second nodes
    head->data = 7;
    head->next = second;

    // Link second and third nodes
    second->data = 11;
    second->next = third;

    // Terminate the list at the third node
    third->data = 66;
    third->next = NULL;

    // CALLING THE FUNCTION TO PRINT 
    printf("\n-----------------------------\n\n");
    linkedListTraversal(head);
    
    // Insert in Head or First
    printf("\n-----------------------------\n\n");
    head = insertAtFirst(head, 57);
    linkedListTraversal(head);
    printf("\n-----------------------------\n\n");

    // Insert in Between ( in specific index )
    head = insertAtIndex(head, 88, 1);
    linkedListTraversal(head);
    printf("\n-----------------------------\n\n");

    // Insert at End
    head = insertAtEnd(head, 100);
    linkedListTraversal(head);
    printf("\n-----------------------------\n\n");

    // Insert After Node
    head = insertAfterNode(head, second, 69);
    linkedListTraversal(head);
    printf("\n-----------------------------\n\n");

    return 0;
}
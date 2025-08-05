#include <stdio.h>      // Header file for input/output functions (e.g., printf)
#include <stdlib.h>     // Header file for dynamic memory allocation (e.g., calloc)1, 

// Define the structure for a node in the linked list
struct node 
{
    int data;                 // Data part to store an integer
    struct node *next;        // Pointer to the next node (self-referential)
};

// Create an alias for 'struct node' using typedef for simplicity
typedef struct node Node;

int main() {
    // Declare pointers
    Node *head, *t1, *t2, *t3, *traverse;

    // ------------------------
    // Creating First Node
    // ------------------------

    t1 = (Node*) calloc(1, sizeof(Node));  // Allocate memory for the first node
    t1->data = 10;                         // Store value 10 in the first node
    t1->next = NULL;                       // Initially, no link to next node

    head = t1;   // Head now points to the first node (start of the list)

    // ------------------------
    // Creating Second Node
    // ------------------------

    t2 = (Node*) calloc(1, sizeof(Node));  // Allocate memory for the second node
    t2->data = 20;                         // Store value 20 in second node
    t2->next = NULL;                       // Second node also ends here

    t1->next = t2;  // Link first node to second node

    // ------------------------
    // Creating Third Node
    // ------------------------

    t3 = (Node*) calloc(1, sizeof(Node));  // Allocate memory for third node
    t3->data = 55;                         // Store value 55 in third node
    t3->next = NULL;                       // Third node is the last, so next is NULL

    t2->next = t3;  // Link second node to third node

    // ------------------------
    // Traversing the Linked List
    // ------------------------

    traverse = head;   // Start from the head of the list

    printf("\nLinked list contents : ");

    while (traverse != NULL) 
    {
        printf("%d -> ", traverse->data);   // Print current node's data
        traverse = traverse->next;          // Move to the next node
    }

    printf("NULL\n\n");  // Print NULL at the end to show end of list

    return 0;  // Exit the program
}


// Reverse an existing single linked list of four elements or nodes reverse.
#include <stdio.h>
#include <stdlib.h>

// Define structure for a node
struct Node 
{
    int data;
    struct Node* next;
};

// Function to create a new node
struct Node* createNode(int data) 
{
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

// Function to display linked list
void display(struct Node* head) {
    struct Node* temp = head;
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

// Function to reverse linked list
struct Node* reverse(struct Node* head) 
{
    struct Node *prev = NULL, *curr = head, *next = NULL;

    while (curr != NULL) {
        next = curr->next;   // store next node
        curr->next = prev;   // reverse pointer
        prev = curr;         // move prev forward
        curr = next;         // move curr forward
    }
    return prev;  // new head
}

int main() 
{
    // Create 4 nodes manually
    struct Node* head = createNode(10);
    head->next = createNode(20);
    head->next->next = createNode(30);
    head->next->next->next = createNode(40);

    printf("Original Linked List:\n");
    display(head);

    // Reverse linked list
    head = reverse(head);

    printf("\nReversed Linked List:\n");
    display(head);

    return 0;
}

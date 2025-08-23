// WAP in c language to create a linked list of four elements, then display the linked list, update a node from the linked list and search a node from the linked list.
#include <stdio.h>
#include <stdlib.h>

// Define node structure
struct Node {
    int data;
    struct Node* next;
};

// Function to display linked list
void display(struct Node* head) 
{
    struct Node* temp = head;
    printf("Linked List: ");
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

// Function to update a node value
void update(struct Node* head, int oldValue, int newValue) 
{
    struct Node* temp = head;
    while (temp != NULL) 
    {
        if (temp->data == oldValue) 
        {
            temp->data = newValue;
            printf("Node updated: %d -> %d\n", oldValue, newValue);
            return;
        }
        temp = temp->next;
    }
    printf("Value %d not found, update failed!\n", oldValue);
}

// Function to search for a node
void search(struct Node* head, int key) 
{
    struct Node* temp = head;
    int pos = 1;
    while (temp != NULL) 
    {
        if (temp->data == key) 
        {
            printf("Element %d found at position %d\n", key, pos);
            return;
        }
        temp = temp->next;
        pos++;
    }
    printf("Element %d not found in the list\n", key);
}

int main() {
    struct Node *head, *second, *third, *fourth;

    // Allocate 4 nodes
    head   = (struct Node*)malloc(sizeof(struct Node));
    second = (struct Node*)malloc(sizeof(struct Node));
    third  = (struct Node*)malloc(sizeof(struct Node));
    fourth = (struct Node*)malloc(sizeof(struct Node));

    // Assign data
    head->data = 10;
    second->data = 20;
    third->data = 30;
    fourth->data = 40;

    // Link nodes
    head->next = second;
    second->next = third;
    third->next = fourth;
    fourth->next = NULL;

    printf("Initial Linked List:\n");
    display(head);

    // Update node
    update(head, 20, 25);
    display(head);

    // Search node
    search(head, 30);
    search(head, 50);

    return 0;
}

// Output
// Initial Linked List:
// Linked List: 10 -> 20 -> 30 -> 40 -> NULL
// Node updated: 20 -> 25
// Linked List: 10 -> 25 -> 30 -> 40 -> NULL
// Element 30 found at position 3
// Element 50 not found in the list
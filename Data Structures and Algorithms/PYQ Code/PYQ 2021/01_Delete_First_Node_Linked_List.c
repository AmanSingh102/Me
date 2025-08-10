#include <stdio.h>
#include <stdlib.h>

// Define the structure of a node
struct Node {
    int data;
    struct Node* next;
};

// Function to create a new node
struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

// Function to insert a node at the end
struct Node* insertEnd(struct Node* head, int data) {
    struct Node* newNode = createNode(data);
    
    if (head == NULL) {
        newNode->next = newNode;  // Points to itself
        return newNode;
    }

    struct Node* temp = head;
    while (temp->next != head) {
        temp = temp->next;
    }

    temp->next = newNode;
    newNode->next = head;
    return head;
}

// Function to display the circular linked list
void display(struct Node* head) {
    if (head == NULL) {
        printf("List is empty.\n");
        return;
    }

    struct Node* temp = head;
    do {
        printf("%d ", temp->data);
        temp = temp->next;
    } while (temp != head);
    printf("\n");
}

// Function to delete the first node
struct Node* deleteFirst(struct Node* head) {
    if (head == NULL)
        return NULL;

    // Only one node
    if (head->next == head) {
        free(head);
        return NULL;
    }

    struct Node* temp = head;

    // Find the last node
    struct Node* last = head;
    while (last->next != head) {
        last = last->next;
    }

    // Point last node to second node
    last->next = head->next;
    head = head->next;

    free(temp);
    return head;
}

// Main function
int main() {
    struct Node* head = NULL;

    // Inserting nodes
    head = insertEnd(head, 10);
    head = insertEnd(head, 20);
    head = insertEnd(head, 30);
    head = insertEnd(head, 40);

    printf("Original Circular Linked List: ");
    display(head);

    // Deleting first node
    head = deleteFirst(head);
    printf("After deleting first node: ");
    display(head);

    return 0;
}

#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* prev;
    struct Node* next;
};

void insertAfterNode(struct Node** head, int nodeNumber, int newData) {
    struct Node* temp = *head;
    int count = 1;

    // Traverse to the given node number
    while (temp != NULL && count < nodeNumber) {
        temp = temp->next;
        count++;
    }

    // If node not found
    if (temp == NULL) {
        printf("Node number %d not found.\n", nodeNumber);
        return;
    }

    // Create new node
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = newData;

    // Insert after current node
    newNode->next = temp->next;
    newNode->prev = temp;
    if (temp->next != NULL)
        temp->next->prev = newNode;
    temp->next = newNode;
}

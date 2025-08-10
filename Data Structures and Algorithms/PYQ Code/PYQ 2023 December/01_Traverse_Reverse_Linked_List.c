#include <stdio.h>
#include <stdlib.h>

// Define node structure
struct Node {
    int data;
    struct Node* next;
};

// Function to traverse in reverse
void reverseTraverse(struct Node* head) {
    if (head == NULL)
        return;
    reverseTraverse(head->next);
    printf("%d ", head->data);
}

// Function to create a new node
struct Node* createNode(int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->next = NULL;
    return newNode;
}

// Driver code
int main() {
    // Create linked list: 10 -> 20 -> 30
    struct Node* head = createNode(10);
    head->next = createNode(20);
    head->next->next = createNode(30);

    printf("Linked list in reverse order:\n");
    reverseTraverse(head);  // Output: 30 20 10

    return 0;
}

    #include <stdio.h>
#include <stdlib.h>

// Global Variables
struct Node *front = NULL;
struct Node *rear = NULL;

struct Node {
    int data;
    struct Node *next;
};

void linkedListTraversal(struct Node *ptr) {
    printf("DEQueue elements: ");
    while (ptr != NULL) {
        printf("%d ", ptr->data);
        ptr = ptr->next;
    }
    printf("\n");
}

// Insert at rear (normal enqueue)
void insertRear(int val) {
    struct Node *n = (struct Node *)malloc(sizeof(struct Node));
    if (n == NULL) {
        printf("DEQueue is Full\n");
        return;
    }
    n->data = val;
    n->next = NULL;
    
    if (rear == NULL) {
        front = rear = n;
    } else {
        rear->next = n;
        rear = n;
    }
}

// Insert at front
void insertFront(int val) {
    struct Node *n = (struct Node *)malloc(sizeof(struct Node));
    if (n == NULL) {
        printf("DEQueue is Full\n");
        return;
    }
    n->data = val;
    n->next = front;
    
    if (front == NULL) {
        front = rear = n;
    } else {
        front = n;
    }
}

// Delete from front (normal dequeue)
int deleteFront() {
    if (front == NULL) {
        printf("DEQueue is Empty\n");
        return -1;
    }
    
    struct Node *temp = front;
    int val = temp->data;
    front = front->next;
    
    if (front == NULL) {
        rear = NULL;
    }
    
    free(temp);
    return val;
}

// Delete from rear
int deleteRear() {
    if (rear == NULL) {
        printf("DEQueue is Empty\n");
        return -1;
    }
    
    int val = rear->data;
    
    if (front == rear) {
        // Only one element
        free(front);
        front = rear = NULL;
    } else {
        // Traverse to find the node before rear
        struct Node *temp = front;
        while (temp->next != rear) {
            temp = temp->next;
        }
        
        free(rear);
        rear = temp;
        rear->next = NULL;
    }
    
    return val;
}

int main() {
    printf("Initial DEQueue:\n");
    linkedListTraversal(front);
    
    printf("Deleting from front: %d\n", deleteFront());
    printf("Deleting from rear: %d\n", deleteRear());
    
    insertRear(10);
    insertFront(5);
    insertRear(20);
    insertFront(2);
    
    printf("Current DEQueue:\n");
    linkedListTraversal(front);
    
    printf("Deleting from front: %d\n", deleteFront());
    printf("Deleting from rear: %d\n", deleteRear());
    
    printf("Final DEQueue:\n");
    linkedListTraversal(front);
    
    return 0;
}


// Key Features:
// Global Pointers: Uses global front and rear pointers like your example

// Four Main Operations:

// insertFront() - Add element at front

// insertRear() - Add element at rear (normal enqueue)

// deleteFront() - Remove from front (normal dequeue)

// deleteRear() - Remove from rear

// Traversal Function: Similar to your linkedListTraversal()

// Error Handling: Checks for empty/full conditions

// Memory Management: Properly frees memory when deleting nodes


// Output:
// Initial DEQueue:
// DEQueue elements: 
// Deleting from front: DEQueue is Empty
// -1
// Deleting from rear: DEQueue is Empty
// -1
// Current DEQueue:
// DEQueue elements: 2 5 10 20 
// Deleting from front: 2
// Deleting from rear: 20
// Final DEQueue:
// DEQueue elements: 5 10 
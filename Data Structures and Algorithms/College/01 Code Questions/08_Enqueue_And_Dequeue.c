// WAP in c language to implement the enqueue and dequeue operations on the queue.
#include <stdio.h>
#define SIZE 5  // Maximum size of queue

int queue[SIZE];
int front = -1, rear = -1;

// Function to check if queue is full
int isFull() 
{
    return (rear == SIZE - 1);
}

// Function to check if queue is empty
int isEmpty() 
{
    return (front == -1 || front > rear);
}

// Enqueue operation
void enqueue(int value) 
{
    if (isFull()) {
        printf("Queue is full! Cannot enqueue %d\n", value);
        return;
    }
    if (front == -1) front = 0;  // First element
    rear++;
    queue[rear] = value;
    printf("Enqueued: %d\n", value);
}

// Dequeue operation
void dequeue() 
{
    if (isEmpty()) 
    {
        printf("Queue is empty! Cannot dequeue.\n");
        return;
    }
    printf("Dequeued: %d\n", queue[front]);
    front++;
}

// Display queue
void display() 
{
    if (isEmpty()) 
    {
        printf("Queue is empty!\n");
        return;
    }
    printf("Queue elements: ");
    for (int i = front; i <= rear; i++) 
    {
        printf("%d ", queue[i]);
    }
    printf("\n");
}

// Main function
int main() {
    int choice, value;

    while (1) {
        printf("\n--- Queue Menu ---\n");
        printf("1. Enqueue\n2. Dequeue\n3. Display\n4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value to enqueue: ");
                scanf("%d", &value);
                enqueue(value);
                break;
            case 2:
                dequeue();
                break;
            case 3:
                display();
                break;
            case 4:
                return 0;
            default:
                printf("Invalid choice! Try again.\n");
        }
    }
}

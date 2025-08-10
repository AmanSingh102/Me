#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *next;
};

// Helper: create a new node
struct Node* createNode(int val) {
    struct Node* p = (struct Node*)malloc(sizeof(struct Node));
    if (p == NULL) {
        printf("Memory allocation failed\n");
        return NULL;
    }
    p->data = val;
    p->next = NULL;
    return p;
}

// Insert a node with value 'item' AFTER position pos (1-based)
int insertAfterPosition(struct Node **headRef, int pos, int item) {
    if (pos < 1) return 0; // invalid position

    // If list is empty
    if (*headRef == NULL) {
        // We cannot insert after pos >= 1 in empty list (under this policy)
        return 0;
    }

    // Traverse to the node at position pos
    struct Node *ptr = *headRef;
    int count = 1;
    while (ptr != NULL && count < pos) {
        ptr = ptr->next;
        count++;
    }

    if (ptr == NULL) {
        // pos is beyond list length
        return 0;
    }

    struct Node *newNode = createNode(item);
    if (newNode == NULL) return 0; // allocation failed

    // Do the insertion
    newNode->next = ptr->next;
    ptr->next = newNode;
    return 1; // success
}

// Utility: append node at end (for building sample list)
void append(struct Node **headRef, int val) {
    struct Node *n = createNode(val);
    if (*headRef == NULL) {
        *headRef = n;
        return;
    }
    struct Node *t = *headRef;
    while (t->next) t = t->next;
    t->next = n;
}

// Utility: print list
void printList(struct Node *head) {
    while (head) {
        printf("%d", head->data);
        if (head->next) printf(" -> ");
        head = head->next;
    }
    printf(" -> NULL\n");
}

// Example usage
int main() {
    struct Node *head = NULL;
    // Build example list: 10 -> 20 -> 30 -> 40
    append(&head, 10); append(&head, 20);
    append(&head, 30); append(&head, 40);

    printf("Before insertion:\n");
    printList(head);

    int pos = 2;
    int item = 25;
    if (insertAfterPosition(&head, pos, item)) {
        printf("After inserting %d after position %d:\n", item, pos);
        printList(head);
    } else {
        printf("Insertion failed (invalid position or memory error).\n");
    }

    // Free nodes (left as exercise)
    return 0;
}

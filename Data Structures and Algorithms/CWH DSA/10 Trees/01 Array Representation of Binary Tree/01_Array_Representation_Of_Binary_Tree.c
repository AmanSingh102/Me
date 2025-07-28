#include <stdio.h>
#define SIZE 100

char tree[SIZE];  // Global tree array

// Function to set a root node
void setRoot(char key) {
    tree[0] = key;
}

// Function to set left child
void setLeft(int parent, char key) {
    int left = 2 * parent + 1;
    tree[left] = key;
}

// Function to set right child
void setRight(int parent, char key) {
    int right = 2 * parent + 2;
    tree[right] = key;
}

// Function to print tree
void printTree() {
    for (int i = 0; i < SIZE; i++) {
        if (tree[i] != '\0')
            printf("Node at index %d: %c\n", i, tree[i]);
    }
}

int main() {
    setRoot('A');
    setLeft(0, 'B');
    setRight(0, 'C');
    setLeft(1, 'D');
    setRight(1, 'E');
    setRight(2, 'F');

    printTree();
    return 0;
}

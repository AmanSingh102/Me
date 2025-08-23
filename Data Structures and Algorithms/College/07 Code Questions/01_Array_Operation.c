// WAP in c language to insert, update, and delete an element from the array of 10 elements.
#include <stdio.h>
#define SIZE 10   // Maximum size of the array

// Function to display array elements
void display(int arr[], int n) 
{
    printf("\n--------------------------------\n\n");
    printf("Array elements : ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
    printf("\n--------------------------------\n");
}

// Function to insert an element at a given position
int insert(int arr[], int n, int pos, int value) {
    if (n >= SIZE) {  // Check if array is already full
        printf("Array is full, cannot insert!\n");
        return n;
    }
    if (pos < 0 || pos > n) {  // Check for valid position
        printf("Invalid position!\n");
        return n;
    }

    // Shift elements to the right to make space
    for (int i = n; i > pos; i--) {
        arr[i] = arr[i - 1];
    }

    arr[pos] = value;  // Insert new value
    n++;               // Increase size of array
    printf("Element inserted successfully.\n");

    return n;  // Return updated size
}

// Function to update an element at a given position
void update(int arr[], int n, int pos, int value) {
    if (pos < 0 || pos >= n) {  // Check for valid position
        printf("Invalid position!\n");
        return;
    }

    arr[pos] = value;  // Update value
    printf("Element updated successfully.\n");
}

// Function to delete an element at a given position
int delete(int arr[], int n, int pos) {
    if (n <= 0) {  // If array is empty
        printf("Array is empty, cannot delete!\n");
        return n;
    }
    if (pos < 0 || pos >= n) {  // Check for valid position
        printf("Invalid position!\n");
        return n;
    }

    // Shift elements left to overwrite deleted element
    for (int i = pos; i < n - 1; i++) {
        arr[i] = arr[i + 1];
    }

    n--;  // Decrease size of array
    printf("Element deleted successfully.\n");

    return n;  // Return updated size
}

// Main function
int main() {
    int arr[SIZE], n, choice, pos, value;

    // Taking initial array size and elements from user
    printf("\n------------------------------------------\n\n");
    printf("Enter number of elements (max 10): ");
    scanf("%d", &n);
    
    if (n > SIZE) {
        printf("Limit exceeded!\n");
        return 0;
    }
    
    printf("\nEnter the elements ----------\n");
    for (int i = 0; i < n; i++) 
    {
        printf("Enter %d elements : ", i);
        scanf("%d", &arr[i]);
    }
    
    // Menu-driven program
    while (1) {
        printf("\n---- Menu ----\n");
        printf("1. Insert\n2. Update\n3. Delete\n4. Display\n5. Exit\n");
        printf("--------------\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        
        switch (choice) 
        {
            case 1:
            printf("\n---- Insert Operation ----\n\n");
            printf("Enter position (0-%d) : ",n);
            scanf("%d", &pos);
            printf("Enter value : ");
            scanf("%d", &value);
            n = insert(arr, n, pos, value);  // update n
            printf("\n--------------------------\n");
            break;
            
            case 2:
            printf("\n---- Update Operation ----\n\n");     
            printf("Enter position (0-%d) : ",n);
            scanf("%d", &pos);
            printf("Enter value : ");
            scanf("%d", &value);
            update(arr, n, pos, value);
            printf("\n--------------------------\n");     
            break;
            
            case 3:
            printf("\n---- Delete Operation ----\n\n");
            printf("Enter position (0-%d) to delete: ", n - 1);
            scanf("%d", &pos);
            n = delete(arr, n, pos);  // update n
            printf("\n--------------------------\n");
            break;
            
            case 4:
            display(arr, n);
            break;
            
            case 5:
            printf("Exiting program.........\n");
            printf("\n------------------------------------------\n\n");
            return 0;  // Exit program
            
            default:
            printf("Invalid choice!\n");
        }
    }
}

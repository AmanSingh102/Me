#include<stdio.h>

// Traversal
void display(int arr[], int n)
{
    printf("\nElements : ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ",arr[i]);       
    }
    printf("\n\n"); 
}

// Deletion
void indexDeletion( int arr[], int use_size, int index)
{   
    for (int i = index; i < use_size - 1; i++)
    {
        arr[i] = arr[i+1];
    }
}


int main()
{
    int arr[100] =  {7, 8, 12, 27, 88};
    int use_size = 5;
    int element_to_be_inserted = 45, index = 0;  
    
    display(arr,use_size);
    
    indexDeletion(arr, use_size, index);
    use_size -= 1;
    
    display(arr,use_size);

    return 0;
}
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

// Insertion
int indexInsertion( int arr[], int use_size, int element_to_be_inserted, int capacity, int index)
{   
    if( use_size >= capacity )
    {
        return -1;
    }
    for (int i = use_size-1; i >= index; i--)
    {
        arr[i+1] = arr[i];
    }
    arr[index] = element_to_be_inserted;
    return 1;
}


int main()
{
    int arr[100] =  {7, 8, 12, 27, 88};
    int use_size = 5;
    int element_to_be_inserted = 45, index = 3;  
    
    display(arr,use_size);
    
    indexInsertion(arr, use_size, element_to_be_inserted, 100, index);
    use_size += 1;
    
    display(arr,use_size);

    return 0;
}
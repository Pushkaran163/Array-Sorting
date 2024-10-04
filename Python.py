def Sorting(arr, n):
    for i in range(n-1):
        swapped=False
        
        for j in range(n-i-1):
            if(arr[j] > arr[j+1]):
                arr[j],arr[j+1] = arr[j+1],arr[j]
                swapped = True;
        if(not swapped):
            break;
        

if __name__ == "__main__":
    arr = [1, 3, 5, 4, 2]
    n = len(arr)
    
    print("Given array")
    print(arr)
    Sorting(arr, n)
    print("Sorted Array")
    print(arr)
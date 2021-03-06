public class BinaryIterativeSearch implements Practice03Search
{
    public String searchName()
    {
        return "binary iterative search";
    }
    public int search(int [] arr, int target)
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
    
            // Check if x is present at mid 
            if (arr[m] == target) 
                return m; 
    
            // If x greater, ignore left half 
            if (arr[m] < target) 
                l = m + 1; 
    
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
    
        // if we reach here, then element was 
        // not present 
        return -1; 
    } 
}
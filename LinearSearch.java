public class LinearSearch implements Practice03Search
{
    public String searchName()
    {
        return "linear search";
    }

    // linear search looks for target. It returns the index if present
    // if target is not present, it returns -1
    public int search(int [] arr, int target)
    {
        int n = arr.length;

        for (int i = 0; i < n; i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
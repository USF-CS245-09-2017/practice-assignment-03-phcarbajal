public class BinaryRecursiveSearch implements Practice03Search
{

    public int l;
    public int r;
    public int mid = l + (r - 1) / 2;


    public String searchName()
    {
        return "binary recursive search";
    }
    public int search(int [] arr, int target)
    {
        if (r >= 1)
        {
            //int mid = l + (r - 1) / 2;

            if(arr[mid] == target)
            {
                mid--;
                return mid;
            }

            if(arr[mid] > target)
            {
                r = mid - 1;
                return search(arr, target);
            }

            if(arr[mid] < target)
            {
                l = mid + 1;
                return search(arr, target);
            }
        }

        return -1;
    }
}

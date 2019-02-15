public class BinaryRecursiveSearch implements Practice03Search
{
    int start = 0;
    int end;
    int middle = (start + end)/2;

    public String searchName()
    {
        return "binary recursive search";
    }
    public int search(int [] arr, int target)
    {
        end = arr.length;
		
		if(target < start){
			 return -1;
		} 
		
		
		if (target < arr[middle]){
            middle -= 1;
			return search(arr, target);
		}
		
		if (target > arr[middle]){
            middle += 1;
			return search(arr, target);
		}
		
		if (target == arr[middle]){
			return middle;
		}
		
		return -1;
	}
}
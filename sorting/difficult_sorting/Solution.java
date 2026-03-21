import java.util.*;
public class Solution{
    public void merge(int[] arr, int low, int mid, int high){
        //* Create a temporary array */
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        //* Merge both the sorted parts */
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right])
                temp.add(arr[left++]);
            else 
                temp.add(arr[right++]);
        }

        //? Add remaining elements [left]
        while(left<=mid){
            temp.add(arr[left++]);
        }
        //? Add remaining elements [right]
        while(right<=high){
            temp.add(arr[right++]);
        }

        //todo: copy back to original array 
        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
    }
    public void mergesort(int[] arr, int low, int high){
        if(low >= high)
            //* base condition */
            return;
        int mid = (low+high)/2;
        //* let's sort the left half */
        mergesort(arr, low, mid);
        //* Let's sort the right half */
        mergesort(arr, mid+1, high);
        //* Merge both the halves */
        merge(arr, low, mid, high);

    }
    public static void main(String[] args){
        //? Driver code
        int[] arr = {5,2,8,4,1};
        Solution sol = new Solution();
        sol.mergesort(arr, 0, arr.length-1);
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
}
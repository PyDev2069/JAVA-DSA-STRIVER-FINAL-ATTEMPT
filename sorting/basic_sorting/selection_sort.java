public class selection_sort{
    public static void main(String [] args){
        int[] arr = {13,46,24,52,20,9};
        for(int i=0; i<=arr.length-2; i++ ){
            int mini = i;
            for(int j=i; j<=arr.length-1; j++){
                //*find the minimum */
                if(arr[j] < arr[mini]){
                    mini=j;
                }
            }
            //* now swap the minimum with position i */
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;            
        }
        //*print the array */
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
//todo : O(n^2) time complexity, best case , avg and worst case
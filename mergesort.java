package DSA;
public class mergesort{
    public static void divide(int arr[],int start,int end){
        if(start<end){
            
            int mid=start+ (end-start)/2;
            divide(arr,start,mid);
            divide(arr,mid+1,end);

            //merging the two sorted array
            merge(arr,start,mid,end);
        }
        else{
            return;
        }
    }
    public static void merge(int arr[],int start,int mid,int end){
        int n1=mid-start+1;
        int n2=end-mid;

        int left[]=new int[n1];
        int right[]=new int[n2];

        //storing the integers in array
       for(int i=0;i<n1;i++){
        left[i]=arr[start+i];
       }
       for(int i=0;i<n2;i++){
        right[i]=arr[mid+1+i];
       }

       int i=0,j=0;
       int k=start;

       //sorting the two arrays
       while(i<n1 && j<n2){
        if(left[i]<right[j]){
            arr[k]=left[i];
            i++;
        }
        else{
            arr[k]=right[j];
            j++;
        }
        k++;
       }
       while(i<n1){
        arr[k]=left[i];
        i++;
        k++;
       }
       while(j<n2){
        arr[k]=right[j];
        j++;
        k++;
       }
    }
    public static void main(String args[]){
        int arr[]={9,4,7,5,44,2};
        divide(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
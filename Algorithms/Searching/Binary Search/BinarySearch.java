public class BinarySearch{
public static void main(String[] args){
    int[] arr={1,2,4,6,8}
    int left=0;
    int target=6;
    boolean isFound=false;
    int right=arr.length-1;
    while(left<=right){
        int mid =left+(right-left)/2;
        if(target == arr[mid]){
        System.out.println("WE FOUND IT AT"+mid);
        boolean isFound=true;
        break;
    }
    if(target > arr[mid]){
        left=mid+1;
    }
    else{
        right=mid-1;

    }

    }
        if(!isFound)
    {

        System.out.println("THE ARRAY DOESN'T HAVE THAT ELEMENT");
    }

}
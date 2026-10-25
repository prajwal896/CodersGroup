public class pairsum {

    static int[] pairSum(int arr[], int target) {
        int i=0;
        int j=arr.length-1;
        while(i<j) {
            if(arr[i]+arr[j]==target) {
                System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                return new int[]{arr[i], arr[j]};
            } else if(arr[i]+arr[j]<target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int arr[] = {40, 90, 120, 190, 260, 310, 370, 450};
        pairSum(arr, 500);
    }
}
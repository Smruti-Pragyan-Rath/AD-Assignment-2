public class q1 {
    //objective- given an array of integers find the minimum and maximum elements

    public static void main(String [] args){
        int [] arr= {2, 6, 3, 1, 9};
        int max= arr[0];
        int min= arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max)max=arr[i];
            else if(arr[i]<min)min=arr[i];

        }

        System.out.println("The maximum element is "+ max);//9
        System.out.println("The minimum element is "+ min);//1

    }
}

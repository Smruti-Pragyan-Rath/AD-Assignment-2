public class q3_optimal {
    //objective- given an array of 0's 1's and 2's arrange the array in such a way that the 0's come to the first the 1s come next followed by 2s
    public static void main(String [] args){
        int [] a= {0, 0, 1, 2, 1 , 2 , 0 , 0};
        int count1=0;
        int count2=0;
        int count3=0;
        for(int i=0; i<a.length;i++){
            if(a[i]==0)count1++;
            else if(a[i]==1)count2++;
            else if(a[i]==2)count3++;
        }
        // Create a result array to store the sorted values
        int[] res = new int[a.length];
        int index = 0;

        // Fill the result array with 0's, 1's, and then 2's
        // Fill 0's
        for (int i = 0; i < count1; i++) {
            res[index++] = 0;
        }

        // Fill 1's
        for (int i = 0; i < count2; i++) {
            res[index++] = 1;
        }

        // Fill 2's
        for (int i = 0; i < count3; i++) {
            res[index++] = 2;
        }

        // Print the sorted array
        System.out.println("Sorted array: ");
        for (int num : res) {
            System.out.print(num + " ");//0 0 0 0 1 1 2 2

        }

    }

}

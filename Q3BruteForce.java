public class q3_bruteforce {
    //objective- given an array of 0's 1's and 2's arrange the array in such a way that the 0's come to the first the 1s come next followed by 2s

    public static void main(String [] args){
        int [] a= { 0, 1, 2, 1 , 1, 0 , 0};

        int[]res=new int[a.length];
        int index=0;
        for(int i=0; i<a.length; i++){
            if(a[i]==0){
                res[index]=a[i];
                index++;
            }
        }

        for(int i=0; i<a.length; i++){
            if(a[i]==1){
                res[index]=a[i];
                index++;
            }
        }

        for(int i=0; i<a.length; i++){
            if(a[i]==2){
                res[index]=a[i];
                index++;
            }
        }

        for(int i=0; i<a.length; i++){
            System.out.print(res[i]+" ");//0 0 0 1 1 1 2
        }
    }
}

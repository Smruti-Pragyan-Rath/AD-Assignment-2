public class q2 {
    //Objective- Pairwise arrange the greatest and smallest element in a sorted array

    public static void main(String [] args){
        int []a= {1, 2, 3, 4, 5, 6, 7, 8};
        int [] sorted= new int[a.length];

        int left=0;
        int right= a.length-1;

        for(int i=0; i<a.length; i++){
            if(i%2==0){
                sorted[i]=a[right];
                right--;

            }

            else if(i%2!=0){
                sorted[i]=a[left];
                left++;
            }
        }

        for(int i=0; i<a.length; i++){
            System.out.print(sorted[i]+" "); // 8 1 7 2 6 3 5 4
        }
    }


}

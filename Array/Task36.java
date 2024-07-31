public class Task36 {
    public static void main(String[] args){
        int arr[]={1, -2, 0, 5, -1, -4};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int j2 = j+1; j2 < arr.length; j2++) {
                    if(arr[i]+arr[j]+arr[j2]==2){
                        System.out.println(arr[i]+","+arr[j]+","+arr[j2]);
                    }    
                }
            }
        }
    }
}

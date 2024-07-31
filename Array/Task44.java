public class Task44 {
    public static void main(String[] args){
        int arr[]={3,2,5,4,5,9};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int j2 = j+1; j2 < arr.length; j2++) {
                    if((arr[i]+arr[j])>=arr[j2]){
                        System.out.println(arr[i]+","+arr[j]+","+arr[j2]);
                    }
                }
            }
        }
    }
}


public class Task39 {
    public static void main(String[] args){
        int arr[]={1, -2, 0, 5, -1, -4};
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    flag=true;
                }else{
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                System.out.println("LEADERS: "+arr[i]);
            }
        }
    }
}
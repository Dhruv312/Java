import java.util.Arrays;
public class Task34 {
    public static void main(String[] args){
        int arr[]={49, 1, 3, 200, 2, 4, 70, 5};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int count =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(count==arr[i]){
                count++;
            }
        }
        System.out.println(count-1);
        for(int i=0;i<count-1;i++){
            System.out.println(arr[i]);
        }
    }
}

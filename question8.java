import java.util.ArrayList;

public class question8 {
    public static int rowWithMax1s(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int cnt_max =0;
        int index = -1;

        for(int i =0;i<n;i++){
            int cnt_ones = 0;
        for(int j=0;j<n;j++){
            cnt_ones+=matrix.get(i).get(j);
        } 
        if(cnt_ones>cnt_max){
           cnt_ones=cnt_max; 
           index=i;
        }   
        }
        return index;
}
}

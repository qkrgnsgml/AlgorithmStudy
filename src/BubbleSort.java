import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSort {

    public static ArrayList<Integer> sort(ArrayList<Integer> dataList){
        for(int i=0; i<dataList.size()-1;i++){
            boolean swap = false;

            for(int j=0; j<dataList.size()-1;j++){
                if(dataList.get(j)>dataList.get(j+1)){
                    Collections.swap(dataList,j,j+1);
                    swap=true;
                }
            }
            if(swap==false){
                break;

            }
        }
        return dataList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(1);
        ArrayList<Integer> sort = BubbleSort.sort(list);
        System.out.println(sort);
    }
}

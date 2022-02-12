import java.util.ArrayList;
import java.util.List;

public class BinarySearch2 {
    public static boolean searchFunc(ArrayList<Integer> dataList, Integer searchItem){
        if(dataList.size()==0){
            return false;
        }
        if(dataList.size()==1 && searchItem==dataList.get(0)){
            return true;
        }
        if(dataList.size()==1){
            return false;
        }

        int mid = dataList.size()/2;

        if(searchItem==dataList.get(mid)){
            return true;
        }else if (searchItem<dataList.get(mid)){
            ArrayList<Integer> newList = new ArrayList<>(dataList.subList(0,mid));
            return searchFunc(newList,searchItem);
        }else{
            ArrayList<Integer> newList = new ArrayList<>(dataList.subList(mid, dataList.size()));
            return searchFunc(newList,searchItem);
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(searchFunc(list,11));
    }
}
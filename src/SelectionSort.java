import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        int lowest;
        for (int stand = 0; stand < dataList.size() - 1; stand++) {
            lowest = stand;
            for (int index = stand + 1; index < dataList.size(); index++) {
                if (dataList.get(lowest) > dataList.get(index)) {
                    lowest = index;
                }
            }
            Collections.swap(dataList, lowest, stand);
        }
        return dataList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(1);
        System.out.println(sort(list));
    }
}
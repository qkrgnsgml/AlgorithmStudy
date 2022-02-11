import java.util.ArrayList;

public class MergeSort {
    public ArrayList<Integer> mergeFunc(ArrayList<Integer> leftList, ArrayList<Integer> rightList) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        int leftPoint = 0;
        int rightPoint = 0;

        while (leftList.size() > leftPoint && rightList.size() > rightPoint) {
            if (leftList.get(leftPoint) > rightList.get(rightPoint)) {
                mergedList.add(rightList.get(rightPoint));
                rightPoint += 1;
            } else {
                mergedList.add(leftList.get(leftPoint));
                leftPoint += 1;
            }
        }

        while (leftList.size() > leftPoint) {
            mergedList.add(leftList.get(leftPoint));
            leftPoint += 1;
        }

        while (rightList.size() > rightPoint) {
            mergedList.add(rightList.get(rightPoint));
            rightPoint += 1;
        }

        return mergedList;
    }

    public ArrayList<Integer> mergeSplitFunc(ArrayList<Integer> dataList){
        if(dataList.size()<=1){
            return dataList;
        }
        int medium = dataList.size() / 2;

        ArrayList<Integer> leftArr = this.mergeSplitFunc(new ArrayList<>(dataList.subList(0, medium)));
        ArrayList<Integer> rightArr = this.mergeSplitFunc(new ArrayList<>(dataList.subList(medium, dataList.size())));

        return this.mergeFunc(leftArr, rightArr);
    }



    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int index = 0; index < 100; index++) {
            testData.add((int)(Math.random() * 100));
        }
        MergeSort mSort = new MergeSort();
        System.out.println(mSort.mergeSplitFunc(testData));


    }
}
//    ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(4,1,2,3,5,3));
//    int a = arr.size()/2;
//
//    List<Integer> integers = arr.subList(0, a);
//    List<Integer> integers1 = arr.subList(a, arr.size());
//
//        System.out.println(integers);
//                System.out.println(integers1);
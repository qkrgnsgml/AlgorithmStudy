import java.util.ArrayList;

public class Factorial2 {
    public int factorialSum(ArrayList<Integer> list){
        if(list.size()<=0){
            return 0;
        }else{
            return list.get(0) + factorialSum(new ArrayList<Integer>(list.subList(1,list.size())));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList();
        for (int data = 0; data < 10; data++) {
            testData.add(data);
        }
        Factorial2 f = new Factorial2();
        System.out.println(f.factorialSum(testData));
    }
}

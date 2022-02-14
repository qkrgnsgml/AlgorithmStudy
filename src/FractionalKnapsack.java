import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

    public static void knapsackFunc(Integer[][] List, double capacity){
        double totalValue = 0.0;
        double fraction = 0.0;
        System.out.println("배낭 용량"+capacity);
        Arrays.sort(List, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return (o2[1]/o2[0])-(o1[1]/o1[0]); //무개당 가치
            }
        });

        for (int i=0; i<List.length;i++){
            if ((capacity - (double) List[i][0] > 0)) { //배낭에 해당 물건이 다들어갈수 있다 쪼개기x
                capacity-=(double) List[i][0]; //가치가 가장 높은걸 배낭에서 빼줌
                totalValue +=(double) List[i][1]; //해당 물건 가치 더해줌
                System.out.println("무게:" + List[i][0] + ", 가치:" + List[i][1]);
            }else {
                fraction = capacity/(double) List[i][0]; //쪼개서 넣음
                totalValue +=(double) List[i][1]*fraction; //쪼갠양의 가치
                System.out.println("무게:" + List[i][0] + ", 가치:" + List[i][1] + ", 비율:" + fraction);
                break;
            }
        }
        System.out.println("총 가치"+totalValue);
    }

    public static void main(String[] args) {
        Integer[][] List = {{10,10},{15,12},{20,10},{25,8},{30,5}};
        knapsackFunc(List,49.0);
    }

}

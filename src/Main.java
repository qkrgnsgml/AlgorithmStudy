import java.util.Scanner;


//Exception in thread "main" java.lang.ArithmeticException: / by zero: 분모가 0일때 오류발생
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        double count = 0;
        double average = 0;
        double E;
        double lengthCount;
        String endKey;
        System.out.println("Do you play the game?");
        endKey = scan.nextLine();

        if (endKey.equals("stop")) {
            System.out.println("Program END");
            System.exit(0);
        }


        if (endKey.equals("yes")) {
            System.out.println("How many count do you want?");
            lengthCount=scan.nextInt();

            System.out.println("Enter your number to calculate average");

            while (count<lengthCount) {
                E = scan.nextInt();
                if (E < 0) {
                    lengthCount--;
                    continue;
                    //여기까진 들어감
                }
                sum+=E;
                count+=1;


                /*
                if(endKey.equals("stop")){
                이렇게 적으면 if안에서 숫자 숫자 숫자 숫자 stop 엔터 를 적으면 stop적은걸 읽는게아니라 엔터를 읽어버려서 if문 안 메소드를 무시해버린다.

                    System.out.println("Program End");

                    //count-1이유는 4개를 입력하면 count가 4여야하는데 실제론 1로 선언된 count때문에 5로 간주되므로
                    average = sum / (count-1);
                    System.out.println("result: "+ average);
                    break;

                }
                */

            }
            //대체 else를 왜 안건드는거지?


            System.out.println("sum1 : " + sum);
            System.out.println("count1: "+(count));

            System.out.println("result1: "+sum/(count));



        }
    }
}
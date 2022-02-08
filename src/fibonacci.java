public class fibonacci {
    public static int fibonacciFunc(int i){
        if (i==0){
            return 0;
        }else if(i==1){
            return 1;
        }else{
            return fibonacciFunc(i-1)+fibonacciFunc(i-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacciFunc(10));
    }
}

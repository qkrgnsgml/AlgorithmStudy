public class Factorial3 {
    public int sum(int x){
        if(x==1){
            return 1;
        }else if(x==2){
            return 2;
        } else if (x == 3) {
            return 4;
        }
        return sum(x-1)+sum(x-2)+sum(x-3);
    }

    public static void main(String[] args) {
        Factorial3 f = new Factorial3();
        System.out.println( f.sum(5));
    }
}

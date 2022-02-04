import java.util.ArrayList;
import java.util.Arrays;

public class MyStack<T> {
    ArrayList<T> ar = new ArrayList<>();

    public void push(T t){
        ar.add(t);
    }

    public T pop(){
        if(ar.isEmpty()){
            return null;
        }
        return ar.remove(ar.size()-1);
    }

    public boolean isEmpty(){
        return ar.isEmpty();
    }

    public static void main(String[] args) {
        MyStack<Integer> mq = new MyStack<>();
        mq.push(1);
        System.out.println(mq);
        System.out.println(mq.isEmpty());
        System.out.println(mq.pop());
        System.out.println(mq);
    }
}

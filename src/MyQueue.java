import java.util.ArrayList;
import java.util.Arrays;

public class MyQueue<T> {
    ArrayList<T> ar = new ArrayList<>();

    public void Enqueue(T t){
        ar.add(t);
    }

    public T dequeue(){
        if(ar.isEmpty()){
            return null;
        }
        return ar.remove(0);
    }

    public boolean isEmpty(){
        return ar.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue<Integer> mq = new MyQueue<>();
        mq.Enqueue(1);
        System.out.println(mq.isEmpty());
        System.out.println(mq.dequeue());
        System.out.println(mq);
    }
}

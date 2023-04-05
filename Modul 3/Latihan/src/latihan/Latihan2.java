package latihan;

import java.util.LinkedList;
import java.util.Queue;

public class Latihan2 {

    public void queueExample(){
        Queue q = new LinkedList();
        
        q.add("Java");
        q.add("DotNet");
        q.offer("PHP");
        q.offer("HTML");
        
        System.out.println("remove : " + q.remove());
        System.out.println("element : " + q.element());
        System.out.println("poll : " + q.poll());
        System.out.println("peek : " + q.peek());
    }
    public static void main(String[] args) {
        new Latihan2().queueExample();
    }
}

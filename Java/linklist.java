package Java;
import java.util.LinkedList;
public class linklist{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
    }
}
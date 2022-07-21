import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

public class CopyOnWriteSet {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4,3,52));
        for(int item:list) {
            System.out.println(item + " ");
            list.add(9);
        }
        System.out.println(list);
        System.out.println("list size : "+list.size());
    }

}

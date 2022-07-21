import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Object 1");
        myList.add("Object 2");
        myList.add("Object 3");

       Iterator<String> iterator = myList.iterator();
        while(iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("next str = "+next);
        }
        for(String str: myList){
            System.out.println(str);
        }
    }
}

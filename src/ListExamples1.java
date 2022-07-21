import java.util.*;
import java.util.stream.Stream;

public class ListExamples1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet();
        Set<Integer> set1 =new TreeSet();
//
//        System.out.println(set.add("Hello"));
//        System.out.println(set.add("Hello"));

        Set<String> set2 = Set.of("World","Hello","1","2","5","7");
        Set<String> set3 = new TreeSet<>();
                set3.add("World1");
                set3.add("World2");
                set3.add("World22");
                set3.add("World4");
                set3.add("Worfasdld");
                set3.add("Woradfld");
                set3.add("Wor4ld");

                set3.addAll(Set.of("World","Hello","1","2","5","7"));

                List<String> list = new ArrayList<>();
                list.addAll(set3);

        Iterator<String> iterator =  set2.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        Iterator<String> iterator3 = set3.iterator();
        while(iterator3.hasNext()){
            String next = iterator3.next();
            System.out.println(next);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++\n");
        for(String element:set3) {
            System.out.println(element);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++\n");

        Stream<String> stream = set3.stream();
        stream.forEach((element) -> {
            System.out.println(element);
        });
    }
}

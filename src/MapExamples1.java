import java.util.HashMap;
import java.util.Map;

public class MapExamples1 {
    public static void main(String[] args) {

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("123","234abc");

        Map<String, Customer> customerMap = new HashMap<>();
        customerMap.put("123",new Customer("123","John Doe"));

      Map<String, Integer> map = new HashMap<>();
      map.put("Str", Integer.valueOf(123));
      map.put("abc",123);


    }
}

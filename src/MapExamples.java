import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args) {

        Map<String, Customer> map = new HashMap<>();
        Customer customer1 =
                new Customer("123", "Diana Anderson");
        Customer customer2 =
                new Customer("234", "John Anderson");

        map.put(customer1.getCustomerid(), customer1);
        map.put(customer2.getCustomerid(), customer2);

        Order order = new Order("123","someStuff");
        Order order1 = new Order("234","moreStuffff");
        Customer customerForOrder =
                map.get(order.getCustomerid());
        System.out.println(customerForOrder+" : "+order.getOrderNum());
        Customer customerForOrder1 =
                map.get(order1.getCustomerid());
        System.out.println(customerForOrder1+" : "+order1.getOrderNum() );
        System.out.println(map);
        System.out.println(order.getCount()+" "+order.count);
    }
}

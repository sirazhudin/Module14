import java.time.temporal.ChronoUnit;
import java.util.stream.Stream;

public class Customer {
    String customerid;
    String name;
    public Customer() {}
    public Customer(String customerid, String name){
        this.customerid=customerid;
        this.name=name;
    }
//    public int getCustomerid() {
//        return this.customerid;
//    }
    public String getCustomerid(){
        return this.customerid;
    }
    @Override
    public String toString() {
        return "{" + this.customerid
                +" : " +this.name+'}';
    }



}

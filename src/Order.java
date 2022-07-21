public class Order extends Customer{
    String customerid, itemOrdered;
    int orderNum,count;
    public Order(String customerid, String itemOrdered){
        super.customerid = customerid;
        this.itemOrdered = itemOrdered;setCount();
        this.orderNum=count;
    }
    public int getOrderNum() {
        return this.orderNum;
    }
    private void setCount() {
        count++;
    }
    public int getCount(){
        return count;
    }


}

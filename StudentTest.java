import java.util.Scanner;

class Product {
    private String item;
    private String name;
   private double price;
    private int qty;

    Product() {
        item = "";
        name = "";
        price = 0;
        qty = 0;
    }

    Product(String item, String name, double price, int qty) {
        setItem(item);
        setName(name);
        setPrice(price);
        setQty(qty);
    }
    public void setItem(String item) {
        this.item = item;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public String getItem() {
        return item;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }
    public double totalPrice() {
        return price*qty;
    }
    public String toString() {
        return "Item: " + item + "\nName: " + name + "\nPrice: " + price + "\nQty: " + qty + "\nTotal Price: " + totalPrice();
    }
}
class Customer extends Product{
    private int custId;
    private String custName;
    private String custAddress;
    private long custPhone;

    Customer() {
        super();
        custId = 0;
        custName = "";
        custAddress = "";
        custPhone = 0;
    }
    Customer(String item, String name, double price, int qty, int custId, String custName, String custAddress, long custPhone) {
        super(item, name, price, qty);
        setCustId(custId);
        setCustName(custName);
        setCustAddress(custAddress);
        setCustPhone(custPhone);
    }
    public void setCustId(int custId) {
        this.custId = custId;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }
    public void setCustPhone(long custPhone) {
        this.custPhone = custPhone;
    }
    public int getCustId() {
        return custId;
    }
    public String getCustName() {
        return custName;
    }
    public String getCustAddress() {
        return custAddress;
    }
    public long getCustPhone() {
        return custPhone;
    }
}
public class StudentTest {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        System.out.println("Enter the item");
        Scanner item = new Scanner(System.in);
        c1.setItem(item.nextLine());
        System.out.println("Enter the name");
        Scanner name = new Scanner(System.in);
        c1.setName(name.nextLine());
        System.out.println("Enter the price");
        Scanner price = new Scanner(System.in);
        c1.setPrice(price.nextDouble());
        System.out.println("Enter the qty");
        Scanner qty = new Scanner(System.in);
        c1.setQty(qty.nextInt());
        System.out.println("Enter the custId");
        Scanner custId = new Scanner(System.in);
        c1.setCustId(custId.nextInt());
        System.out.println("Enter the custName");
        Scanner custName = new Scanner(System.in);
        c1.setCustName(custName.nextLine());
        System.out.println("Enter the custAddress");
        Scanner custAddress = new Scanner(System.in);
        c1.setCustAddress(custAddress.nextLine());
        System.out.println("Enter the custPhone");
        Scanner custPhone = new Scanner(System.in);
        c1.setCustPhone(custPhone.nextInt());
        System.out.println(c1.toString());
    }
}

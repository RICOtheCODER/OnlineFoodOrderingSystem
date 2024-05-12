package FoodApp.model;

public class Customer {
    static int cust_id=1;
    String name;
    String location;
    String phoneNo;

    public Customer( int cust_id,String name, String location, String  phoneNo) {
        this.cust_id=cust_id;
        this.name = name;
        this.location = location;
        this.phoneNo = phoneNo;
        cust_id++;
    }

    public static int getCust_id() {
        return cust_id;
    }

    public static void setCust_id(int cust_id) {
        Customer.cust_id = cust_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}

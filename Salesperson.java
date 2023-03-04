public class Salesperson {
    private Name name;
    private Address address;
    private Sales sales[];
    private int currnumsale;

    //constructor
    public Salesperson(int maxnum) {
        sales = new Sales[maxnum];
        currnumsale = 0;
    }

    // setters & getters

    public void setName(Name name) {
        this.name = name;
    }
    public Name getName(){
        return name;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Address getAddress(){
        return address;
    }

    public Sales getSales(int i) {
        return sales[i];
    }
    public int getMaxSales() {
        return sales.length;
    }

    public void addSales(Sales sale) {
        if (currnumsale == sales.length)
            return;
        this.sales[currnumsale] = sale;
        currnumsale++;
    }
    public float calcPerformance() {
        float sale = 0.0f;
        for (int i=0; i<currnumsale; i++) {
            sale += sales[i].getamount();
        }
        return sale;
    }
}

package without_payment;

public class XProducts {
    private int id;
    private String name;
    static int count = 1;

    private String group;
    private int price;

    public XProducts(String name, String group, int price) {
        this.id = count;
        this.name = name;
        this.group = group;
        this.price = price;
        count++;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setGroup(String group) {
        this.group = group;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getPrice() {
        return price;
    }
}

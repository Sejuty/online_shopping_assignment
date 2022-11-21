package without_payment;

import java.util.ArrayList;

public class XAdmin {

    private int adminId;
    private int a_id = 1;
    private String name;
    public ArrayList<XProducts> adminProductList = new ArrayList<XProducts>();

    public XAdmin(String name) {
        this.adminId = a_id;
        this.name = name;
        a_id++;
    }


    public ArrayList<XProducts> AdminCart() {

        System.out.println("view cart");
        for (XProducts p : adminProductList) {
            System.out.println(p.getName()+" "+p.getGroup()+" "+p.getPrice());
        }
        return adminProductList;
    }
    public void addProduct(String name, String group, int price) {
        XProducts product = new XProducts(name, group, price);
        adminProductList.add(product);
    }

    public void deleteProduct(int id) {
       adminProductList.remove(id);
    }

    public void modifyProduct(int id, String name, String group, int price) {
    XProducts product = adminProductList.get(id);
    product.setName(name);
    product.setGroup(group);
    product.setPrice(price);

    }
}

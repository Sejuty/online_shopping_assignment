package with_payment;

import java.util.ArrayList;

public class Admin {

    private int adminId;
    private int a_id = 1;
    private String name;
    public ArrayList<Products> adminProductList = new ArrayList<Products>();

    public Admin(String name) {
        this.adminId = a_id;
        this.name = name;
        a_id++;
    }


    public ArrayList<Products> AdminCart() {

        System.out.println("view cart");
        for (Products p : adminProductList) {
            System.out.println(p.getName()+" "+p.getGroup()+" "+p.getPrice());
        }
        return adminProductList;
    }
    public void addProduct(String name, String group, int price) {
        Products product = new Products(name, group, price);
        adminProductList.add(product);
    }

    public void deleteProduct(int id) {
       adminProductList.remove(id);
    }

    public void modifyProduct(int id, String name, String group, int price) {
    Products product = adminProductList.get(id);
    product.setName(name);
    product.setGroup(group);
    product.setPrice(price);

    }
}

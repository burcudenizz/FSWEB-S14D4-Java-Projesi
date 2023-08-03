import com.workintech.product.Bread;
import com.workintech.product.Chocolate;
import com.workintech.product.Coke;
import com.workintech.product.ProductForSale;

public class Store {
    public static void main(String[] args) {
        //[null,null,null....] 12 tane null olan bir array oluştu.
ProductForSale[] products = new ProductForSale[12];
products[0] = new Chocolate("sweets",30,"sugar free chocolate","milka");
products[1] = new Bread("bakery",12,"fresh bread","white");
products[2] = new Coke("drinks",15,"cold coke",2);
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        if(products != null){
            for (ProductForSale product : products) {
                if (product != null) {
                    product.showDetails();
                    product.getPrice();
                    System.out.println("price with sale:" + product.getSalesPrice(5));

                }
            }
        }
    }
}
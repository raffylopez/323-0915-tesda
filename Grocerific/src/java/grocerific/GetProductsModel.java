/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grocerific;

import java.util.ArrayList;

/**
 *
 * @author ActiveLearning
 */
public class GetProductsModel {
    public ArrayList<Product> getProducts(){
        ArrayList<Product> products = new ArrayList<Product>();
        Product product1 = new Product("BVG 123", "Coke Can", "12oz", 14.00f); 
        Product product2 = new Product("MLK 456", "Eskimo Milk", "200mL", 50.00f); 
        Product product3 = new Product("ICE 789", "Chocolate Ice Cream", "1pint", 78.00f); 
        products.add(product1);
        products.add(product2);
        products.add(product3);
        
        return products;
    }
    // unit-test class here
    public static void main(String[] args) {
        GetProductsModel model = new GetProductsModel();
        ArrayList<Product> products = model.getProducts();
        for(Product p:products){
            System.out.println(p.id);
            System.out.println(p.description);
            System.out.println(p.size);
            System.out.println(p.price);
        }
    }
}

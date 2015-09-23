/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grocerific;

/**
 *
 * @author ActiveLearning
 */
public class GetProductByIdModel {
    public Product getProductById(int id){
        Product product = new Product();
        
        if (id == 1){
            product.setId(1);
            product.setDescription("Milk");
            product.setSize("1 liter");
            product.setPrice(75.00f);
        } else if (id == 2) {
            // ...
        } else if (id == 3) {
            
        } else { // id not found, return null
            
        }
        return product;
    }
    
}

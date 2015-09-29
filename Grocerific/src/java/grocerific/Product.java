/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grocerific;

/**
 *
 * @author ActiveLearning
 */
public class Product {
    String id;
    String description;
    String size;
    float price;

    // no-arg public constructor
    public Product(){
        
    }

    public Product(String id, String description, String size, float price) {
        this.id = id;
        this.description = description;
        this.size = size;
        this.price = price;
    }
    


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
}

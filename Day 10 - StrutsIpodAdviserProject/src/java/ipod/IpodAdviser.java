/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ipod;

import java.util.ArrayList;

/**
 *
 * @author ActiveLearning
 */
public class IpodAdviser {
    public ArrayList<String> getProducts(String priority){
        ArrayList<String> products = new ArrayList<String>();
        if (priority.equals("size")){
            products.add("Ipod Shuffle");
            products.add("Ipod Nano");
        } else if (priority.equals("price")){
            products.add("Ipod Shuffle");
        } else {
            products.add("Ipod Video");
        }
        return products;
        
    }
    
    public static void main(String[] args) {
        // testing our model class
        IpodAdviser ipodAdviser = new IpodAdviser();
        ArrayList<String> products = ipodAdviser.getProducts("size");
        System.out.println(products);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ActiveLearning
 */
public class Counter {
    int countAsAttribute = 1;
    public static void main(String[] args) {
        int count = 123;
        System.out.println(new Counter());
    }

    @Override
    public String toString() {
        countAsAttribute++;
        return "Counter{" + "count=" + countAsAttribute + '}';
    }
    
   
}

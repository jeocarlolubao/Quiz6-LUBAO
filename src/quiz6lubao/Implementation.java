/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz6lubao;
import java.lang.String;
/**
 *
 * @author Jeo
 */
public class Implementation {
    public static void main(String[] args) {
        LinkedPositionalList<String> list = new LinkedPositionalList<>();
        Position p1 = list.addFirst("Maria Ressa");
        Position p2 = list.addFirst("Naruto Uzumaki"); // to be in front
        Position p3 = list.addFirst("Madara Uchiha");
        Position p4 = list.addFirst("Kim Chiu");
        
        System.out.println("list before adding p2 to the front");
        list.showPositionList();
        
        System.out.println("\nlist if we implement moveToFront(p4) despite p4 being in the front of the list");
        list.moveToFront(p4);
        list.showPositionList();
        
        
        System.out.println("\nlist after adding p2 to the front");
        list.moveToFront(p2);
        
        list.showPositionList();
        
        
    }
}

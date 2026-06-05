
package com.mycompany.oop;

/**
 *
 * @author gushi
 */
public class Person {
    private String name;
    private String lastName;
    
    public Person(){}
    
    public Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }
    
    public void showPersonData(){
        System.out.println("Name: " + this.name);
        System.out.println("Last name: " + this.lastName);
    }
    
    public static void main(String[] args) {
        System.out.println("Creation of class person and person object");
        var object1 = new Person("Gustavo", "Perez");
        object1.showPersonData();
        
        var object2 = new Person("Leslie", "Rivera");
        object2.showPersonData();
        
        
    }
    
}

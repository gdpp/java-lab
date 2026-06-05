/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animals;

/**
 *
 * @author gushi
 */
public class Animal {
    protected void eat(){
        System.out.println("Eating...");
    }
    
    protected void sleep(){
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("Wooof...");
    }
}

class AnimalTest {
    public static void main(String[] args) {
        var animal1 = new Animal();
        animal1.eat();
        animal1.sleep();
    }
}
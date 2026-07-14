class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}
class Mammal extends Animala{
    public void breathe() {
        System.out.println("This mammal breathes air.");
    }
}

class Dog extends Mammal{
    public void bark(){
        System.out.println("The dog barks.");
    }
}

public class Animals{
    public static void main(String[] args) {
        Dog myDog = new Dog();b
        
        myDog.eat();     
        myDog.breathe(); 
        myDog.bark();    
    }
}
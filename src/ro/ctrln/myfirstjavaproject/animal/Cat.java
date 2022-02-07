package ro.ctrln.myfirstjavaproject.animal;

import ro.ctrln.myfirstjavaproject.animal.Animal;

public class Cat extends Animal {
    public void sleep(){
        System.out.println("Goes to sleep");
    }

    @Override
    public void makeSound() {
        System.out.println("miau");
    }
}

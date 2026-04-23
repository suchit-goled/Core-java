//in hierarchial the parent class has two subclass here cat and dog class have same parent class Animal
// dynamic polymorphism 
class Cat extends Animal {
	
    @Override
    void sound() {   
        System.out.println("Cat makes sound differently");
    }

	
    void meow() {
        System.out.println("Cat meows");
    }
}
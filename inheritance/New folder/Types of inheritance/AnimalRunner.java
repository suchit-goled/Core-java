class AnimalRunner {
    public static void main(String[] args) {
        Animal animal = new Dog(); 
		
		//instanceof
		 if (animal instanceof Dog) {  
		 //casting
            Dog dog = (Dog) animal;    
            dog.bark();                
        }
		//dynamic polymorphism 
		animal.sound();
		
		//static polymorphism
		Cat cat= new Cat();
		cat.meow();
		
	
    }
}
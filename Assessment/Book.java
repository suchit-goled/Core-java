// what do you mean by default values and write a programm to print default values of all datatypes 


// default values are the values which are assigned by the new keyword for primitive it is a 0 and non primitive it is a null

class Book{

		int price;
		String brand;
		double weight;
		float height;
		long serialNumber;
		short pages;
		byte linesPerPage;
		char grade;
		
		public Book(){
			
			System.out.println("executing default datatype values in book");
			
		}
		
		
}



class BookRunner{
	
	  Book price1 =	new book(){
	  System.out.println("the price of the book is:"+Book.price1);
	  }
	  
	
}


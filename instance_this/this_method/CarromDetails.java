package instance_this.this_method;

import instance_this.this_method.class_invoking.Carrom;

class CarromDetails {
	
	CarromDetails(){
		System.out.println("executing carrom details in carromdetails");
	}
	
    void details(Carrom carrom) {
		
        if (carrom != null) {
            carrom.info();
        } else {
            System.out.println("Carrom is null");
        }
    }
}
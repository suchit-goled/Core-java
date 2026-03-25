class PresidentRunner{
	public static void main(String[] values){
		
		String[] countries = {
		"india","USA","france","russia","china","brazil","south africa","mexico","argentina","turkey",
		"Indonesia","South Korea","Japan","Philippines","Bangladesh","Sri Lanka","Nepal","Pakistan","Iran","Israel",
		"Germany","Italy","Ukraine","Poland","Portugal","Greece","Romania","Hungary","Finland","Austria",
		"Egypt","Nigeria","Kenya","Ghana","Ethiopia","Uganda","Tanzania","Rwanda","Zimbabwe","Algeria",
		"Canada","Chile","Colombia","Peru","Venezuela","Bolivia","Paraguay","Uruguay","Ecuador","Cuba",
		"Kazakhstan","Uzbekistan","Azerbaijan","Belarus","Armenia","Georgia","Afghanistan","Maldives","Seychelles","Mauritius",
		"Iraq","Syria","Lebanon","Yemen","Sudan","Somalia","Zambia","Malawi","Namibia","Botswana",
		"Senegal","Ivory Coast","Cameroon","Morocco","Saudi Arabia"
		};
		for(String name:countries){
			String[] presidents=President.countryName(name);
			
			if(presidents!=null){
				System.out.println("name of the country:"+name);
				int size=presidents.length;
				System.out.println("number of presidents:"+size);
				
				for(String ref:presidents){
					System.out.println("president name of the country "+ name + " is :"+ref);
					
				}
			}
		}
			
	}


}
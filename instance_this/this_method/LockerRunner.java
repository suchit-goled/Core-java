class LockerRunner{
	
	
	public static void main(String[] values){
		
		Locker lockerProperties1=new Locker("Godrej", "Steel", "Grey", 50, 20000,true, 3, true, "Digital", 80.5);
		lockerProperties1.properties();
		
		Locker lockerProperties2=new Locker("Samsung", "Alloy", "Black", 70, 35000,true, 5, true, "Biometric", 95.0);
		lockerProperties2.properties();
		
		Locker lockerProperties3=new Locker("LocalBrand", "Iron", "Brown", 30, 12000,false, 2, false, "Key Lock", 60.0);
		lockerProperties3.properties();
	}
}
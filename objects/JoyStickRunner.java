class JoyStickRunner{

	public static void main(String[] values){
		
		JoyStick joyStick1=new JoyStick();
		System.out.println("type:"+joyStick1.type);
		joyStick1.type="Wireless";
		System.out.println("updated type:"+joyStick1.type);
		System.out.println("");
		
		JoyStick joyStick2=new JoyStick();
		System.out.println("brand:"+joyStick2.brand);
		joyStick2.brand="Sony";
		System.out.println("updated brand:"+joyStick2.brand);
		System.out.println("");
		
		JoyStick joyStick3=new JoyStick();
		System.out.println("price:"+joyStick3.price);
		joyStick3.price=3000;
		System.out.println("updated price:"+joyStick3.price);
		System.out.println("");
		
		JoyStick joyStick4=new JoyStick();
		System.out.println("wireless:"+joyStick4.wireless);
		joyStick4.wireless=true;
		System.out.println("updated wireless:"+joyStick4.wireless);
		System.out.println("");
		
		JoyStick joyStick5=new JoyStick();
		System.out.println("buttons:"+joyStick5.buttons);
		joyStick5.buttons=12;
		System.out.println("updated buttons:"+joyStick5.buttons);
	}
}
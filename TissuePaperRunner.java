class TissuePaperRunner{
	public static void main(String[] args){
		double price=TissuePaper.getPriceByThickness("ultra thin");
		System.out.println("price of the tissue with the thickness:"+price);
		price=TissuePaper.getPriceByThickness("very thin");
		System.out.println("price of the tissue with the thickness:"+price);
		price=TissuePaper.getPriceByThickness("thin");
		System.out.println("price of the tissue with the thickness:"+price);
		price=TissuePaper.getPriceByThickness("light");
		System.out.println("price of the tissue with the thickness:"+price);
		price=TissuePaper.getPriceByThickness("medium");
		System.out.println("price of the tissue with the thickness:"+price);
		price=TissuePaper.getPriceByThickness("semi thick");
		System.out.println("price of the tissue with the thickness:"+price);
		price=TissuePaper.getPriceByThickness("thick");
		System.out.println("price of the tissue with the thickness:"+price);
		price=TissuePaper.getPriceByThickness("very thick");
		System.out.println("price of the tissue with the thickness:"+price);
		price=TissuePaper.getPriceByThickness("extra thick");
		System.out.println("price of the tissue with the thickness:"+price);
		price=TissuePaper.getPriceByThickness("paper thick");
		System.out.println("price of the tissue with the thickness:"+price);
		price=TissuePaper.getPriceByThickness("premium thick");
		System.out.println("price of the tissue with the thickness:"+price);
		
	}
}
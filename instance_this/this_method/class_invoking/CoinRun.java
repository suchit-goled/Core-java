class CoinRun{
	
	
	CoinRun(){
		
		System.out.println("executing coin run in coin run");
	}
	
	void show(Coin coin){
		
		if (coin != null) {
            coin.info();
        } else {
            System.out.println("it is not a coin");
        }
	}
}
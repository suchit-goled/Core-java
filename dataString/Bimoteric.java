class Bimoteric{
	
	String[] logins= new String[4];
	int index=0;
	
	
	void loginDetails(String login){
		
		System.out.println("logining user usnig bimetric");
		if(login!=null){
			System.out.println("name of the user:"+login);
			if(this.index<this.logins.length){
			this.logins[this.index]=login;
			System.out.println("name of the user is stored at the index:"+this.index);
			this.index++;
			}
			else{
				System.out.println("more users cannot login");
			}
			
			
		}
		else{
			System.out.println("name is null");
		}
		
	}
	
	void SearchUser(String name){
		
		System.out.println("Searching for the user in the login details");{
			
			if(name!=null){
				
				System.out.println("searching for the user name:"+name);
				boolean found=false;
				for(String temp:this.logins){
					
					if(name==temp){
						System.out.println("user found at index "+this.index);
						found=true;
						break;
					}
					
					}
				if(!found){
						System.out.println("user not found");
				}
				
				}
				else{
					System.out.println("user name is null");
				
			}
		}
	}
	
	
}
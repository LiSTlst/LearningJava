public class Customer{
	String name,address,telephone;
	String getName(){
		return name;
	}
	void setName(String customerName){
		this.name=customerName; 
	}
	String getAddress(){
		return address;
	}
	void setAddress(String customerAddress){
		this.address=customerAddress;
	}
	String getTelephone(){
		return telephone;
	}
	void setTelephone(String customerTelephone){
		this.telephone=customerTelephone;
	}


	public static void main(String args[]){
		Customer Customer1 = new Customer();
		Customer1.setName("List");
		Customer1.setAddress("YunYuan");
		Customer1.setTelephone("18130623199");
		System.out.println("This customer's name is " + Customer1.getName());
		System.out.println("This customer's address is " + Customer1.getAddress());
		System.out.println("This customer's telephone is " + Customer1.getTelephone());
	}
}
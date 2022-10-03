package Question3;

public class Encapsulation {

	private int ID;  
	private String name;  
	private float fee;  
	
	public int get_ID() {  
	    return ID;  
	}  
	public void get_fee(int acc_no) {  
	    this.ID = acc_no;  
	}  
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}  
	  
	 
	public float getAmount() {  
	    return fee;  
	}  
	public void setAmount(float amount) {  
	    this.fee = amount;  
	}  
	  
	}  


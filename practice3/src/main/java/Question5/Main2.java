package Question5;

public interface Main2 {

	public default void show()   
	{  
	System.out.println("b class ");  
	} 
	
	default void merge() {
		System.out.println("i am merge");
	}
}

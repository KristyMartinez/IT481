public class CustomerU6 {

	int NumberOfItems;
	
	
	public CustomerU6() {
		NumberOfItems = 6;
	} 
	
	
	
	public CustomerU6(int items) {
		
		int ClothingItems = items;
		
		if(ClothingItems == 0) {
		
			NumberOfItems = GetRandomNumber(20);
		} else {
			
			NumberOfItems = ClothingItems; 
		}
		
	} 
	
	
	
	public static int GetRandomNumber(int maxValue) {
		int x = 1 + (int)(Math.random()) * maxValue;
		return x;
	} 
	
	
	
	
	public int getNumberOfItems() {
		return NumberOfItems;
	}
	
	
} 

import java.util.Scanner;

public class ScenarioU6
{
	static int items;
	static int controlItemNumber;
	static int numberOfItems;
	static int totalRooms;
	static int numberOfCustomers;
	
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many ClothingItems?");
		controlItemNumber = in.nextInt();
		
		System.out.print("How many customers?");
		numberOfCustomers = in.nextInt();
		
		System.out.print("How many dressing rooms do you need?");
		totalRooms = in.nextInt();
		
		in.close();
		
		DressroomU6 dr = new DressroomU6(totalRooms);
		
		for(int i=0; i<numberOfCustomers; i++)
		{
			
			CustomerU6 cust = new CustomerU6(controlItemNumber);
			
			numberOfItems = cust.getNumberOfItems();
			
			items += numberOfItems;
			
			dr.RequestRoom(numberOfItems);
			
		}
		
		
		
		try
		{
			Thread.sleep(2000);
		}
		
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		
		int averageItemsPerCustomer = items/numberOfCustomers;
		
		System.out.println("Average number of items was: " + averageItemsPerCustomer);
		
		System.out.println("Average Run time in nanoseconds " + dr.getRunTime()/numberOfCustomers);
		
		System.out.println("Average Wait time in nanoseconds " + dr.getWaitTime()/numberOfCustomers);
		
		System.out.println("Total customer is " + numberOfCustomers);
				
	}
	

}
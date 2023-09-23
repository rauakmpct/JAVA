@FunctionalInterface
interface Car
{ 
	void drive();
}
public class Lamda {
	public static void main(String args[]){
		Car obj=()->System.out.println("Driving...");

		obj.drive();
	}
} 
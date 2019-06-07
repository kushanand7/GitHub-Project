public class DoesThisWork
{
	public DoesThisWork(){
		MyInterface q = (x, y) -> {
			return x/y;
		};
		float number = q.quotient(10f,3f);
		int temp = (int)(number*1000);
		number=temp/1000f;
		System.out.printf("" + number);
	}
	public static void main(String kushandarjun[]){
		DoesThisWork app = new DoesThisWork();
	}
}
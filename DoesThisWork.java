public class DoesThisWork
{
	public DoesThisWork(){
		AndWeQuote innerface = (x, y) -> {
			return x/y;
		};
		System.out.printf("" + innerface.quotient(5f, 2f));
	}
	public static void main(String kushandarjun[]){
		DoesThisWork app = new DoesThisWork();
	}
}
public class ThisIsATest
{
	public ThisIsATest(){
		AndWeQuote innerface = (x, y) -> {
			return x/y;
		};
		System.out.printf("" + innerface.quotient(5f, 2f));
	}
	public static void main(String kushandarjun[]){
		ThisIsATest app = new ThisIsATest();
	}
}
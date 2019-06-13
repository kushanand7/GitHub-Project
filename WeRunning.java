public class WeRunning
{
	public WeRunning(){
		MyInterface q = (x, y) -> {
			return x/y;
		};
		float number = q.quotient(10f,3f);
		int temp = (int)(number*1000);
		number=temp/1000f;
		System.out.printf("" + number);
		Perfect_Sqaure t =(x)->{
			boolean s = false;
			if (Math.sqrt(x)%1 == 0){
				s = true;
			}
		return s;};
		boolean z = t.method(49);
		System.out.println(z);

	}
	public static void main(String args[])
	{
		WeRunning app = new WeRunning();
	}
}
//i learned how to use lambda notation and how it can work with interfaces. I also learned how to use the command prompt - kush
// i learned the difference between git kraken and git hub and before starting this assignment i was not familiar with git kraken at all. I learned how to use lambda notation in my code and this assignment was good review for interface construction and implementation. -arjun

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
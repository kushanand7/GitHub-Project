public class runnerB {

	public runnerB(){
		Perfect_Sqaure q =(x)->{
			boolean s = false;
			if (Math.sqrt(x)%1 == 0){
				s = true;
			}
		return s;};
		boolean z = q.method(49);
		System.out.println(z);

		}


		public static void main(String []args){

			runnerB app = new runnerB();

			}

}
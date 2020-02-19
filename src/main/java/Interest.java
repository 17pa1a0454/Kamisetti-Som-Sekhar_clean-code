
public class Interest {
	public void SimpleAndCompoundInterest(int principle,int rate,int time) {
		int i;
	float si=0,ci=0;
	 si=principle+(principle*rate*time)/100;
	 for(i=0;i<time;i++)
		 principle+=(principle*rate)/100;
	 ci=principle;
	 System.out.printf("Simple Interest = %.2f Compound Interest = %.2f\n", si,ci);
}
}
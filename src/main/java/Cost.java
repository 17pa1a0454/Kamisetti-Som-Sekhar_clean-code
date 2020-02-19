
public class Cost {
   public void MaterialCost(int cost,int area) {
	   if(cost==1)
		   System.out.printf("Material Cost = %dINR",1200*area);
	   else if(cost==2)
		   System.out.printf("Material Cost = %dINR",1500*area);
	   else if(cost==3)
		   System.out.printf("Material Cost = %dINR",1800*area);
	   else
		   System.out.printf("Material Cost = %dINR",2000*area);
	 
   }
}


public class FenceProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Wooden fencing costs $25 per foot
		Chain-link fencing costs $15 per foot
		Gates cost $150 each. You must install at least one gate and can install up to 3
		A building permit is required. It costs $50.00.
		The tax rate is 6.0% but it doesn't apply to the building permit */
		
		int woodenfencing=25;
		//int chainlinkfencing=15;
		int gates=150;
		int l=10;
		int w=10;
		int p=2*(l+w);
		double fencecost;
		
		double	fpermit=50.00;
		double taxrate=0.06;
		
		fencecost=(woodenfencing*p+gates)+(woodenfencing*p+gates)*taxrate+fpermit;
		
		System.out.println(fencecost);

	}

}

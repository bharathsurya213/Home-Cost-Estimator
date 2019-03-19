package testing;

import org.junit.Test;
import org.junit.runner.RunWith;

import testing.HomeCostEstimator.Demo;

import static org.junit.Assert.assertEquals;
@SuppressWarnings("unused")
public class HomeCostEstimator {
    
	@Test
	public void testEstimator()//This Method is to test if the CostEstimator method is working or not
	{
		Demo testing=new Demo();
		assertEquals("Answer",144000,testing.costEstimator("standard",120));//this checks the cost for standard building materials
		assertEquals("Answer",195000,testing.costEstimator("above_standard",130));//this checks the cost for above standard building materials
		assertEquals("Answer",252000,testing.costEstimator("high_standard",140));//this checks the cost for high standard building materials
		assertEquals("Answer",375000,testing.costEstimator("high_standard_and_fully_automated",150));//this checks the cost for standard building materials and fully automated house
	}
	
	class Demo{
		
		public int costEstimator(String level,int area)//this method estimates the cost for building materials
        {
			int ans=0;
			if(level.equals("standard"))//if the materials are standard
			{
				ans=1200*area;
			}
			if(level.equals("above_standard")) //if the materials are above standard
			{
				ans=1500*area;
			}
			if(level.equals("high_standard")) ////if the materials are high standard
			{
				ans=1800*area;
			}
			if(level.equals("high_standard_and_fully_automated")) //if the materials are high standard and fully automated
			{
				ans=2500*area;
			}
			return ans;
			
		}
		
    	
    }
}

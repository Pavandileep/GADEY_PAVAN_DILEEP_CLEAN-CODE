package ConstructionCost;

public class AboveStandardMaterial extends Materials
{
	public float totalConstructionCost(float area_of_house) 
	{
		float total_cost=0;
		float cost_per_square_feet=1500;
		
		total_cost=area_of_house*cost_per_square_feet;
		
		return total_cost;
	}	
}

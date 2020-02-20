package house_construction;

public class calculate_cost {
	void calculate(String materialType, int area) {
		{
	material_type mt=new material_type();
	int k=mt.material(materialType);
	int p= k*area;
	System.out.println("Total cost for House Construction : Rs"+p);
	}
	
}
}

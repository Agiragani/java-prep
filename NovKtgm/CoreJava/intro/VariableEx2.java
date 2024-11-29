package intro;

public class VariableEx2 {
	
	static String nationality = "Indian";
	
	int aadhar;
	
	public String display() {
		
		 return ("Nationality :- " +nationality + "            Aadhar :- "+aadhar );
	}
	
	public static void main(String[] args) {
		
		VariableEx2 ramesh = new VariableEx2();
		
		VariableEx2 suresh = new VariableEx2();
		
		VariableEx2 mahesh = new VariableEx2();
		
		ramesh.aadhar = 100;suresh.aadhar =102;mahesh.aadhar =103;
		
		System.out.println("Ramesh "+ramesh.display());
		
		System.out.println("Suresh "+suresh.display());
		
		System.out.println("Mahesh "+mahesh.display());
		
	}

}

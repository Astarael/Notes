import java.util.ArrayList;
import java.util.Arrays;


public class progNote extends Note {
	
	private static ArrayList<String> prognotelist = (ArrayList<String>) Arrays.asList("Task", "Owner", "Due");

	public progNote () {
		
		addFields(prognotelist);
		
	}
	
	
}

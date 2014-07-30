import java.util.ArrayList;


public abstract class Note {
	
	private static ArrayList<String> fields = null;
	private static boolean completed = false;
	
	public static void addFields (ArrayList<String> a) {
		
		if (fields == null) {
			
			fields = new ArrayList<String>();
			
		}
		fields.addAll(a);
		
	}
	
	public static ArrayList<String> getFields () {
		
		return fields;
		
	}
	
	public static void replaceFields (ArrayList<String> a) {
		
		fields.clear();
		fields.addAll(a);
		
	}
	
	public static void complete () {
		
		completed = true;
		
	}
	
	public static void uncomplete () {
		
		completed = false;
		
	}
	

}

import java.util.ArrayList;


public abstract class Note {
	
	static ArrayList<String> fields = null;
	
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
	
	

}

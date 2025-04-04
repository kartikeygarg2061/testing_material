package utilities2;

import java.util.HashMap;
import java.util.Map;

public class testcontext {
	
	private Map<String, Object> current_context;
	
	public testcontext() {
		current_context = new HashMap<>();
	}
	
	public void set(String key, Object value) {
		current_context.put(key, value);
	}
	
	public Object get(String key) {
		return current_context.get(key);
	}
}

package additionalquestions;

import java.util.HashMap;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("abc", 50);
		hm.put("efg", 70);
		Question6 app = new Question6();
		HashMap<String, String> result = new HashMap<>();
		result = app.start(hm);
		System.out.println(result);
	}
	
	public HashMap<String, String> start(HashMap<String, Integer> hm){
		HashMap<String, String> result = new HashMap<>();
		for(String k : hm.keySet()) {
			int value = hm.get(k);
			if(value<60) {
				result.put(k, "fail");
			}
			else {
				result.put(k, "pass");
			}
		}
		return result;
	}
}

package additionalquestions;
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question1 app = new Question1();
		String array[] = {"goa", "kerela", "gujrat"};
		HashMap<String, String> hm = new HashMap<>();
		hm = app.start(array);
	}
	public HashMap<String, String> start(String[] array){
		HashMap<String, String> hm = new HashMap<>();
		for(int i=0;i<array.length;i++) {
			String key = (array[i].substring(0, 3)).toUpperCase();
			hm.put(key, array[i]);
		}
		return hm;
	}

}

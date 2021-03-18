package additionalquestions;

import java.util.*;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("arun#12#12#12");
		al.add("deepak#13#12#12");
		Question12 app = new Question12();
		System.out.println(app.start(al));
	}

	public String start(ArrayList<String> al) {
		String maxMarStud = "";
		int maxMarks = 0;
		for (int i = 0; i < al.size(); i++) {
			String temp = al.get(i);
			StringTokenizer st = new StringTokenizer(temp, "#");
			String name = st.nextToken();
			int currTotal = 0;
			while (st.hasMoreTokens()) {
				currTotal += Integer.parseInt(st.nextToken());
			}
			if (currTotal > maxMarks) {
				maxMarks = currTotal;
				maxMarStud = name;
			}
		}
		return maxMarStud;
	}
}

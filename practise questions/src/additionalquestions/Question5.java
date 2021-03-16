package additionalquestions;

public class Question5 {
	public static void main(String args[]) {
		Question5 app = new Question5();
		System.out.println(app.run("Hello*World"));
	}

	public boolean run(String string) {
		char charArray[] = string.toCharArray();
		int count = 0;
		for (char element : charArray) {
			if (element == '*') {
				count++;
			}
		}
		if (count > 0) {
			String arr[] = string.split("\\*");
			if (arr[0].equalsIgnoreCase(arr[1])) {
				return true;
			}
		}
		return false;
	}
}
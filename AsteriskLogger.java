package week5CodingProject;

public class AsteriskLogger implements Logger{

	@Override
	public void Log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void Error(String error) {
		String outerbox = "";
		for (int i = 0; i <= error.length() + 12; i++) {
			outerbox+= "*";
		}
		String innerbox = "";
		for (int i = 0; i <= error.length() + 12; i++) {
			innerbox+= " ";
		}
		System.out.println(outerbox);
		System.out.println(innerbox);
		System.out.println("***Error: " + error + "***");
		System.out.println(innerbox);
		System.out.println(outerbox);
		
	}

}

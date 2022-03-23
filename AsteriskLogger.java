package week5CodingProject;

public class AsteriskLogger implements Logger{

	@Override
	public void Log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void Error(String error) {
		String box = ""; //the outer box of asterisks. +12 is so the length is exactly encapsulates the user input for error.
		for (int i = 0; i <= error.length() + 12; i++) {
			box+= "*";
		}
		System.out.println(box);
		System.out.println("***Error: " + error + "***");
		System.out.println(box);
		
	}

}

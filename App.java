package week5CodingProject;

public class App {
	
	public static void main(String[] args) {
		
		Logger firstLogger = new AsteriskLogger();
		
		firstLogger.Log("Interfaces are confusing");
		firstLogger.Error("Interfaces are confusing");
		
		
		Logger secondLogger = new SpacedLogger();
		
		secondLogger.Log("I am confusion");
		secondLogger.Error("I am confusion");
		
	}

}

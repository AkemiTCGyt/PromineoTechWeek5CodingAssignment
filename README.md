# PromineoTechWeek5CodingAssignment

# Coded by Thomas Le

## Synopsis
This project demonstrates basic understandings of itnerfaces. The interfact I will be utilizing is called logger and the functionality of the classes are shown below.

### App.java
Contains the main method to run loggers. The firstLogger is specifically to show the AsteriskLogger and the secondLogger is specifically to show the SpacedLogger.

### AsteriskLogger.java
Implements logger and overrides the methods, Log and Error.
- public void Log(String log) takes in a String and encapsulates it in asterisks.
- public void Error(String error) takes in a String and encapsulates it in a box of asterisks.

### SpacedLogger.java
Implements logger and overrides the methods, Log and Error.
- public void Log(String log) takes in a String and adds a space in between each character in the String.
- public void Error(String error) takes in a String and prints out "ERROR: " plus the string with a space in between each character in the string.

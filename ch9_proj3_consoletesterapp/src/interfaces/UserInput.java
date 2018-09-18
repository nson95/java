package interfaces;

public interface UserInput {
	int getInt(String prompt);
	int getInt(String prompt, 
			int min, int max);
	double getDouble(String prompt);
	double getDouble(String prompt,
			int min, int max);
	String getString(String prompt);
	String getString(String prompt,
			int min, int max);
}

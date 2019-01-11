package config;

public class Constants {

	//Base URL strings
	public static final String baseURL = System.getProperty("user.dir") + "\\TestWebpage\\index.html";
	
	//Several paths used within the code
	public static final String path_testData = System.getProperty("user.dir") + "\\src\\dataEngine\\DataEngine.xlsx";
	public static final String file_testData = "DataEngine.xlsx";
	public static final String path_chromeDriver = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
	
	//column numbers for different fields
	public static final int col_testcaseID = 0;
	public static final int col_testStepID = 1;
	public static final int col_ActionKeyword = 3;
	
	//Test sheet name
	public static final String sheet_testSteps = "TestSteps";
	
}
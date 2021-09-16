package testNgScripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeMethod   // execution of login method before every test method
	public void login()
	{
		System.out.println("Enter Username");
		System.out.println("Enter Passwrd");
		System.out.println("clcik on signin");
	}
	
	
	@Test
	public void createEmail()
	{
		System.out.println("clcik on Compose button");
		System.out.println("Write email");
		System.out.println("Send email");
	}
	
	@Test
	public void modifyEmail()
	{
	System.out.println("clcik on Compose button");
	System.out.println("Write email");
	System.out.println("Send email");
}
	
	@Test
	public void DeleteEmail()
	{
	System.out.println("clcik on Compose button");
	System.out.println("Write email");
	System.out.println("Send email");
}
	
	
	
	
}

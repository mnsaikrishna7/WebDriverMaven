package jenkintest;

import org.testng.annotations.Test;

public class JenkinsTest {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JenkinsTest j = new JenkinsTest();
		j.browser("chrome");
	

	}*/
	@Test
	public  void browser(String bName){
		
		if(bName.equals("chrome")){
			System.out.println("Chrome browser is running");
		}
		else
		{
			System.out.println("IE browser is running");
		}
	}

}

package utilities;

import org.testng.annotations.DataProvider;

public class DataInvalidMail {

	@DataProvider(name= "Invalid mail Credential")
	public Object[][] getData(){
    return new Object [][] {
 
    	{"helena83p@yahoo"},
        {"lakshmi@.com"},
        {"lakshyahoo.com"},
        {"@yahoo.com"},
        {"helena83p@yahoo@.com"},
       
     
        };
	}
		
	
     
    	 
        
	
		}
	










	













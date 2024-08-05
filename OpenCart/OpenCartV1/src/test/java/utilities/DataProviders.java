package utilities;

import org.testng.annotations.DataProvider;

import com.google.common.collect.ObjectArrays;

import net.bytebuddy.asm.Advice.Return;

public class DataProviders {

	
	
	@DataProvider(name="LoginData")
	public Object[][] getData(){
    return new Object [][]{
		{"helena83p@yahoo.com", "Helenica10","Valid"},
        {"lakshmi@yahoo.com", "Laxmi", "Valid"},
        {"laksh@yahoo.com", "Lakshmi", "Valid"},
        {"laks@yahoo.com", "xyz", "Invalid"},
        {"abc123@gmail.com","test@123", "Valid" },
        {" ", "Helenica10", "Invalid"},
        {"helena83p@yahoo.com", " ", "Invalid"},
        {" ", " ", "Invalid"}
        };
	
		
		
		
		}
	








}

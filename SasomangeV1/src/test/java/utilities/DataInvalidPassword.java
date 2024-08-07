package utilities;

import org.testng.annotations.DataProvider;

public class DataInvalidPassword {

	@DataProvider(name = "Invalid_PasswordCredential")
	public Object[][] getData() {
        return new Object[][] {

				{ "12345Aa" }, 
				{ "12345ABC" },
				{ "123456aa" }, 
				{ "ABCDabcd" },

		};

	}
}
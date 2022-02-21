package TestDataReader;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class TestDataReader {

	    public String configFileReader(){
	        try {
	            Properties prop = new Properties();
	            InputStream inputStream = new FileInputStream("/Users/sakshi.rana/eclipse-workspace/AutoAssign/Config/configrations.properties");
	            prop.load(inputStream);
	            return prop.getProperty("url");
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	    }

}

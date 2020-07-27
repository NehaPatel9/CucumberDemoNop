import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp { //Class to get Data from file "TestDataConfig.properties"
    static Properties prop;
    static FileInputStream input; //Variable to store filelocation and file name
    static String fileName = "TestDataConfig.properties"; //Variable to store file name for data collection
    static String fileLocation = "src\\test\\resources\\TestData\\";//Variable to store location for the file name of data cllection

    public String getProperty(String key) {
        prop = new Properties();
        try {
            input = new FileInputStream(fileLocation + fileName);
            prop.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
    @Test(priority = 1)//Method to test functionality of load Property class and get property method
    public void URL(){
        System.out.println(getProperty("URL"));

    }
}

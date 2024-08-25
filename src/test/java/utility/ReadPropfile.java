package utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropfile {

    //public static void main(String[] args) throws IOException {
    public String readvalue(String str) throws IOException {
        FileReader fr = new FileReader("src/test/resources/configFiles/config.properties");

        Properties p = new Properties();
        p.load(fr);
        return p.getProperty(str);
    }
}

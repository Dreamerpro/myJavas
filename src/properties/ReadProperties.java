package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static int main(String[] args) throws IOException{
		FileInputStream f=new FileInputStream("system.properties");
		Properties p=new Properties(System.getProperties());
		p.load(f);
		
		System.out.println(p.get("a"));
		return 0;
	}
}

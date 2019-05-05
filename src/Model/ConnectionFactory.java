package Model;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	private static ConnectionFactory connectionFactory=null;
	private static Driver driver;
	private String driverName;
	private String url;
	private String userName;
	private String password;
	Properties p;
	ConnectionFactory(){
		try{
			FileInputStream fis=new FileInputStream("mydb.properties");
			p=new Properties();
			p.load(fis);
			driverName=p.getProperty("driverName");
			driver=(Driver)Class.forName(driverName).newInstance();
			url=p.getProperty("url");
			userName=p.getProperty("userName");
			password=p.getProperty("password");
			p.put("user", userName);
			p.put("password", password);			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		public static Connection getConnect() throws SQLException{
			if(connectionFactory==null){
				connectionFactory=new ConnectionFactory();
			}
			return driver.connect(connectionFactory.url, connectionFactory.p);
			
		}
	}



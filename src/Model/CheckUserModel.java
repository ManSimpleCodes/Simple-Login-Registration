package Model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class CheckUserModel {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getRole() {
		return role;
	}
	private String role;
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public void setRole(String role){
		this.role = role;
	}
	public String check() throws IOException{
		boolean  b1=true;
		if(getUsername()=="" && getPassword() =="") {
			return "please enter username and password";
		}
		else if(getUsername()==""){
				return "please enter username";
			}
			else if(getPassword()==""){
				return "please enter password";
			}
			else if(getRole()==null){
				return "please select role";
			}
			else if((getUsername().equals("ICSI518") || b1== getNUsername(getUsername())) 
					&& (getPassword().equals("Spring2018")|| b1== getNPassword(getPassword())
					&& (getRole()!=null && b1== getNRole(getUsername(),getPassword(),getRole()))
				)
					){
				if(getRole() !=null){
				 	if(getRole().equals("supplier")){
				 		return "supplier";
				 	}
				 	else if(getRole().equals("consumer")){
				 		return "consumer";
				 	}
				}else return "please select role";
			}
				else if(getRole()==""){
					return "please select role";
					}
				else{
					return "Invalid username and password";
				}
			return "please select role";
		}
	public static boolean getNUsername(String name) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("newuserdetails.txt"));
		 int lineNumber = 0;
           String data = "";
           do {
               data = br.readLine();
               if (data != null) {
                   lineNumber++;
               } // End of the if //
           } while(data != null);
           BufferedReader br1 = new BufferedReader(new FileReader("newuserdetails.txt"));
		for(int i=0;i<lineNumber;i++){
			String s = br1.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
				if(name.equals(st.nextToken())){
					return true;
				}
		}
		return false;
	}
	public static boolean getNPassword(String name) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("newuserdetails.txt"));
		 int lineNumber = 0;
           String data = "";
           do {
               data = br.readLine();
               if (data != null) {
                   lineNumber++;
               } // End of the if //
           } while(data != null);
           BufferedReader br1 = new BufferedReader(new FileReader("newuserdetails.txt"));
		for(int i=0;i<lineNumber;i++){
			String s = br1.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			st.nextToken();
				if(name.equals(st.nextToken())){
					return true;
				}
		}
		return false;
	}
	public static boolean getNRole(String uname,String upassword,String role)
			throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("newuserdetails.txt"));
		 int lineNumber = 0;
           String data = "";
           do {
               data = br.readLine();
               if (data != null) {
                   lineNumber++;
               } // End of the if //
           } while(data != null);
           BufferedReader br1 = new BufferedReader(new FileReader("newuserdetails.txt"));
		for(int i=0;i<lineNumber;i++){
			String s = br1.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			String name = st.nextToken();
			String password = st.nextToken();
				if(name.equals(uname)&& password.equals(upassword)&&role.equals(st.nextToken())){
					return true;
				}
		}
		return false;
	}
}

package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import Model.CheckUserModel;

public class LoginServlet extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		File ff=new File("newuserdetails.txt");//file will be created in eclipse installation folder
		Writer w= 
	new FileWriter(ff,true);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = null;
		out.println("<html>");
		out.println("<body bgcolor='HoneyDew'>");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String role = request.getParameter("radio");
		String olduser = request.getParameter("olduser");
		if(olduser!=null){
		CheckUserModel model = new CheckUserModel();
		model.setUsername(username);
		model.setPassword(password);
		model.setRole(role);
		String result = model.check();
		if(result.equals("please enter username and password")) {
			out.println("<font color=\" #b30000\" size=\"4\">please enter username and password </fornt><br/>");
			rd = request.getRequestDispatcher("./Login.jsp");
			rd.include(request, response);
		}
		else
			if(result.equals("please enter username")){
				out.println("<font color=\" #b30000\" size=\"4\">please enter username</fornt><br/>");
				rd = request.getRequestDispatcher("./Login.jsp");
				rd.include(request, response);
			}
			else if(result.equals("please enter password")){
			out.println("<font color=\" #b30000\" size=\"4\">please enter password</font><br/>");
			rd = request.getRequestDispatcher("./Login.jsp");
			rd.include(request, response);
			}
			else 
				if(result.equals("supplier")){
					out.println("<h2>welcome Supplier ");
					out.println(request.getParameter("username")+"<br/>");
					out.println("Your Login Time Is:"+new java.util.Date()+"</h2>");
				}
				else if(result.equals("consumer")){
					out.println("<h2>welcome Consumer ");
					out.println(request.getParameter("username")+"<br/>");
					out.println("Your Login Time Is:"+new java.util.Date()+"</h2>");
				}
			else if(result.equals("Invalid username and password")){
					out.println("<font color=\" #b30000\" size=\"4\">Invalid username and password</font><br/>");
					rd = request.getRequestDispatcher("./Login.jsp");
					rd.include(request, response);
			}		
			else if(result.equals("please select role")){
				out.println("<font color=\" #b30000\" size=\"4\">please select role</font><br/>");
				rd = request.getRequestDispatcher("./Login.jsp");
				rd.include(request, response);
			}
		out.println("</body>");
		out.println("</html>");
		
		}
		else
			{
			String nrole = request.getParameter("nradio");
			if(nrole!=null){
			String s =null;
			String nfname = request.getParameter("fname");
			String nlname = request.getParameter("lname");
			String nusername = request.getParameter("username");
			String npassword = request.getParameter("password");
			s= nusername+" "+npassword+" "+nrole+" "+nfname+" "+nlname;
			w.write(s+"\n");
			w.flush();
			out.println("<font color=\" #b30000\" size=\"4\">Registration Sucessfull on:</font>"+new java.util.Date()+"<br/>");
			rd = request.getRequestDispatcher("./Login.jsp");
			rd.include(request, response);
			}else{
				out.println("<font color=\" #196619\" size=\"4\">please select role</font>");
				rd = request.getRequestDispatcher("./userreg.html");
				rd.include(request, response);
			}
			}
	
	}
}
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
        <title>Login Page</title>
    </head>
	<body bgcolor='wheat'>
		<form action='./ls'>
		<center> <table border="1" cellpadding="2" cellspacing="2"  height="100">
            <caption><font color="#86592d" size="5">
            			<span style ="font-weight:bold">Welcome to Login Page</span></font>
            </caption>
			<tr>
				<th>Enter Your UserName:</th>
				<td><input type='text' name='username'/></td>
			</tr>
			<tr>
				<th>Enter Your Password:</th>
				<td><input type='password' name='password'/></td>
			</tr>
			<tr>
		<tr>
         <th  align="left">Select Your Role:</th>
         <td> <select name='radio'>
         <option>Select</option>
         <option value='supplier'>Supplier</option>
         <option value='consumer'>Consumer</option>
                 </select> </td>
             </tr>
			
			<tr>
				<th align="center"></th>
				<td align=right><input type='submit' name='olduser' value='submit'/></td>
				<td align=right><input type="reset" value = "Clear"></td>
			</tr>
		  	<tr>
				<td><b><a href='./userreg.jsp' style ='color:#196619'>New User Registration</a></b></td>
			</tr>
		</table>
		</form>
	</body>
</html>
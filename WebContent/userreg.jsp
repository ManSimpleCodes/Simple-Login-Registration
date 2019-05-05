<!DOCTYPE html>
<html>
	<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
	<body bgcolor='#ffd9b3'>
		<form action='./ls'>
		<center> <table border="1" cellpadding="2" cellspacing="2"  height="100">
            <caption><font color='#86592d' size="5">
            			<span style ="font-weight:bold">Welcome to Registration Page</span></font>
            	</caption>
		<tr>
				<th align="left">Enter first Name</th>
				<td><input type='text' name='fname'/></td>
			</tr>
			<tr>
				<th align="left">Enter last Name</th>
				<td><input type='text' name='lname'/></td>
			</tr>
		<tr>
			<th align="left">Enter Your User Name:</th>
			<td> <input type='text' name='username'/></td>
		</tr>
		<tr>
			<th align="left">Enter Your Password:</th>
			<td> <input type='text' name='password'/></td>
		</tr>	
		<tr>
  			<th>Select Your Role:</th>
  		</tr>
		<tr>
  			<th>Supplier</th>
 			 <td><input type='radio' name='nradio' value='supplier'/></td>
		</tr>
		<tr>
  			<th>Consumer</th>
  			<td><input type='radio' name='nradio' value='consumer'/></td>
		</tr>
		<tr>
				<th align="center"></th>
				<td align=right><input type='submit' value='Submit Details' name="newuser"/></td>
				<td align=right><input type="reset" value = "Cancel"></td>
		</tr>
		</table>
		</form>	
	</body>
</html>
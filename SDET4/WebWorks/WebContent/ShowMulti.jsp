<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="MultiplicationForm.html"/>

<%!
	// declaration 
	
	public void jspInit(){
		System.out.println("im from jsp init");
	}
%>
<table  border="3">
	<%
	try{
		int val = Integer.parseInt(request.getParameter("val"));
		
		for(int i=1; i<=10; i++){
%>
			<tr><td>
				<%= val  %> X <%=i  %>  = <%= (val * i) %>
			</td></tr>
<%	
		}
		
	}catch(NumberFormatException nfe){
%>
		<h2 style="color: red;font-family: arial">
			Sorry only numbers</h2>
<%
	}
	%>
	</table>
</body>
</html>
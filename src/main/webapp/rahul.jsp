<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addrahul">
<input type="text" name="rollNo" placeholder="Enter_Rollno"><br>
<input type="text" name="studentName" placeholder="Enter_studentName"><br>
<input type="text" name="deparment" placeholder="Enter_deparment"><br>
<input type="text" name="mobile" placeholder="Enter_mobile"><br>
<input type="text" name="clgName" placeholder="Enter_clgName"><br>
<input type="text" name="universityName" placeholder="Enter_universityName"><br>
<input type="text" name="marks" placeholder="Enter_marks"><br>
<input type="text" name="percentage" placeholder="Enter_percentage"><br>
<input type="text" name="division" placeholder="Enter_division"><br>
<input type="text" name="result" placeholder="Enter_result"><br>
<input type="submit"><br>
</form>
rollNo:${rahul.rollNo}<br>
StudentName:${rahul.studentName}<br>
Deparment:${rahul.deparment}<br>
mobile:${rahul.mobile}<br>
clgName:${rahul.clgName}<br>
universityName:${rahul.universityName}<br>
marks:${rahul.marks}<br>
percentage:${rahul.percentage}<br>
Division:${rahul.division}
${rahul}
<!-- 
result:${rahul.result} 
-->
</body>
</html>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Employees List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Id</th><th>Name</th><th>Email</th><th>Course</th><th>Edit</th><th>Delete</th></tr>
    <c:forEach var="mhs" items="${list}"> 
    <tr>
    <td>${mhs.Student_ID}</td>
    <td>${mhs.Name}</td>
    <td>${mhs.Email}</td>
    <td>${mhs.Course}</td>
    <td><a href="editmhs/${mhs.Student_ID}">Edit</a></td>
    <td><a href="deletemhs/${mhs.Student_ID}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="mhsform">Add New Mahasiswa</a>
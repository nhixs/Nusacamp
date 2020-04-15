    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>List Mahasiswa</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Id</th><th>Name</th><th>Email</th><th>Course</th><th>Edit</th><th>Delete</th></tr>
    <c:forEach var="mhs" items="${list}"> 
    <tr>
    <td>${mhs.id}</td>
    <td>${mhs.name}</td>
    <td>${mhs.email}</td>
    <td>${mhs.course}</td>
    <td><a href="editmhs/${mhs.id}">Edit</a></td>
    <td><a href="deletemhs/${mhs.id}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="mhsform">Add New Mahasiswa</a>
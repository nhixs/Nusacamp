<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>List Book</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Book ID</th><th>Name</th><th>Edition</th><th>Publisher</th><th>Price</th><th>Pages</th><th>BookShelf</th><th>Edit</th><th>Delete</th></tr>
    <c:forEach var="book" items="${list}"> 
    <tr>
    <td>${book.id}</td>
       <td>${book.name}</td>
          <td>${book.edition}</td>
              <td>${book.publisher}</td>
                  <td>${book.price}</td>
                      <td>${book.pages}</td>
                          <td>${book.bookShelf}</td>
    <td><a href="editbook/${book.id}">Edit</a></td>
    <td><a href="deletebook/${book.id}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="bookform">Add New Book</a>
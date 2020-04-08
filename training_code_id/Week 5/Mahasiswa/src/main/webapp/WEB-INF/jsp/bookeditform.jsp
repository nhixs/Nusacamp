<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<h1>Edit Books</h1>
<form:form method="POST" action="/Mahasiswa/editsavebook">
<table>
<tr>
<td></td>
<td><form:hidden path="id"/></td>
</tr>
<tr>
<td>Name : </td>
<td><form:input path="name"/></td>
</tr>
<tr>  
<td>Edition :</td>  
<td><form:input path="edition" /></td>
</tr> 
<tr>  
<td>Publisher :</td>  
<td><form:input path="publisher" /></td>
</tr>
<tr>  
<td>Price :</td>  
<td><form:input path="price" /></td>
</tr>
<tr>  
<td>Pages :</td>  
<td><form:input path="pages" /></td>
</tr>
<tr>  
<td>Bookshelf :</td>  
<td><form:input path="bookShelf" /></td>
</tr>


<tr>  
          <td> </td>  
          <td><input type="submit" value="Edit Save Book" /></td>  
         </tr> 
         </table> 
</form:form>
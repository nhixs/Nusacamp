<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Add New Book</h1>
       <form:form method="post" action="savebook">  
      	<table >  
         <tr>  
          <td>Name : </td> 
          <td><form:input path="name"  /></td>
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
          <td><input type="submit" value="savebook" /></td>  
         </tr>
         
           
        </table>  
       </form:form>  

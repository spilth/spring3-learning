<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Posts</h1>

<p>${message}</p>

<a href="<spring:url value="/posts/new"/>">Create New Post</a>

<table>
<c:forEach var="post" items="${posts}">
    <tr>
        <td><a href="<spring:url value="/posts/${post.id}"/>">${post.title}</a></td>
        <td>
            <form:form method="DELETE" commandName="post" action="${pageContext.request.contextPath}/posts/${post.id}">
                <input type="submit" value="Delete" />
            </form:form>
        </td>
    </tr>
</c:forEach>
</table>

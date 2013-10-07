<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
    <title></title>
</head>
<body>
    <h1>Edit Post</h1>

    <form:form method="PUT" commandName="post" action="${pageContext.request.contextPath}/posts/${post.id}">
        <div>
            <label>Title</label><br/>
            <form:input path="title" size="64"/>
        </div>

        <div>
            <label>Body</label><br/>
            <form:textarea path="body" cols="64" rows="8"/>
        </div>

        <div><input type="submit"></div>

    </form:form>
</body>
</html>
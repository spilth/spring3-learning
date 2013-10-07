<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title></title>
</head>
<body>

    <h1>New Post</h1>

    <form:form method="POST" commandName="post" action="${pageContext.request.contextPath}/posts">
        <div>
            <label>Title</label><br/>
            <form:input type="text" path="title" name="title" size="64"/>
        </div>

        <div>
            <label>Body</label><br/>
            <form:textarea path="body" name="body" cols="64" rows="8"/>
        </div>

        <div><input type="submit"></div>

    </form:form>
</body>
</html>
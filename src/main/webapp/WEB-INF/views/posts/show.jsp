<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title></title>
</head>
<body>
    <h1>Post: ${post.title} </h1>

    <p><a href="<spring:url value='/posts/1/edit'/>">Edit Post</a></p>
</body>
</html>
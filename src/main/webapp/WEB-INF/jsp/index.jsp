<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>View Test Page</title>
</head>
<body>
<form>
    <input type="text" id="title" name="title"/>
    <input type="text" id="content" name="content"/>
    <button type="button" id="submitButton">
        전송
    </button>
</form>

<script type="text/javascript">
    let submitButton = document.getElementById("submitButton");

    submitButton.onclick = function () {
      let title = document.getElementById("title").value;
      let content = document.getElementById("content").value;
      console.log(title);
      console.log(content);
      fetch("/submit", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({
          title,
          content,
        }),
      }).then((response) => console.log(response));
    }
</script>

</body>
</html>

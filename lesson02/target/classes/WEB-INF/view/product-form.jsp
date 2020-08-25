<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta http-equiv="x-ua-compatible" content="ie=edge">
  <title>Products page</title>
  <!-- MDB icon -->
  <link rel="icon" href="${pageContext.request.contextPath}/resources/MDB/img/mdb-favicon.ico" type="image/x-icon">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.11.2/css/all.css">
  <!-- Google Fonts Roboto -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap">
  <!-- Bootstrap core CSS -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/MDB/css/bootstrap.min.css">
  <!-- Material Design Bootstrap -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/MDB/css/mdb.min.css">
  <!-- Your custom styles (optional) -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/MDB/css/style.css">
</head>
<body>

  <!-- Form add product-->
  <div style="height: 100vh">
    <div class="flex-center flex-column">

        <form:form class="text-center border border-light p-5" action="/addProduct" modelAttribute="product">
            <p class="h4 mb-4">Add product</p>
            <!-- Title -->
            <form:input path="title" type="text" id="titleProduct" class="form-control mb-4" placeholder="Title"/>
            <!-- Coast -->
            <form:input path="coast" type="text" id="coastProduct" class="form-control mb-4" placeholder="Coast"/>
            <button class="btn btn-info btn-block" type="submit">Add</button>
        </form:form>

    </div>
  </div>

  <!-- jQuery -->
  <script type="text/javascript" src="${pageContext.request.contextPath}/resources/MDB/js/jquery.min.js"></script>
  <!-- Bootstrap tooltips -->
  <script type="text/javascript" src="${pageContext.request.contextPath}/resources/MDB/js/popper.min.js"></script>
  <!-- Bootstrap core JavaScript -->
  <script type="text/javascript" src="${pageContext.request.contextPath}/resources/MDB/js/bootstrap.min.js"></script>
  <!-- MDB core JavaScript -->
  <script type="text/javascript" src="${pageContext.request.contextPath}/resources/MDB/js/mdb.min.js"></script>
  <!-- Your custom scripts (optional) -->
  <script type="text/javascript"></script>

</body>
</html>

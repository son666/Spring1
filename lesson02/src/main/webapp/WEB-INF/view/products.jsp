<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

  <!-- Table Products-->
  <div style="height: 100vh">
    <div class="flex-center flex-column">
     <!-- Editable table -->
     <div class="card">
       <h3 class="card-header text-center font-weight-bold text-uppercase py-4">Products Table</h3>
       <div class="card-body">
         <div id="table" class="table-editable">
           <span class="table-add float-right mb-3 mr-2"><a href="/showFormAddProduct" class="text-success"><i
                 class="fas fa-plus fa-2x" aria-hidden="true"></i></a></span>
           <table class="table table-bordered table-responsive-md table-striped text-center">
             <thead>
               <tr>
                 <th class="text-center">Id</th>
                 <th class="text-center">Title Product</th>
                 <th class="text-center">Coast (rub)</th>
                 <th class="text-center">Delete product</th>
                 <th class="text-center">View detail</th>
               </tr>
             </thead>
             <tbody>

             <c:forEach var="product" items="${products}">
               <tr>
                 <td class="pt-3-half" contenteditable="true">${product.id}</td>
                 <td class="pt-3-half" contenteditable="true">${product.title}</td>
                 <td class="pt-3-half" contenteditable="true">${product.coast}</td>
                 <td>
                   <span class="table-remove">
                    <a href="/deleteProduct?id=${product.id}" class="btn btn-danger btn-rounded btn-sm my-0" role="button">Remove</a>
                   </span>
                 </td>
                 <td>
                    <span class="table-remove">
                     <a href="/showProductById?id=${product.id}" class="btn btn-danger btn-rounded btn-sm my-0" role="button">View</a>
                    </span>
                 </td>
               </tr>
             </c:forEach>

             </tbody>
           </table>
         </div>
       </div>
     </div>
     <!-- Editable table -->
    </div>
  </div>
  <!-- End your project here-->

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

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>
<html>
<head>
    <title>All Messages</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<!--Navbar-->
<nav class="navbar navbar-dark bg-primary navbar-expand-lg">
    <a class="navbar-brand" href="#">Admin Management</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="allUsers">Users</a>
            </li>
            <li class="nav-item ">
                <a class="nav-link" href="allOffers">Offres</a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="AllContact">Messages <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item ">
                <a class="nav-link" href="AllCondidature">Candidatures </a>
            </li>
        </ul>
    </div>
</nav>
    <div class="container mt-2">
        <!-- Search form -->
        <div>
            <table class="table table-striped">
                <thead>
                <tr>
                    <th scope="col">Email</th>
                    <th scope="col">Sujet</th>
                    <th scope="col">Message</th>
                </tr>
                </thead>
                <tbody>

                <c:forEach items="${allContacts}" var="contact">
            
                    <tr>
                        <td>${contact.email}</td>
                        <td>${contact.sujet}</td>
                        <td>${contact.msg}</td>
                        
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

        <div class="row">
            <a href="disconnect">
                <button class="btn btn-danger mt-2">Disconnect <i class="fa fa-sign-out"></i></button>
            </a>
        </div>
    </div>

</body>
</html>
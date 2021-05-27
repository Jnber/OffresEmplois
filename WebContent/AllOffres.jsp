<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>
<html>
<head>
    <title>All Offres Page</title>
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
            <li class="nav-item active">
                <a class="nav-link" href="allOffers">Offres <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item ">
                <a class="nav-link" href="AllContact">Messages </a>
            </li>
            <li class="nav-item ">
                <a class="nav-link" href="AllCondidature">Candidatures </a>
            </li>
        </ul>
    </div>
</nav>
    <div class="container mt-2">
        
        <div>
            <table class="table table-striped">
                <thead>
                <tr>
                    <th scope="col">Metier</th>
                    <th scope="col">Titre</th>
                    <th scope="col">Societe</th>
                    <th scope="col">Date Fin</th>
                    <th scope="col">Description</th>
                    <th scope="col">Actions</th>
                </tr>
                </thead>
                <tbody>

                <c:forEach items="${allOffres}" var="offre">
            
                    <tr>
                        <td>${offre.metier}</td>
                        <td>${offre.titer}</td>
                        <td>${offre.societe}</td>
                        <td>${offre.date}</td>
                        <td>${offre.descri}</td>
                        <td>
                            <a href="deleteOffre?id=${offre.id}">
                                <button class="btn btn-danger"><i class="fa fa-trash"></i></button>
                            </a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

        <div class="row">
            <a href="addOffre?id=${offre.id}">
                <button class="btn btn-primary">Add Offre <i class="fa fa-plus"></i></button>
            </a>
        </div>
        <div class="row">
            <a href="disconnect">
                <button class="btn btn-danger mt-2">Disconnect <i class="fa fa-sign-out"></i></button>
            </a>
        </div>
    </div>

</body>
</html>
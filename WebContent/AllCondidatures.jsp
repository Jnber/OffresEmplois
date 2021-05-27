<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>
<html>
<head>
    <title>All Condidatures Page</title>
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
                <a class="nav-link" href="allOffers">Offres <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item ">
                <a class="nav-link" href="AllContact">Messages </a>
            </li>
            <li class="nav-item active">
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
                    <th scope="col">Telephone</th>
                    <th scope="col">date de Naissance</th>
                    <th scope="col">Ville</th>
                    <th scope="col">Etude</th>
                    <th scope="col">Expertise</th>
                    <th scope="col">cv</th>
                    <th scope="col">Offre</th>
                    <th scope="col">User</th>
                    <th scope="col">Action</th>
                </tr>
                </thead>
                <tbody>

                <c:forEach items="${AllCondidature}" var="condidature">
            
                    <tr>
                        <td>${condidature.tel}</td>
                        <td>${condidature.datenaissence}</td>
                        <td>${condidature.ville}</td>
                        <td>${condidature.niveauEtude}</td>
                        <td>${condidature.niveauExp}</td>
                        <td><a href="${condidature.cv}">Cv</a></td>
                        <td>${condidature.id_offre}</td>
                        <td>${condidature.id_utili}</td>
                        <td>
                            <a href="DeleteCondidature?id=${condidature.id_condidat}">
                                <button class="btn btn-danger"><i class="fa fa-trash"></i></button>
                            </a>
                        </td>
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
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Offre</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <form action="addOffre" method="post">
            <div class="form-group row">
                <label for="metier" class="col-sm-2 col-form-label">Metier</label>
                <div class="col-sm-10">
                    <input type="text" name="metier" class="form-control" id="metier" placeholder="Entrer le metier">
                </div>
            </div>

            <div class="form-group row">
                <label for="titre" class="col-sm-2 col-form-label">Titre</label>
                <div class="col-sm-10">
                    <input type="text" name="titre" class="form-control" id="titre" placeholder="Entrer le titre du post">
                </div>
            </div>

            <div class="form-group row">
                <label for="societe" class="col-sm-2 col-form-label">Societe</label>
                <div class="col-sm-10">
                    <input type="text" name="societe" class="form-control" id="societe" placeholder="Entrer le nom de la societe">
                </div>
            </div>
            <div class="form-group row">
                <label for="date" class="col-sm-2 col-form-label">Date Fin de l'offre</label>
                <div class="col-sm-10">
                    <input type="text" name="date" class="form-control" id="date" placeholder="Entrer la date de l'expiration de l'offre">
                </div>
            </div>

            <div class="form-group row">
                <label for="descri" class="col-sm-2 col-form-label">Description</label>
                <div class="col-sm-10">
                    <input type="text" name="descri" class="form-control" id="descri" placeholder="Entrer une Description">
                </div>
            </div>

            <button type="submit" class="btn btn-success">Save Offre</button>
        </form>
    </div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Candidature</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="Bluesky template project">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css"
	href="styles/bootstrap4/bootstrap.min.css">
<link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css"
	href="plugins/OwlCarousel2-2.2.1/owl.carousel.css">
<link rel="stylesheet" type="text/css"
	href="plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
<link rel="stylesheet" type="text/css"
	href="plugins/OwlCarousel2-2.2.1/animate.css">
<link rel="stylesheet" type="text/css" href="styles/main_styles.css">
<link rel="stylesheet" type="text/css" href="styles/responsive.css">

</head>
<!-- Header -->

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
	<div class="container">
		<a class="navbar-brand" href="#">E-Offre Emplois</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarResponsive" aria-controls="navbarResponsive"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active"><a class="nav-link" href="index.html">Offres  d'emplois
				</a></li>
				<li class="nav-item"><a class="nav-link" href="contact.jsp">Contact<span class="sr-only">(current)</span></a></li>
				<li class="nav-item"><a class="nav-link mx-1" href="register.jsp">Inscription</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="login.jsp">Connexion</a>
				</li>
			</ul>
		</div>

	</div>
</nav>
<br>
<form  method="post" action="AddCondidature" >
<div class="container">
	<div id="layoutAuthentication">
		<div id="layoutAuthentication_content">
			
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-lg-7">
						<div class="card shadow-lg border-0 rounded-lg mt-5">
							<div class="card-header">
								<h3 class="text-center font-weight-light my-4">Candidature</h3>
							</div>
							<div class="card-body">
								
									<div class="form-row">
										<div class="col-md-6">
											<div class="form-group">
												<label class="small mb-1" for="inputFirstName">Telephone
													</label><input class="form-control py-4" id="inputFirstName" name="tel"
													type="text" placeholder="+216 00 000 000" />
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<label class="small mb-1" for="inputLastName">Date de Naissance
													</label><input class="form-control py-4" id="inputLastName" name="dateNaissence"
													type="text" placeholder="dd/mm/aaaa" />
											</div>
										</div>
									</div>
									
									<div class="form-group">
										<label class="small mb-1" for="inputEmailAddress">Ville</label><input
											class="form-control py-4" id="inputEmailAddress" type="text" name="ville"
											placeholder="Vous habitez où?" />
									</div>
									<div class="form-row">
										<div class="col-md-6">
											<div class="form-group">
												<label class="small mb-1" >Niveau d'étude</label><input
													class="form-control py-4" id="inputPassword"
													type="text" placeholder="x année" name="niveauEtude"/>
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<label class="small mb-1" >Niveau d'expertise</label>
												<input class="form-control py-4"
													id="inputConfirmPassword" type="text"
													placeholder="x années." name="niveauExp"/>
											</div>
										</div>
									
									</div>
									<div class="form-group">
										<label class="small mb-1" for="inputEmailAddress">Lien de votre Cv</label><input
											class="form-control py-4" id="inputEmailAddress" type="text" name="cv"
											placeholder="https://..." />
									</div>
									<div class="form-group mt-4 mb-0">
										<button class="btn btn-primary btn-block">Create
											Account</button>
									</div>
							
							</div>
						</div>
					</div>
				</div>
			</div>
		
		</div>
	</div>
		</form>
	<br>
	<br>
	<br>
	<footer class="footer bg-light">
		<div class="footer_bar">
			<div class="container">
				<div class="row">
					<div class="col">
						<div
							class="footer_bar_content d-flex flex-row align-items-center justify-content-start">
							<div class="cr">
								<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
								Copyright &copy;
								<script>
									document.write(new Date().getFullYear());
								</script>
								All rights reserved | This template is made with <i
									class="fa fa-heart-o" aria-hidden="true"></i> by <a
									href="https://colorlib.com" target="_blank">Colorlib</a>
								<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
							</div>
							<div class="footer_nav">
								<ul>
									<li><a href="index.html">Accueil</a></li>
									<li><a href="#">offres d'emploi</a></li>
									<li><a href="properties.html">Properties</a></li>
									<li><a href="news.html">News</a></li>
									<li><a href="contact.html">Contact</a></li>
								</ul>
							</div>
							<div class="footer_phone ml-auto">
								<span>call us: </span>652 345 3222 11
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</footer>
</div>

<script src="js/jquery-3.2.1.min.js"></script>
<script src="styles/bootstrap4/popper.js"></script>
<script src="styles/bootstrap4/bootstrap.min.js"></script>
<script src="plugins/OwlCarousel2-2.2.1/owl.carousel.js"></script>
<script src="plugins/easing/easing.js"></script>
<script src="plugins/parallax-js-master/parallax.min.js"></script>
<script src="js/custom.js"></script>
</html>
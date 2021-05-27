<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Contact</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="Bluesky template project">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="styles/bootstrap4/bootstrap.min.css">
<link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="plugins/rangeslider.js-2.3.0/rangeslider.css">
<link rel="stylesheet" type="text/css" href="styles/contact.css">
<link rel="stylesheet" type="text/css" href="styles/contact_responsive.css">
</head>
<body>

<div class="super_container">

	<!-- Header -->

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
				<li class="nav-item"><a class="nav-link" href="disconnect">Disconnect</a>
				</li>
			</ul>
		</div>

	</div>
</nav>


	
	<!-- Home -->

	<div class="home">
		<div class="parallax_background parallax-window" data-parallax="scroll" data-image-src="images/contact.jpg" data-speed="0.8"></div>
		<div class="home_container">
			<div class="container">
				<div class="row">
					<div class="col">
						<div class="home_content d-flex flex-row align-items-end justify-content-start">
							<div class="home_title">Contact</div>
							
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	
	<!-- Contact -->

	<div class="contact">
		<div class="container">
			<div class="row" style="display: flex">
				<!-- Contact Info -->
				<div class="col-lg-4">
					<div class="contact_info">
						<div class="section_title">Get in touch with us</div>
						<div class="section_subtitle">Say hello</div>
						<div class="contact_info_text"><p>Donec ullamcorper nulla non metus auctor fringi lla. Curabitur blandit tempus porttitor.Sed lectus urna, ultricies sit amet risus eget.</p></div>
						<div class="contact_info_content">
							<ul class="contact_info_list">
								<li>
									<div>Address:</div>
									<div>1481 Creekside Lane Avila Beach, CA 93424</div>
								</li>
								<li>
									<div>Phone:</div>
									<div>+53 345 7953 32453</div>
								</li>
								<li>
									<div>Email:</div>
									<div>yourmail@gmail.com</div>
								</li>
							</ul>
						</div>
					</div>
				</div>

				<!-- Contact Form -->
				<form method="post" action="AddContact" class="contact_form" id="contact_form">
				<div class="col-lg-8" style="width:52vw">
					<div class="contact_form_container">
						
							<div class="row">
								<!-- Email -->
								<div class="col-lg-6">
									<input type="email" class="contact_input" placeholder="E-mail" required="required" name="email">
								</div>
							</div>
							<div><input type="text" class="contact_input" placeholder="Subject" name="sujet"></div>
							<div><textarea class="contact_textarea contact_input" placeholder="Message" required="required" name="msg"></textarea></div>
							<button class="contact_button button">send</button>
							</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>


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
								<li><a href="index.html">Home</a></li>
								<li><a href="#">About us</a></li>
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
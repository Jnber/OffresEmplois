<!DOCTYPE html>
<html lang="en">
<head>
<title>Bluesky</title>
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
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

</head>
<body>

	<div class="super_container">

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




		<!-- Menu -->

		<div class="menu trans_500">
			<div
				class="menu_content d-flex flex-column align-items-center justify-content-center text-center">
				<div class="menu_close_container">
					<div class="menu_close"></div>
				</div>
				<div class="logo menu_logo">
					<a href="#">
						<div
							class="logo_container d-flex flex-row align-items-start justify-content-start">
							<div class="logo_image">
								<div>
									<img src="images/logo.png" alt="">
								</div>
							</div>
						</div>
					</a>
				</div>
			</div>
		</div>

		<!-- Home -->

		<div class="home">

			<!-- Home Slider -->
			<div class="home_slider_container">
				<div class="owl-carousel owl-theme home_slider">

					<!-- Slide -->
					<div class="owl-item">
						<div class="home_slider_background"
							style="background-image: url(images/back1.jpg)"></div>
						<div class="slide_container">
							<div class="container">
								<div class="row">
									<div class="col">
										<div class="slide_content">
											
											<div style="color: #343a40" class="home_title">Trouvez le job de vos rêves</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>

		<!-- Recent -->

		<div class="recent">
			<div class="container">
				<div class="row">
					<div class="col">
						<div class="section_title">Offres</div>

					</div>
				</div>
				<div class="row recent_row">
					<div class="col">
						<div class="recent_slider_container">
							<div class="owl-carousel owl-theme recent_slider">

								<!-- Slide -->
								${data}


								<!-- Slide -->
								<!-- Modal -->
			<div class="modal fade" id="myModalNorm" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<!-- Modal Header -->
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">
								<span aria-hidden="true">&times;</span> <span class="sr-only">Close</span>
							</button>
							<h4 class="modal-title" id="myModalLabel">Modal title</h4>
						</div>

						<!-- Modal Body -->
						<div class="modal-body">
E
							<form role="form">
								<div class="form-group">
									<label for="exampleInputEmail1">Email address</label> <input
										type="email" class="form-control" value="sdqsd" id="exampleInputEmail1"
										 />
								</div>
								<div class="form-group">
									<label for="exampleInputPassword1">Password</label> <input
										type="password" class="form-control"
										id="exampleInputPassword1" placeholder="Password" />
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" /> Check me out
									</label>
								</div>
								<button type="submit" class="btn btn-default">Submit</button>
							</form>


						</div>

						<!-- Modal Footer -->
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
							<button type="button" class="btn btn-primary">Save
								changes</button>
						</div>
					</div>
				</div>
			</div>
								
							</div>

							<div
								class="recent_slider_nav_container d-flex flex-row align-items-start justify-content-start">
								<div class="recent_slider_nav recent_slider_prev">
									<i class="fa fa-chevron-left" aria-hidden="true"></i>
								</div>
								<div class="recent_slider_nav recent_slider_next">
									<i class="fa fa-chevron-right" aria-hidden="true"></i>
								</div>
							</div>
						</div>
						
					</div>
				</div>
			</div>
		</div>




		<!-- Footer -->

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
										document
												.write(new Date().getFullYear());
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
	<script	src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js"
		crossorigin="anonymous"></script>

	<script
		src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"
		crossorigin="anonymous"></script>
	

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>
<style type="text/css">
html{

	height:100%;
	min-height:25cm;
	width:100%;

}

</style>

<title>Apple eStore</title>

<meta charset="utf-8">
<meta name="robots" content="all,follow">
<meta name="googlebot" content="index,follow,snippet,archive">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Apple eStore</title>

<meta name="keywords" content="">

<link
	href="<c:url value='http://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,500,700,800'/>"
	rel='stylesheet' type='text/css' />

<!-- Bootstrap and Font Awesome css -->
<link rel="stylesheet"
	href="<c:url value="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css"/>">
<link rel="stylesheet"
	href="<c:url value="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css"/>">

<!-- Css animations  -->
<link href="<c:url value="/resources/css/animate.css"/>"
	rel="stylesheet">

<!-- Theme stylesheet, if possible do not edit this stylesheet -->
<link href="<c:url value="/resources/css/style.default.css"/>"
	rel="stylesheet" id="theme-stylesheet">

<!-- Custom stylesheet - for your changes -->
<link href="<c:url value="/resources/css/custom.css"/>" rel="stylesheet">

<!-- Responsivity for older IE -->
<!--[if lt IE 9]>
        <script src="<c:url value="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"/>"></script>
        <script src="<c:url value="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"/>"></script>
<![endif]-->

<!-- Favicon and apple touch icons-->
<link rel="shortcut icon"
	href="<c:url value ="/resources/img/favicon.icon"/>"
	type="image/x-icon" />
<link rel="apple-touch-icon"
	href="<c:url value ="/resources/img/apple-touch-icon.png"/>" />
<link rel="apple-touch-icon" sizes="57x57"
	href="<c:url value ="/resources/img/apple-touch-icon-57x57.png"/>" />
<link rel="apple-touch-icon" sizes="72x72"
	href="<c:url value ="/resources/img/apple-touch-icon-72x72.png"/>" />
<link rel="apple-touch-icon" sizes="76x76"
	href="<c:url value ="/resources/img/apple-touch-icon-76x76.png"/>" />
<link rel="apple-touch-icon" sizes="114x114"
	href="<c:url value ="/resources/img/apple-touch-icon-114x114.png"/>" />
<link rel="apple-touch-icon" sizes="120x120"
	href="<c:url value ="/resources/img/apple-touch-icon-120x120.png"/>" />
<link rel="apple-touch-icon" sizes="144x144"
	href="<c:url value ="/resources/img/apple-touch-icon-144x144.png"/>" />
<link rel="apple-touch-icon" sizes="152x152"
	href="<c:url value ="/resources/img/apple-touch-icon-152x152.png"/>" />
	
	
<!-- owl carousel css -->

<link href="<c:url value ="/resources/css/owl.carousel.css"/>"
	rel="stylesheet">
<link href="<c:url value ="/resources/css/owl.theme.css"/>"
	rel="stylesheet">
	




</head>
<body>
	<header> 
	<!-- *** TOP ***
_________________________________________________________ -->
	<div id="all">
		<div id="top">
			<div class="container">
				<div class="row">
					
					<div class="col-sm-4">
						<div class="social pull-left">
							<a href="<c:url value ="http://www.facebook.com"/>"
								class="external facebook" data-animate-hover="pulse"><i
								class="fa fa-facebook"></i></a> <a
								href="<c:url value ="http://www.googleplus.com"/>"
								class="external gplus" data-animate-hover="pulse"><i
								class="fa fa-google-plus"></i></a> <a
								href="<c:url value ="http://www.twitter.com"/>"
								class="external twitter" data-animate-hover="pulse"><i
								class="fa fa-twitter"></i></a>

							<!-- PUT CODE TO COMPOSE A MAIL REMOVE GMAIL.COM  -->
							<a href="<c:url value ="http://www.gmail.com"/>" class="external email"
								data-animate-hover="pulse"><i class="fa fa-envelope"></i></a>
						</div>
						</div>

						<div class="col-sm-8">
						<div class="login pull-right">


						<c:choose>
							<c:when test="${pageContext.request.userPrincipal.name != null}">							
							
								<i class="fa fa-user-admin"></i>
								<a>Hello, ${pageContext.request.userPrincipal.name}</a>
								<a href="<c:url value="/j_spring_security_logout"/>">
								<i class="fa fa-sign-out"></i>Sign Out</a>
							</c:when>						
							<c:otherwise><a href="<c:url value="/"/>"><i class="fa fa-home"></i> 
							<span class="hidden-xs text-uppercase">Home</span></a>
							<a href="<c:url value="/login"/>"> <i class="fa fa-sign-in"></i> 
							<span class="hidden-xs text-uppercase">Sign in</span></a> 
							<a href="<c:url value="/register"/>"><i class="fa fa-user"> </i> 
							<span class="hidden-xs text-uppercase">Sign up</span></a>
						 </c:otherwise>
						</c:choose> 
						</div>
						</div>
				</div>
			</div>
		</div> <!-- *** TOP END *** -->
		
		
		<!-- *** NAVBAR BEGIN***
    _________________________________________________________ -->

		<div class="navbar-affixed-top" data-spy="affix" data-offset-top="200">

			<div class="navbar navbar-default yamm" role="navigation" id="navbar">

				<div class="container">
					<div class="navbar-header">

						<a class="navbar-brand home" href="<c:url value="/"/>"> <img
							src="<c:url value ="/resources/img/logo.png"/>"
							alt="Apple eStore logo" class="hidden-xs hidden-sm">  
							<img src="<c:url value ="/resources/img/logo-small.png"/>" alt="Apple eStore logo" class="visible-xs visible-sm">
                               <span class="sr-only">Universal - go to homepage</span> 
						</a>
						<div class="navbar-buttons">
							<button type="button" class="navbar-toggle btn-template-main"
								data-toggle="collapse" data-target="#navigation">
								<span class="sr-only">Toggle navigation</span> <i
									class="fa fa-align-justify"></i>
							</button>
						</div>
					</div>
					<!--/.navbar-header -->

					<div class="navbar-collapse collapse" id="navigation">

						<ul class="nav navbar-nav navbar-right">
							<li><a href="<c:url value='/'/>">Home <b class="caret"></b></a></li>

							<!-- ========== FULL WIDTH MEGAMENU ================== -->
							
							
							<li class="dropdown">
                                    <a href="javascript: void(0)" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">My pages <b class="caret"></b></a>
                                    <ul class="dropdown-menu" style="display: none;">
                                        <c:choose>
												<c:when test="${pageContext.request.userPrincipal.name != null}">
													<c:if test="${pageContext.request.userPrincipal.name == 'Admin'}">
													
														<li><a href="<c:url value='/categories'/>">Category</a></li>
														<li><a href="<c:url value="/suppliers"/>">Supplier</a></li>
														<li><a href="<c:url value="/products"/>">Product</a></li>
													</c:if>
													
													<c:if test="${pageContext.request.userPrincipal.name != 'Admin'}">
													
														<li><a href="<c:url value="/user/cart"/>">Cart</a></li>
													
													</c:if>
													</c:when>
													
													<c:otherwise>
													
														<li><a href="<c:url value="/register"/>">Register</a></li>
														<li><a href="<c:url value="/loginPage"/>">Login</a></li>
													
													</c:otherwise>
											</c:choose>
													<li><a href="<c:url value="/aboutPage"/>">About us</a></li>
													<li><a href="<c:url value="/ourTeamPage"/>">Our team</a></li>
													<li><a href="<c:url value="/blogPage"/>">Blog</a></li>
													<li><a href="<c:url value="/contact"/>">Contact us</a></li>
													
                                    </ul>
                                </li>
							
								
							<!-- ========== FULL WIDTH MEGAMENU END ================== -->
							
							</ul>
					</div>

				</div>


			</div>
			<!-- /#navbar -->

		</div>

	</div>
	<!-- *** NAVBAR END *** --> 

</header>


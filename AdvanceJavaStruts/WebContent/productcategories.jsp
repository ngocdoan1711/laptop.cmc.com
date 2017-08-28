<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;">
<title>Product Categories</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<link rel="shortcut icon" href="img/icons/favicon.png">
<link
	href="https://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900"
	rel="stylesheet">
<link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
<link href="lib/owlcarousel/owl.carousel.min.css" rel="stylesheet">
<link href="lib/owlcarousel/owl.theme.min.css" rel="stylesheet">
<link href="lib/owlcarousel/owl.transitions.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<div id="background-wrapper" class="buildings"
		data-stellar-background-ratio="0.1">
		<jsp:include page="./includes/header.jsp"></jsp:include>
	</div>
	<div class="container">
		<ul class="breadcrumb">
			<li><a href="index.jsp">Trang chủ</a></li>
			<li><a href="${pageContext.request.contextPath}/category?categoryId=<s:property value="category.categoryId"/>"><s:property value="category.categoryName" /></a></li>
		</ul>
	</div>
	<div class="container">
		<div id="content" role="main">
			<div class="products-wapper">
				<div class="listing-title row-m-g-l">
					<h2>
						<span><s:property value="category.categoryName"/></span>
					</h2>
				</div>
				<ul class="products-loop row clearfix">
				<s:iterator value="listProduct">
					  <li class="col-lg-3 col-md-4 col-sm-6 ">
						<div class="item">
							<a href="${pageContext.request.contextPath}/product?productId=<s:property value="productId"/>" class="overlay-wrapper">
								<img src="<s:property value="image"/>" class="img-responsive underlay medium-image">
								<span class="overlay">
								  <span class="overlay-content">
								  	<span class="h4"><s:property value="productName" /></span>
								  </span>
							 	</span>
							</a>
							<div class="item-details bg-noise">
								<h4 class="item-title">
									<a href="${pageContext.request.contextPath}/product?productId=<s:property value="productId"/>"><s:property value="productName" /></a>
								</h4>
								<a href="${pageContext.request.contextPath}/product?productId=<s:property value="productId"/>" class="btn btn-more"><i
									class="fa fa-plus"></i>Xem thêm</a>
							</div>
						</div>
					</li></s:iterator>
				</ul>
			</div>
		</div>
	</div>
	<jsp:include page="./includes/footer.jsp"></jsp:include>
	<script src="lib/jquery/jquery.min.js"></script>
	<script src="lib/bootstrap/js/bootstrap.min.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>
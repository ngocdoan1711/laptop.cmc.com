<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;">
<head>
<title>Login - CMC Laptop</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<link href="${pageContext.request.contextPath}/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet">
</head>
<body class="fullscreen-centered page-login">
	<div id="background-wrapper" class="benches"
		data-stellar-background-ratio="0.8">
		<div id="content">
			<div class="header">
				<div class="header-inner">
					<a class="navbar-brand center-block" href="${pageContext.request.contextPath}/index.jsp" title="Home"></a>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-6 col-sm-offset-3">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">Login</h3>
							<p></p>
							<div class="alert alert-danger" role="alert">
								<s:property value="error_login"/>
							</div>
						</div>
						<div class="panel-body">
							<s:form accept-charset="UTF-8" role="form" method="post" action="login">
								<fieldset>
									<div class="form-group">
										<div class="input-group input-group-lg">
											<span class="input-group-addon"><i class="fa fa-fw fa-envelope"></i></span> 
											<s:textfield  name="userName" cssClass="form-control" placeholder="UserName"></s:textfield>
										</div>
									</div>
									<div class="form-group">
										<div class="input-group input-group-lg">
											<span class="input-group-addon"><i class="fa fa-fw fa-lock"></i></span>
											<s:password name="password" cssClass="form-control" placeholder="Password"></s:password>
										</div>
									</div>
									<div class="checkbox">
										<label> <input name="remember" type="checkbox"
											value="Remember Me"> Remember Me
										</label>
									</div>
									<s:submit name="submit" cssClass="btn btn-lg btn-primary btn-block" value="Login"></s:submit>
								</fieldset>
							</s:form>
							<p class="m-b-0 m-t">
								Not signed up? <a href="${pageContext.request.contextPath}/register.jsp">Sign up here</a>.
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="${pageContext.request.contextPath}/lib/jquery/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/custom.js"></script>
</body>
</html>
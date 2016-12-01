<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:include page="partials/header.jsp">
	<jsp:param name="title" value="New Account"/>
</jsp:include>

				<h1 class="centered">Create a New Account</h1>
					
				<div class="row">
					<div class="col-md-2 col-md-offset-5">
						<div class="form-group">
							<h3 class="centered">Select Type of Account</h3>
							<select class="form-control" name="selectType" id="show-form">
								<option value="">Select Type</option>
								<option value="doctor">Doctor</option>
								<option value="user">General User</option>
							</select>
						</div>
					</div>
				</div>		
		

				<!-- doctor signup -->
				<div id="doctor-signup" class="margin-top">
					<h4 class="centered">Create New Doctor Account</h4>	
					<form:form action="" modelAttribute="user" method="POST">
						<div class="margin-top">
							<div class="row">	
								<div class="col-md-2 col-md-offset-4">
									<div class="form-group">
										<label for="">First Name</label>
										<form:input path="firstName" cssClass="form-control" placeholder="First Name..." required="required" />
									</div>
								</div>
								<div class="col-md-2">
									<div class="form-group">
										<label for="">Last Name</label>
										<form:input path="lastName" cssClass="form-control" placeholder="Last Name..." required="required" />
									</div>
								</div>
							</div>
						</div>
						<div class="row">	
							<div class="col-md-2 col-md-offset-4">
								<div class="form-group">
									<label for="">User Name</label>
									<form:input path="username" cssClass="form-control" placeholder="User Name..." required="required" />
								</div>
							</div>
							<div class="col-md-2">
								<div class="form-group">
									<label for="">Email</label>
									<form:input type="email" path="email" cssClass="form-control" placeholder="Email..." required="required" />
									
								</div>
							</div>
						</div>
						<div class="row">	
							<div class="col-md-2 col-md-offset-4">
								<div class="form-group">
									<label for="">Type of Practitioner</label>
									<form:input path="practitionerType" cssClass="form-control" placeholder="Type of Practitioner..." />
								</div>
							</div>
							<div class="col-md-2">
								<div class="form-group">
									<label for="">License Number</label>
									<form:input path="licenseNumber" cssClass="form-control" placeholder="Enter License Number" required="required" />
									
								</div>
							</div>
						</div>
						<div class="row">	
							<div class="col-md-2 col-md-offset-4">
								<div class="form-group">
									<label for="">Password</label>
									<form:password path="password" cssClass="form-control" placeholder="Enter a password..." required="required" />
								</div>
							</div>
							<div class="col-md-2">
								<div class="form-group">
									<label for="">Re-enter Password</label>
									<form:password path="verifyPassword" cssClass="form-control" placeholder="Re-enter password..." required="required" />
								
								</div>
							</div>
						</div>
						<!-- Hidden form elements -->
						<form:hidden path="isDoctor" cssClass="form-control" value="True" />
						<!-- Hidden form elements -->
						<div class="row">
							<div class="col-md-2 col-md-offset-5 margin-top">
								<input type="submit" class="form-control styled-button" value="Submit" name="submit-doctor">
							</div>
						</div>
					</form:form>
				</div>
				<!-- doctor signup -->
				
				<!-- genearl user signup -->
				<div id="general-user-signup" class="margin-top">
					<h4 class="centered">Create New General User Account</h4>
					<form:form action="" modelAttribute="user" method="POST">
						<div class="margin-top">
							<div class="row">	
								<div class="col-md-2 col-md-offset-5">
									<div class="form-group">
										<label for="">Username</label>
										<form:password path="username" cssClass="form-control" placeholder="Enter username..." required="required" />
										
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-2 col-md-offset-5">
									<div class="form-group">
										<label for="">Email</label>
										<form:input type="email" path="email" cssClass="form-control" placeholder="Email..." required="required" />
								
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-2 col-md-offset-5">
									<div class="form-group">
										<label for="">Password</label>
										<form:password path="password" cssClass="form-control" placeholder="Enter password..." required="required" />
										
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-2 col-md-offset-5">
									<div class="form-group">
										<label for="">Re-enter Password</label>
										<form:password path="verifyPassword" cssClass="form-control" placeholder="Re-enter password..." required="required" />
										
									</div>
								</div>
							</div>
							<!-- Hidden form elements -->
							<form:hidden path="isDoctor" cssClass="form-control" value="False" />
							<!-- Hidden form elements -->
							<div class="row">
								<div class="col-md-2 col-md-offset-5 margin-top">
									<input type="submit" class="form-control styled-button" value="Submit" name="submit-general-user">
								</div>
							</div>

						</div>
					</form:form>
				</div>
				<!-- general user signup -->


				
<jsp:include page="partials/footer.jsp">
	<jsp:param name="customScript" value="custom-create-account.js"/>
</jsp:include>
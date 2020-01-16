<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
/* Popup container - can be anything you want */
.popup {
	position: relative;
	display: inline-block;
	cursor: pointer;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
}
/* The actual popup */
.popup .popuptext {
	visibility: hidden;
	width: 600px;
	background-color: #555;
	color: #fff;
	text-align: center;
	border-radius: 6px;
	padding: 8px 0;
	position: absolute;
	z-index: 1;
	bottom: 125%;
	left: 50%;
	margin-left: -80px;
}
/* Popup arrow */
.popup .popuptext::after {
	content: "";
	position: absolute;
	top: 100%;
	left: 50%;
	margin-left: -5px;
	border-width: 5px;
	border-style: solid;
	border-color: #555 transparent transparent transparent;
}
/* Toggle this class - hide and show the popup */
.popup .show {
	visibility: visible;
	-webkit-animation: fadeIn 1s;
	animation: fadeIn 1s;
}
/* Add animation (fade in the popup) */
@
-webkit-keyframes fadeIn {
	from {opacity: 0;
}

to {
	opacity: 1;
}

}
@
keyframes fadeIn {
	from {opacity: 0;
}

to {
	opacity: 1;
}
}
</style>
</head>
<body>
	<h1 align="center">Register Staff</h1>
	<form method="post" action="">
		<table cellpadding="2" cellspacing="2" align="center">
			<tr>
				<td>STAFF NAME</td>
				<td>:</td>
				<td><input type="text" name="staff_Name"></td>
			</tr>
			<tr>
				<td>DATE OF BIRTH</td>
				<td>:</td>
				<td><input type="date" name="date_Of_Birth"></td>
			</tr>

			<tr>
				<td>COUNTRY</td>
				<td>:</td>
				<td><input list="country_Name" name="country_Name"> <datalist
						id="country_Name">
						<option value="India">India</option>
						<option value="UK">UK</option>
						<option value="USA">USA</option>
						<option value="Italy">Italy</option>
					</datalist></td>
			</tr>
			<tr>
				<td>STATE</td>
				<td>:</td>
				<td><input list="state_Name" name="state_Name"> <datalist
						id="state_Name">
						<option value="TamilNadu">TamilNadu</option>
						<option value="Kerala">Kerala</option>
						<option value="Karnataka">Karnataka</option>
						<option value="Andhra Pradesh">Andhra Pradesh</option>
						<option value="Scotland">Scotland</option>
						<option value="New Jersey">New Jersey</option>
						<option value="Rome">Rome</option>
					</datalist></td>
			</tr>
			<tr>
				<td>ADDRESS</td>
				<td>:</td>
				<td><input type="text" name="address;"></td>
			</tr>
			<tr>
				<td>CONTACT NUMBER</td>
				<td>:</td>
				<td><input type="number" name="contact_No"></td>
			</tr>
			<tr>
				<td>EMAIL ADDRESS</td>
				<td>:</td>
				<td><input type="Email" name="mail_ID"></td>
			</tr>
			<tr>
				<td>GENDER</td>
				<td>:</td>
				<td><input type="radio" name="gender" value="F">FEMALE
					<input type="radio" name="gender" value="M">MALE</td>
			</tr>
			<tr>
				<td>Highest Qualification</td>
				<td>:</td>
				<td><input type="text" name="Highest_Qualification"></td>
			</tr>
			<tr>
				<td>Experience</td>
				<td>:</td>
				<td><input type="text" name="experience"></td>
			</tr>
			<tr>
				<td>STANDARD</td>
				<td>:</td>
				<td><input list="year of passing " name="year of passing"><br>
					<datalist id="year of passing">
						<option value="1980">1980</option>
						<option value="1981">1981</option>
						<option value="1982">1982</option>
						<option value="1983">1983</option>
						<option value="1984">1984</option>
						<option value="1985">1985</option>
						<option value="1986">1986</option>
						<option value="1987">1987</option>
						<option value="1988">1988</option>
						<option value="1989">1989</option>
						<option value="1990">1990</option>
						<option value="1991">1991</option>
						<option value="1992">1992</option>
						<option value="1993">1993</option>
						<option value="1994">1994</option>
						<option value="1995">1995</option>
						<option value="1996">1996</option>
						<option value="1997">1997</option>
						<option value="1998">1998</option>
						<option value="1999">1999</option>
						<option value="2000">2000</option>
						<option value="2001">2001</option>
						<option value="2002">2002</option>
						<option value="2003">2003</option>
						<option value="2004">2004</option>
						<option value="2005">2005</option>
						<option value="2006">2006</option>
						<option value="2007">2007</option>
						<option value="2008">2008</option>
						<option value="2009">2009</option>
						<option value="2010">2010</option>
						<option value="2011">2011</option>
						<option value="2012">2012</option>
						<option value="2013">2013</option>
						<option value="2014">2014</option>
						<option value="2015">2015</option>
						<option value="2016">2016</option>
						<option value="2017">2017</option>
						<option value="2018">2018</option>
						<option value="2019">2019</option>
						<option value="2020">2020</option>
					</datalist></td>
			</tr>



			<tr>
				<td>DATE OF JOINING</td>
				<td>:</td>
				<td><input type="date" name="date_Of_Joining"></td>
			</tr>





			<tr>
				<td>SALARY VIEWER</td>
				<td></td>
				<td>
					<div class="popup" onclick="salaryViewer()">
						Click Here! <span class="popuptext" id="myPopup">
							<table>
								<caption>SALARY STRUCTURE</caption>
								<tr>
									<th>EXPERIENCE</th>
									<th>HIGHEST QUALIFICATION</th>
									<th>SALARY</th>
								</tr>
								<tr>
									<td>5</td>
									<td>UG</td>
									<td>20000</td>
								</tr>
								<tr>
									<td>10</td>
									<td>UG</td>
									<td>25000</td>
								</tr>
								<tr>
									<td>15</td>
									<td>UG</td>
									<td>30000</td>
								</tr>
								<tr>
									<td>20</td>
									<td>UG</td>
									<td>35000</td>
								</tr>
								<tr>
									<td>25</td>
									<td>UG</td>
									<td>40000</td>
								</tr>
								<tr>
									<td>30</td>
									<td>UG</td>
									<td>45000</td>
								</tr>
								<tr>
									<td>37</td>
									<td>UG</td>
									<td>50000</td>
								</tr>
								<tr>
									<td>5</td>
									<td>PG</td>
									<td>26000</td>
								</tr>
								<tr>
									<td>10</td>
									<td>PG</td>
									<td>31000</td>
								</tr>
								<tr>
									<td>15</td>
									<td>PG</td>
									<td>36000</td>
								</tr>
								<tr>
									<td>20</td>
									<td>PG</td>
									<td>41000</td>
								</tr>
								<tr>
									<td>25</td>
									<td>PG</td>
									<td>46000</td>
								</tr>
								<tr>
									<td>30</td>
									<td>PG</td>
									<td>51000</td>
								</tr>
								<tr>
									<td>34</td>
									<td>PG</td>
									<td>56000</td>
								</tr>


							</table>
						</span>
					</div>
				</td>
			</tr>

			<tr>
				<td>&nbsp;</td>
				<td></td>
				<td><input type="submit" value="SUBMIT"> <a
					href="StaffRegistrationForm.jsp"><button type="button">RESET</button></a>
				</td>
			</tr>
		</table>
	</form>
	<script>
			// When the user clicks on div, the popup opens
			function salaryViewer() {
		 	 var popup = document.getElementById("myPopup");
			  popup.classList.toggle("show");
			}		
		</script>
</body>
</html>
 <!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to SheffSurgeries</title>
</head>
<body>
<content tag="nav">
	<h1 style="color:white;"> The Home of SheffSurgeries </h1>
    <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Book Appointment<span class="caret"></span></a>
        <ul class="dropdown-menu">
            <li class="dropdown-item"><a href="#">Book Appointment Online</a></li>
            <li class="dropdown-item"><a href="#">Phone to Book An Appointment</a></li>
            <li class="dropdown-item"><a href="#">See all available slots</a></li>
        </ul>
    </li>
    <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Find Surgery <span class="caret"></span></a>
        <ul class="dropdown-menu">
            <li class="dropdown-item"><a href="#">Find your closest Surgery</a></li>
            <li class="dropdown-item"><a href="#">Apply now</a></li>
        </ul>
    </li>
</content>

<div class="svg" role="presentation">
    <div class="grails-logo-container">
        <asset:image src="skyline.jpg" width="1600" height="1000"/>
    </div>
</div>

<div id="content" role="main">
    <section class="row colset-2-its">
        <h1 style="color:white;"> Welcome to SheffSurgeries | The best Surgery in South Yorkshire</h1>

        <p style="color:white;">
            Welcome to the home of SheffSurgeries the Sheffield based health service. Find everything you need below, from Appointments to Doctors at our Surgeries. 
        </p>
	<div class="row">
	<div class="first">
			<h3 style="color:white;">Surgeries</h3>

<p> </p>
	<button type="button" class="btn btn-success">
	
	<g:link controller="Surgery" action="" style="color:white;">Surgeries</g:link>
	
	</button>
</div>

	<div class="second">
			<h3 style="color:white;">Doctors </h3>

<p>  </p>
	<button type="button" class="btn btn-success">
	
	<g:link controller="Doctor" action="" style="color:white;">Doctors</g:link>
	
	</button>
</div>

	<div class="third">
			<h3 style="color:white;">Nurses </h3>

<p>  </p>
	<button type="button" class="btn btn-success">
	
	<g:link controller="Nurse" action="" style="color:white;">Nurses</g:link>
	
	</button>
</div>

<div class="fourth">
			<h3 style="color:white;">Patients</h3>

<p>    </p>
	<button type="button" class="btn btn-success">
	
	<g:link controller="Patient" action="" style="color:white;">Patients</g:link>
	
	</button>
</div>
</div>


	<div class="row">
	<div class="first">
			<h3 style="color:white;">Appointment </h3>

<p>     </p>
	<button type="button" class="btn btn-success">
	
	<g:link controller="Appointment" action="" style="color:white;">Appointments</g:link>
	
	</button>
</div>

	<div class="second">
			<h3 style="color:white;">Prescripiton </h3>

<p>     </p>
	<button type="button" class="btn btn-success">
	
	<g:link controller="Prescription" action="" style="color:white;">Prescriptions</g:link>
	
	</button>
</div>

<div class="third">
			<h3 style="color:white;">Receptionist </h3>

<p>    </p>
	<button type="button" class="btn btn-success">
	
	<g:link controller="Receptionist" action="" style="color:white;">Receptionists</g:link>
	
	</button>
</div>
        <!--<div id="controllers" role="navigation">
            <h3 style="color:white;"> See all our options below:</h3>
            <ul>
                <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                    <li class="controller">
                        <g:link controller="${c.logicalPropertyName}"style="color:white;">${c.fullName}</g:link>
                    </li>
                </g:each>
            </ul>
        </div> -->
    </section>
</div>

</body>
</html>

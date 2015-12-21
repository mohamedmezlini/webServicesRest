<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Chat rest</title>
</head>
<body>
<div style="padding-left:100px;font-family: monospace;">
		<h2>Ajout Message Etudiant</h2>
		<form action="rest/etudiants" method="POST">
			<div style="width: 200px; text-align: left;">
				<div style="padding:10px;">
					Message ID: <input name="id" />
				</div>
				<div style="padding:10px;">
					Nom Etudiant : <input name="etudiantname" />
				</div>
				<div style="padding:10px;">
					 classe Etudiant: <input name="etudiantclasse" />
				</div>
				<div style="padding:10px;">
					 Message Etudiant: <input name="etudiantmessage" />
				</div>
				<div style="padding:10px;text-align:center">
					<input type="submit" value="Submit" />
				</div>
			</div>
		</form>
	</div>
</body>
</html>
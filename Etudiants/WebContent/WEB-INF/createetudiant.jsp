<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="padding-left:100px;font-family: monospace;">
		<h2>Create Etudiant</h2>
		<form action="http://localhost:8008/Etudiants/rest/etudiants" method="POST">
			<div style="width: 200px; text-align: left;">
				<div style="padding:10px;">
					Etudiant ID: <input name="id" />
				</div>
				<div style="padding:10px;">
					Etudiant Name: <input name="etudiantname" />
				</div>
				<div style="padding:10px;">
					Etudiant classe: <input name="etudiantclasse" />
				</div>
				<div style="padding:10px;">
					Etudiant Moyenne: <input name="etudiantmoyenne" />
				</div>
				<div style="padding:10px;text-align:center">
					<input type="submit" value="Submit" />
				</div>
			</div>
		</form>
	</div>
</body>
</html>
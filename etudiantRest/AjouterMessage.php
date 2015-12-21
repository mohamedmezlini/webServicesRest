<!DOCTYPE html>
<html>
<head>
<title>Create Etudiant</title>
</head>
<body>
	<div style="padding-left:100px;font-family: monospace;">
		<h2>Ajout Message Etudiant</h2>
		<form action="http://localhost:8008/ChatsEtudiant/rest/etudiants/" method="POST">
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
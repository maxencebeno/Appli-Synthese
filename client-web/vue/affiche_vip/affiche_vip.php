<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Voicela</title>
	<link rel="stylesheet" type="text/css" href="assets/css/universal.css" />
    <link rel="stylesheet" type="text/css" href="assets/css/style_bio.css" />
	<link rel="stylesheet" type="text/css" href="assets/css/affiche_vip/style_affiche.css" />

	<!-- Beginning of JavasScript-->
	<script src="./media/jquery-1.9.1.js"></script>
	<script src="./media/jquery.onepage-scroll.js"></script>
	<!-- End of JavasScript-->
</head>

<body>
	<h1>Affichage des VIP référencés</h1>

	<table id="table-ip">   
		<tr>
			<th>Nom VIP</th> 
			<th>Prénom usuel</th>
			<th>nationalité</th>
			<th>civilité</th>
			<th>date_naissance</th>
			<th>lieu naissance</th>
			<th>statut</th>
		</tr>

	<?php
	$req=allVip();
	while($donnee = $req->fetch()){
		echo "<tr>";
		echo "<td>".$donnee["nom_vip"]."</td>";
		echo "<td>".$donnee["prenom_usuel_vip"]."</td>";
		echo "<td>".$donnee["nationalite_vip"]."</td>";
		echo "<td>".$donnee["civilite_vip"]."</td>";
		echo "<td>".$donnee["date_naissance_vip"]."</td>";
		echo "<td>".$donnee["lieu_naissance_vip"]."</td>";
		echo "<td>".$donnee["statut_vip"]."</td>";
		echo '<td><a href="">Voir profil</a></td>';
		echo "</tr>";
	}
	?>
	</table>
</body>

<footer>

</footer>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Voicela | Affichage VIP</title>
	<link rel="stylesheet" type="text/css" href="assets/css/universal.css" />
    <link rel="stylesheet" type="text/css" href="assets/css/glyphicon.css" />
	<link rel="stylesheet" type="text/css" href="assets/css/affiche_vip/style_affiche.css" />

	<!-- Beginning of JavasScript-->
	<script src="./media/jquery-1.9.1.js"></script>
	<script src="./media/jquery.onepage-scroll.js"></script>
	<!-- End of JavasScript-->
</head>

<body>
	<?php include('vue/includes/header.php'); ?>
	<div class="full_wrapper">
		<h1>Affichage des VIP référencés</h1>

		<table id="table-ip">   
			<tr>
				<th>Nom VIP</th> 
				<th>Prénom usuel</th>
				<th>nationalité</th>
				<th>Sexe</th>
				<th>date_naissance</th>
				<th>lieu naissance</th>
				<th>statut</th>
			</tr>

		<?php
		$req=allVip(); //appelle fonction modèle
		while($donnee = $req->fetch()){
			echo "<tr>";
			echo "<td>".$donnee["nom_vip"]."</td>";
			echo "<td>".$donnee["prenom_usuel_vip"]."</td>";
			echo "<td>".$donnee["nationalite_vip"]."</td>";

			//affichage sexe
			if($donnee["civilite_vip"]== 'Mr'){
				echo "<td>Homme</td>";
			}
			elseif($donnee["civilite_vip"]=="Mme"){
				echo "<td>Femme</td>";
			}
			else {
				echo "<td>".$donnee["civilite_vip"]."</td>";
			}
			//affochage bon format date
			$date = new DateTime($donnee["date_naissance_vip"]);
			echo "<td>".date_format($date, 'd-m-Y')."</td>";

			echo "<td>".$donnee["lieu_naissance_vip"]."</td>";
			echo "<td>".$donnee["statut_vip"]."</td>";
			echo '<td><a href="">Voir profil</a></td>';
			echo "</tr>";
		}
		?>
		</table>
	</div>
</body>

<footer>

</footer>
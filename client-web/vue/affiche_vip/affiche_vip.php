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
    	<div class="second_wrapper">		
    		<h1>Affichage des VIP référencés</h1>
		<?php
		$req=allVip(); //appelle fonction modèle
		while($donnees = $req->fetch()){
			?> <div class="vip_found">
                    <div class="vip_found_profile_pic" style="background-image: url(<?php echo $donnees['chemin_photo']; ?>);"></div>
                    <div class="vip_found_profile_details"><a href="profile.php?id=<?php echo $donnees['num_vip']; ?>"><h3><?php echo utf8_encode($donnees['prenom_usuel_vip']); ?> <?php echo utf8_encode($donnees['nom_vip']);?></h3></a>
                    <p>
                        <?php 
                            if($donnees['statut_vip'] == 'Acteur' && $donnees['sexe_vip'] == 'Femme'){
                                echo 'Actrice';
                            }else{
                                echo utf8_encode($donnees['statut_vip']);
                            }
                        ?>
                    </p>
                    </div>
                </div>
                <?php
		}
		?>
		</div>
	</div>
</body>

<footer>

</footer>
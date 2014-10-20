<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Voicela | Affichage VIP</title>
	<link rel="stylesheet" type="text/css" href="assets/css/universal.css" />
    <link rel="stylesheet" type="text/css" href="assets/css/glyphicon.css" />
	<link rel="stylesheet" type="text/css" href="assets/css/picture/style_picture.css" />

	<!-- Beginning of JavasScript-->
	<script src="./assets/js/jquery-1.9.1.js"></script>
	<script src="./media/jquery.onepage-scroll.js"></script>
	<script type="text/javascript" src="./assets/js/picture/random.js"></script>
	<!-- End of JavasScript-->
</head>

<body>
	<?php include('vue/includes/header.php'); ?>

	<div class="full_wrapper">

		<h1>Photos récentes ajoutés</h1>
		<a class="random" href="./picture.php?r=1"><img id="imgRand" src="assets/images/picture/random.png"><span>Random</span></a>
		<div class="files-list-loading-overlay" style="display: none"></div>
		<div id="photos">
		<?php
		
		if(isset($_GET["r"]) && ($_GET["r"] == 1)) {//on est en random
			$nbPhotos= countPhotos();
			$arrayPhotos[]=0;
			$arrayId[]=0;
			$conv[]=0;
			$req = randomPhotos();
			$i=0;
			while($photo=$req->fetch()){
				$arrayPhotos[$i]=$photo["url_photo"];
				$arrayId[$i]=$photo["num_vip"];
				$i++;
			}
				//aléatoire
				$random=range(0, $nbPhotos-1);
				shuffle($random);
				foreach ($random as $pos) {
					echo '<a href="profile.php?id='.$arrayId[$pos].'">';
					echo '<img src="./files/photos/'.$arrayPhotos[$pos].'" class="photos"/>';
					echo '</a>';
				}
			
		}
		else{//en affiche du plus récent au moins récent

			while($photos = $req->fetch()){
			
				$urlPhotos = $photos["url_photo"];
				$idVIP= $photos["num_vip"];
				
				echo '<a href="profile.php?id='.$idVIP.'">';
				echo '<img src="./files/photos/'.$urlPhotos.'" class="photos"/>';
				echo '</a>';
			
			}
		}
		?>	
		</div>
	</div>
</body>

<footer>

</footer>
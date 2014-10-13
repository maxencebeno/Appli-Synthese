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
		<a class="random" href="picture.php?r=1">Random</a>
		<div class="files-list-loading-overlay" style="display: none"></div>
		<div id="photos">
		<?php
		
		if(isset($_GET["r"]) && ($_GET["r"] == 1)) {
			$nbPhotos= countPhotos();
			$arrayPhotos[]="hello";
			$arrayId[]=0;
			$req = randomPhotos();
			$i=0;
			while($photo=$req->fetch()){
				$arrayPhotos[$i]=$photo["url_photo"];
				$arrayId[$i]=$photo["num_vip"];
				$i++;
			}
			for($pos=$nbPhotos-1; $pos >=0; $pos-- ){
				$chance=floor(rand(0, $pos+1));
				$save=$arrayPhotos[$pos];
				$arrayPhotos[$pos]=$arrayPhotos[$chance];
				$arrayPhotos[$chance]=$save;

				echo '<a href="profile.php?id='.$arrayId[$pos].'">';
				echo '<img src="./files/'.$arrayPhotos[$pos].'" class="photos"/>';
				echo '</a>';
			

			}
		}
		else{

			while($photos = $req->fetch()){
			
				$urlPhotos = $photos["url_photo"];
				$idVIP= $photos["num_vip"];
				
				echo '<a href="profile.php?id='.$idVIP.'">';
				echo '<img src="./files/'.$urlPhotos.'" class="photos"/>';
				echo '</a>';
			
			}
		}
		?>	
		</div>
	</div>
</body>

<footer>

</footer>
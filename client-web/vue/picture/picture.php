<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Voicela | Photos des VIP</title>
	<link rel="stylesheet" type="text/css" href="assets/css/universal.css" />
    <link rel="stylesheet" type="text/css" href="assets/css/glyphicon.css" />
	<link rel="stylesheet" type="text/css" href="assets/css/picture/style_picture.css" />

	<script src="./assets/js/jquery-1.9.1.js"></script>
	<script type="text/javascript" src="./assets/js/picture/random.js"></script>
</head>

<body>
	<?php include('vue/includes/header.php'); ?>

	<div class="full_wrapper">
            <div class="wrapper">
		<h1>Derniers snaps</h1>
		<a class="random" href="./picture.php?r=1"><img id="imgRand" src="assets/images/picture/random.png"><span>Random</span></a>
		
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
                                    echo '<div class="pic_container">';
                                    echo '<a href="profile.php?id='.$arrayId[$pos].'">';
                                    echo '<img src="./files/'.$arrayPhotos[$pos].'" class="photos"/>';
				    echo '</a>';
                                    echo '</div>';
				}
			
		}
		else{//en affiche du plus récent au moins récent

			while($photos = $req->fetch()){
			
				$urlPhotos = $photos["url_photo"];
				$idVIP= $photos["num_vip"];
				echo '<div class="pic_container">';
				echo '<a href="profile.php?id='.$idVIP.'">';
				echo '<img src="./files/'.$urlPhotos.'" class="photos" alt />';
				echo '</a>';
                                echo '</div>';
			
			}
		}
		?>	
		</div>
            </div>
	</div>
</body>

<footer>

</footer>
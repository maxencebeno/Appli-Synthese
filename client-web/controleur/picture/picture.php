<?php
include_once('modele/connexion.php');
include_once('modele/picture/picture.php');


//on récup les photos
$req=allPhotos();
include_once('vue/picture/picture.php');
?>

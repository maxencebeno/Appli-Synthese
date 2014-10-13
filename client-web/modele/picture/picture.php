<?php
function allPhotos() {
	$bdd = connexion();
	$req = $bdd->query("SELECT * from photos");

	return $req;
}

function countPhotos() {
	$bdd = connexion();
	$req = $bdd->query("SELECT count(*) as c from photos");

	if($count=$req->fetch()){
		return $count['c'];
	}
}

function randomPhotos() {
	$bdd = connexion();
	$req = $bdd->query("SELECT * from photos");

	return $req;
	
}

?>
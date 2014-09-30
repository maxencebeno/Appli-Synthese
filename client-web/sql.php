<?php
include_once("modele\connexion.php");

$bdd = connexion();
$req = $bdd->query("SELECT * from vip");

while($donnee = $req->fetch()){
	echo "nomvip :".$donnee["nom_vip"] ;
}

?>
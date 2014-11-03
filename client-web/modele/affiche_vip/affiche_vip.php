<?php
function allVip() {
	$bdd = connexion();
	$req = $bdd->query("SELECT * from vip");

	return $req;
}
?>
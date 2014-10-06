<?php 
function connexion(){	
		$host='iutdoua-webetu.univ-lyon1.fr';
		$user='p1201896';
		$password='169657';
		$basename='p1201896';
		
		try
		{
    // On se connecte à MySQL
  		  $bdd = new PDO('mysql:host='.$host.';dbname='.$basename, $user, $password);
		}
		catch(Exception $e)
		{
    // En cas d'erreur, on affiche un message et on arrête tout
        //die('Erreur : '.$e->getMessage());
		echo"erreur";
		}

		return $bdd;
}
?>
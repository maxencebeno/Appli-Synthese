<?php

// Fonction qui retourne les infos sur UN SEUL vip.
function getAllFilms(){
    // BDD !
    $bdd = connexion();

    $req = $bdd->query('SELECT * FROM films');
    // On retourne le VIP.
    return $req;
}


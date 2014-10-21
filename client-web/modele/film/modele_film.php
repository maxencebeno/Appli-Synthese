<?php

// Fonction qui retourne les infos sur UN SEUL vip.
function getAllFilms(){
    // BDD !
    $bdd = connexion();

    $req = $bdd->query('SELECT * FROM films');
    // On retourne le VIP.
    return $req;
}

function getFilm($id){
    $bdd= connexion();
    $req = $bdd->prepare('SELECT * FROM films WHERE id_film = ?');
    $req->execute(array($id));

    return $req;
}
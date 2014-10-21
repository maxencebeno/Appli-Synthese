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

function getRealisateur($idFilm){
    $bdd = connexion();
    $req = $bdd->prepare('SELECT * FROM casting WHERE id_film = ? AND realisateur = "1"');
    $req->execute(array($idFilm));

    return $req;
}

function getActeurs($idFilm){
    $bdd = connexion();
    $req = $bdd->prepare('SELECT * FROM casting WHERE id_film = ? AND acteur = "1"');
    $req->execute(array($idFilm));

    return $req;
}

function getInfoVip($idVip){
    $bdd = connexion();
    $req = $bdd->prepare('SELECT * FROM vip WHERE num_vip = ?');
    $req->execute(array($idVip));

    return $req;
}
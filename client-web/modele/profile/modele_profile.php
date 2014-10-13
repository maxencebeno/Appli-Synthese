<?php

// Fonction qui retourne les infos sur UN SEUL vip.
function getOneVIP($id){
    // BDD !
    $bdd = connexion();

    $req = $bdd->prepare('SELECT * FROM vip WHERE num_vip = ?');
    $req->execute(array(
        $_GET['id']
    ));

    // On retourne le VIP.
    return $req;
}
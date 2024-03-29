<?php

// Fonction qui retourne les infos sur UN SEUL vip.
function getOneVIP($id){
    // BDD !
    $bdd = connexion();

    $req = $bdd->prepare('SELECT * FROM vip WHERE num_vip = ?');
    $req->execute(array($_GET['id']));

    // On retourne le VIP.
    return $req;
}


// Fonction qui retourne si un VIP passé en paramètre est marié. Si non, retourne "none", si oui retourne le lien vers le VIP conjoint.
function getMariageVIP($id_vip){
    // BDD !
    $bdd = connexion();

    $req = $bdd->prepare('SELECT * FROM mariage WHERE (num_vip1 = ? OR num_vip2 = ?) AND divorce = 0');
    $req->execute(array($id_vip, $id_vip));

    if($donnees = $req->fetch()){
        if($donnees['num_vip1'] != $id_vip){
            $id_a_chercher = $donnees['num_vip1'];
        }
        else{
            $id_a_chercher = $donnees['num_vip2'];
        }
        $req->closeCursor();
        
        $req2 = $bdd->prepare('SELECT * FROM vip WHERE num_vip = ?');
        $req2->execute(array($id_a_chercher));
        
        // On retourne
        if($donnees = $req2->fetch()){
            $nom_complet = utf8_encode($donnees['prenom_usuel_vip']).' '.utf8_encode($donnees['nom_vip']);
            return '<a href="profile.php?id='.$donnees['num_vip'].'">'.$nom_complet.'</a>';
        }
    }
    else{
        // On retourne 'none' si pas de résultat
        return 'none';
    }
}

// Fonction qui retourne toutes les images liées à un ID de VIP passé en entrée
function getAllimages($id_vip){
    // BDD !
    $bdd = connexion();

    $req = $bdd->prepare('SELECT * FROM photos WHERE num_vip = ?');
    $req->execute(array($id_vip));

    // On retourne les images.
    return $req;
}

// Fonction qui retourne tous les films associés à un VIP.
function getFilmOfVIP($id_vip){
    $bdd= connexion();
    $req = $bdd->prepare('SELECT * FROM films, casting WHERE casting.id_film = films.id_film AND casting.num_vip = ?');
    $req->execute(array($id_vip));

    return $req;
}

//fonction récup anciens mariages
function getAnMariageVIP($id_vip){
    // BDD !

    $divorce = null;
    $plus = 0;
    $bdd = connexion();

    $req = $bdd->prepare('SELECT * FROM mariage WHERE num_vip1 = ? AND divorce = 1');
    $req->execute(array($id_vip));

    while($donnees = $req->fetch()){
        if($donnees['num_vip1'] != $id_vip){
            $id_a_chercher = $donnees['num_vip1'];
        }
        else{
            $id_a_chercher = $donnees['num_vip2'];
        }
        
        
        $req2 = $bdd->prepare('SELECT * FROM vip WHERE num_vip = ?');
        $req2->execute(array($id_a_chercher));
        
        // On retourne
        if($donnees1 = $req2->fetch()){
            if($plus > 0) {
                $divorce = $divorce.', ';
            }
            $date = new DateTime($donnees['date_divorce']);
            $nom_complet = utf8_encode($donnees1['prenom_usuel_vip']).' '.utf8_encode($donnees1['nom_vip']);
            $divorce = $divorce.'<a href="profile.php?id='.$donnees1["num_vip"].'">'.$nom_complet.'</a> (le '.date_format($date, "d-m-Y").')';
        }
        $plus++;
    }
    $req->closeCursor();
    if($divorce != null){
        return $divorce;
    }else{
        return 'none';
    }
}
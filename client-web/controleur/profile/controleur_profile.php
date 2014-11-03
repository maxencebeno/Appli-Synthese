<?php
include_once('modele/connexion.php');
include_once('modele/profile/modele_profile.php');

if(isset($_GET['id']) AND $_GET['id'] != ""){
    $req = getOneVIP($_GET['id']);
    $resultat_vide = true;

    if($donnees = $req->fetch()){
        // Assignation des valeurs aux variables pour la vue
        $num_vip = $donnees['num_vip'];
        $nom_vip = $donnees['nom_vip'];
        $prenom_vip = $donnees['prenom_usuel_vip'];
        $prenoms_vip = $donnees['prenoms_vip'];
        $nationalité_vip = $donnees['nationalite_vip'];
        $date_naissance_vip = $donnees['date_naissance_vip'];
        $lieu_naissance_vip = $donnees['lieu_naissance_vip'];
        $statut_vip = $donnees['statut_vip'];
        $nb_enfants_vip = $donnees['nb_enfants'];
        $sexe_vip = $donnees['sexe_vip'];
        $chemin_photo_vip = $donnees['chemin_photo'];
        
        // On a un résultat ! Donc on passe le booléen à false.
        $resultat_vide = false;
    }

    // On vérifie si le VIP est marié. Si oui, on retourne son nom sinon on retourne "none"
    $vip_marie = getMariageVIP($num_vip);
    //divorces
    $div_vip = getAnMariageVIP($num_vip);
    
    // Si pas de résultat, on redirige vers 404 error
    if($resultat_vide == true){
        header('Location: search-home.php');
    }
}else{
    header('Location: search-home.php');
}

// On inclut la vue !
include_once('vue/profile/vue_profile.php');
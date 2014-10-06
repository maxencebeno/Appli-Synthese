<?php
$bdd = connexion();

function searchVIP($q){
    $query = htmlspecialchars($q);
    $query = trim($query, " \t.");

    if(strlen($query) > 0){
        $resultat_vide = true;
        // On analyse la requête: si elle comporte plusieurs mots, elle nécessite un traitement pour séparer les mots afin d'avoir une recherche plus précise !
        $query=preg_replace('/\s\s+/', ' ', $query); 
        $tableau_mots_cles = explode(' ' , $query);
        $nb_elem=count($tableau_mots_cles); 

        // On va incrémenter une requête sous forme de chaine de caractère pour incrémenter avec tous les mots clés
        $requete = 'SELECT * FROM vip WHERE nom_vip LIKE "%'.$tableau_mots_cles[0].'%" ';
        for($i=1 ; $i<$nb_elem; $i++) {
            $requete.='OR (nom_vip LIKE "%'.$tableau_mots_cles[$i].'%")';
        } 
        $requete .= 'ORDER BY nom_vip';
        
        // Return la requête
        return $bdd->query($requete);
    }
} // Fin de la fonction searchVIP()
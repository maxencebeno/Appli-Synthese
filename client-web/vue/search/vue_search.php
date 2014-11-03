<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <link rel="stylesheet" type="text/css" href="assets/css/universal.css" />
        <link rel="stylesheet" type="text/css" href="assets/css/search/style_search.css" />
        <link rel="stylesheet" type="text/css" href="assets/css/film/style_film.css" />
        <link rel="stylesheet" type="text/css" href="assets/css/glyphicon.css" />
        <title>Recherche - Voicela</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js"></script>
    </head>

    <body>
        <?php include('vue/includes/header.php'); ?>
        <div class="full_wrapper">
            <div class="second_wrapper">
                <?php
                if(isset($_GET['q']) AND $_GET['q'] != ""){
                    $req = searchVIP($_GET['q']);
                    $reqfilm = searchFilm($_GET['q']);
                    $resultat_vide = true;
                    
                    ?>
                    <div class="container">
                    <button id="switch">Voir le résultats pour les Films</button>
                    </div>

                    <div id="vip_list" class="list">
                        <h2>Resultats de recherche pour les VIPs</h2>
                    <?php
                    // On affiche tous les VIP trouvés enfin !
                    while($donnees = $req->fetch()){?>
                        <div class="vip_found">
                            <div class="vip_found_profile_pic" style="background-image: url(<?php echo $donnees['chemin_photo']; ?>);"></div>
                            <div class="vip_found_profile_details"><a href="profile.php?id=<?php echo $donnees['num_vip']; ?>"><h3><?php echo utf8_encode($donnees['prenom_usuel_vip']); ?> <?php echo utf8_encode($donnees['nom_vip']);?></h3></a>
                            <p id="info">
                                <?php 
                                if($donnees['statut_vip'] == 'Acteur' && $donnees['sexe_vip'] == 'Femme'){
                                    echo 'Actrice';
                                }else{
                                    echo $donnees['statut_vip'];
                                }
                                ?>
                            </p>
                            </div>
                        </div>
                        <?php
                        $resultat_vide = false;
                    }
                    if($resultat_vide == true){
                        echo '<div id="no_result">
                        <p>Aucun résultat ne correspond aux termes de recherche spécifiés (<strong>'.$_GET['q'].'</strong>).<br /><br />
                        Suggestions :</p>
                        <ul>
                            <li>Le VIP que vous cherchez n\'existe pas encore dans notre base de données.</li>
                            <li>Vérifiez l’orthographe des termes de recherche.</li>
                            <li>Essayez d\'autres mots.</li>
                            <li>Utilisez des mots clés plus généraux.</li>
                        </ul>
                        </div>';
                    }
                    ?></div>

                    <div id="film_list" class="list" style="display: none">
                    <h2>Resultat de recherche pour les films</h2>
                    <?php
                     while($donnees2 = $reqfilm->fetch()){?>
                        <div class="vip_found" id="film_<?php echo $donnees2['id_film']; ?>">
                            <div class="vip_found_profile_pic" style="background-image: url(files/films/<?php echo $donnees2['url_photo']; ?>);"></div>
                            <div class="vip_found_profile_details"><a onClick="affichePres(<?php echo $donnees2['id_film'];?>);"><h3><?php echo utf8_encode($donnees2['titre_film']); ?></h3></a>
                            <p id="info">
                                <?php 
                                    echo utf8_encode($donnees2['genre']);
                                ?>
                            </p>
                            </div>
                        </div>
                        <?php
                        $resultat_vide = false;
                    }
                    if($resultat_vide == true){
                        echo '<div id="no_result">
                        <p>Aucun résultat ne correspond aux termes de recherche spécifiés (<strong>'.$_GET['q'].'</strong>).<br /><br />
                        Suggestions :</p>
                        <ul>
                            <li>Le film que vous cherchez n\'existe pas encore dans notre base de données.</li>
                            <li>Vérifiez l’orthographe des termes de recherche.</li>
                            <li>Essayez d\'autres mots.</li>
                            <li>Utilisez des mots clés plus généraux.</li>
                        </ul>
                        </div>';
                    }

                    ?></div><?php
                    
                    // Si pas de résultat, on affiche le message d'erreur.
                   
                }else{
                    header('Location: search-home.php');
                }
                ?>
            </div>
            <div class="desc" id="desc" style="display:none;">
        </div>
        <script src="assets/js/core.js"></script>
        <script src="assets/js/parallax.js"></script>
        <script src="assets/js/search/search.js"></script>
        <script type="text/javascript"> 
            $(document).ready(function(){       
                $('#section_one').parallax("center", 0, 0.1, true);
            });
        </script>
    </body>
</html>
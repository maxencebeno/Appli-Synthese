<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <link rel="stylesheet" type="text/css" href="assets/css/universal.css" />
        <link rel="stylesheet" type="text/css" href="assets/css/search/style_search.css" />
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
                    $resultat_vide = true;
                    
                    // On affiche tous les VIP trouvés enfin !
                    while($donnees = $req->fetch()){?>
                        <div class="vip_found">
                            <div class="vip_found_profile_pic" style="background-image: url(<?php echo $donnees['chemin_photo']; ?>);"></div>
                            <div class="vip_found_profile_details"><a href="profile.php?id=<?php echo $donnees['num_vip']; ?>"><h3><?php echo $donnees['prenom_usuel_vip']; ?> <?php echo $donnees['nom_vip'];?></h3></a>
                            <p>
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
                    
                    // Si pas de résultat, on affiche le message d'erreur.
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
                }else{
                    header('Location: search-home.php');
                }
                ?>
            </div>
        </div>
        <script src="assets/js/core.js"></script>
        <script src="assets/js/parallax.js"></script>
        <script type="text/javascript"> 
            $(document).ready(function(){       
                $('#section_one').parallax("center", 0, 0.1, true);
            });
        </script>
    </body>
</html>
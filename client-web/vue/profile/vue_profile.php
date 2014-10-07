<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <link rel="stylesheet" type="text/css" href="assets/css/universal.css" />
        <link rel="stylesheet" type="text/css" href="assets/css/profile/style_profile.css" />
        <link rel="stylesheet" type="text/css" href="assets/css/glyphicon.css" />
        <title>Profil VIP - Voicela</title>
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
                    while($donnees = $req->fetch()){
                        echo '<div class="search_films">'.$donnees['prenom_usuel_vip'].' '.$donnees['nom_vip'].'</div>';
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
                    header('Location: search_error.php');
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
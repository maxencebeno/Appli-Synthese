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
            <?php
            if(isset($_GET['q'])){
                $req = searchVIP($_GET['q']);
                
                // On affiche tous les VIP trouvés enfin !
                while($donnees = $req->fetch()){
                    echo '<div class="search_films">'.$donnees['prenom_usuel_vip'].' '.$donnees['nom_vip'].
                    
                    '</div>';
                    $resultat_vide = false; // On passe la variable à false pour ne pas afficher de message d'erreur car on a des résultats !
                }
                
                if($resultat_vide){
                    echo '<div id="no_result">
                    <p>Aucun document ne correspond aux termes de recherche spécifiés (<strong>'.$query.'</strong>).<br /><br />
                    Suggestions :</p>
                    <ul>
                        <li>Le film que vous cherchez n\'existe pas dans notre base de données.</li>
                        <li>Vérifiez l’orthographe des termes de recherche.</li>
                        <li>Essayez d\'autres mots.</li>
                        <li>Utilisez des mots clés plus généraux.</li>
                    </ul>
                    </div>';
                }
            }else{
                echo "Aucune variable passée en paramètre.";
            }
            ?>
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
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
                 if(isset($_GET['id']) AND $_GET['id'] != ""){
                    $req = getOneVIP($_GET['id']);
                    $resultat_vide = true;
                    
                    // On affiche tous les VIP trouvés enfin !
                    if($donnees = $req->fetch()){?>
                        <div class="vip_found">
                            <?php echo $donnees['nom_vip'] ; ?>
                        </div>
                        <?php
                        $resultat_vide = false;
                    }
                    
                    // Si pas de résultat, on affiche le message d'erreur.
                    if($resultat_vide == true){
                        echo '<div id="no_result">
                        <p>Aucun résultat ne correspond à votre requête.<br /><br />
                        </div>';
                    }
                }else{
                    header('Location: ghost.php');
                }
                ?>
            </div>
        </div>
        <script src="assets/js/core.js"></script>
    </body>
</html>
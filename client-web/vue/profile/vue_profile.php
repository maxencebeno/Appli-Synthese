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
            <div class="bandeau1">
                <div class="container">
                    <div id="profile_pic" style="background-image: url(<?php echo $chemin_photo_vip; ?>);"></div>
                    
                    <div id="bio">
                        <h3><?php echo $prenom_vip; ?> <?php echo $nom_vip; ?></h3>
                        <p><?php echo $statut_vip; ?>, <?php echo $nationalité_vip; ?></p>
                        <p>Née le <?php $date = new DateTime($date_naissance_vip);echo date_format($date, 'd-m-Y'); ?> à <?php echo $lieu_naissance_vip; ?>.</p>
                        
                        <?php 
                        if($nb_enfants_vip > 0){
                            if($nb_enfants_vip == 1){
                                echo '<p>1 enfant</p>';
                            }else{
                                echo '<p>'.$nb_enfants_vip.' enfants</p>';
                            }
                        }
                        ?>
                        
                        <?php
                        if($vip_marie != 'none'){
                            echo '<p>Actuellement marié avec '.$vip_marie.'.</p>'; 
                        }else{
                            '<p>Célibataire.</p>';
                        }
                        ?>
                    </div>
                </div>
            </div>
        </div>
        <script src="assets/js/core.js"></script>
    </body>
</html>
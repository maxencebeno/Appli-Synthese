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
                        <p><?php 
                                if($donnees['statut_vip'] == 'Acteur' && $donnees['sexe_vip'] == 'Femme'){
                                    echo 'Actrice';
                                }else if($donnees['statut_vip'] == 'Acteur' && $donnees['sexe_vip'] == 'Homme'){
                                    echo $donnees['statut_vip'];
                                }
                                
                                else{
                                    echo $donnees['statut_vip'];
                                }
                                ?>, <?php echo $nationalité_vip.'.'; ?></p>
                        <p><?php if($sexe_vip == 'Femme'){echo 'Née';}else{echo 'Né';}?> le <?php $date = new DateTime($date_naissance_vip);echo date_format($date, 'd-m-Y'); ?> à <?php echo $lieu_naissance_vip; ?>.</p>
                        
                        <?php 
                        if($nb_enfants_vip > 0){
                            if($nb_enfants_vip == 1){
                                echo '<p>1 enfant</p>';
                            }else{
                                echo '<p>'.$nb_enfants_vip.' enfants</p>';
                            }
                        }else{
                            echo '<p>Pas d\'enfants connus.</p>';
                        }
                        ?>
                        
                        <?php
                        if($sexe_vip == 'Femme'){
                            $mot_marie = 'mariée';
                        }else{
                             $mot_marie = 'marié';
                        }
                        
                        if($vip_marie != 'none'){
                            echo '<p>Actuellement '.$mot_marie.' avec '.$vip_marie.'.</p>';
                        }
                        else{
                            echo '<p>Pas encore '.$mot_marie.'.</p>';
                        }
                        ?>
                    </div>
                </div>
            </div>
            <div class="bandeau_2">
                <div class="container">
                    <button id="switch">Voir sa filmographie</button></div>
                <div id="images_list" class="list">
                    <h2>Dernières photos</h2>
                    <?php
                    $reqVip = getAllImages($num_vip);
                    if($donnees = $reqVip->fetch()){
                        while($donnees = $reqVip->fetch()){
                        ?>
                            <span class="add_the_x">Ajoutée le : <?php echo $donnees['date_ajout_photo']; ?></span>
                            <img src="files/<?php echo $donnees['url_photo'];?>" title="<?php echo $prenom_vip.' '.$nom_vip; ?>" alt />
                        <?php
                        }
                    }else{
                        echo '<p>Aucune image à montrer</p>';
                    }
                    ?>
                </div>
                <div id="films_list" class="list" style="display: none">
                    <h2>Filmographie</h2>
                    <?php
                        $films_list_vip = getFilmOfVIP($num_vip);
                        while($donnees2 = $films_list_vip->fetch()){
                        ?>
                        <div class="film_box">
                            <div class="cover_film" style="background-image: url(files/films/<?php echo $donnees2['url_photo']; ?>)"></div>
                            <div class="infos_films">
                                <p><?php echo $donnees2['titre_film']; ?></p>
                                <p><?php echo $donnees2['date_sortie']; ?></p>
                                <p><?php echo $donnees2['genre']; ?></p>
                                <p class="see_film"><a href="film_desc.php?id=<?php echo $donnees2['id_film']; ?>">Voir ce film</a></p>
                            </div>
                        </div>
                        <?php
                        }
                    ?>
                </div>
            </div>
        </div>
        <script src="assets/js/core.js"></script>
        <script src="assets/js/profile/switch.js"></script>
    </body>
</html>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <link rel="stylesheet" type="text/css" href="assets/css/universal.css" />
        <link rel="stylesheet" type="text/css" href="assets/css/index/style_index.css" />
        <link rel="stylesheet" type="text/css" href="assets/css/glyphicon.css" />
        <title>Voicela</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js"></script>
    </head>

    <body>
        <?php include('vue/includes/header.php'); ?>
        <div class="full_wrapper">
            <section id="section_one">
                <div class="section_content">
                    <a href="film.php?id=24"><h1>Découvrez <i>Fury</i>, le nouveau joyau de David Ayer.</h1></a>
                </div>
            </section>
            
            <section style="height: 800px;margin:auto;width: 1000px;padding-top: 50px;">
                <h2>Derniers VIP ajoutés</h2>
                <?php 
                $bdd = connexion();
                $nbResultat = 0;
                
                $req = $bdd->query('SELECT * FROM vip ORDER BY num_vip DESC');
                
                    while($donnees = $req->fetch()){
                        if($nbResultat < 4){
                            echo '<div class="last-vip" title="'.$donnees['prenom_usuel_vip'].' '.$donnees['nom_vip'].'" style="background-image: url('.$donnees['chemin_photo'].')"></div>';
                            $nbResultat++;
                        }
                    }
                ?>
                
                <h2 style="margin-top: 40px;">Derniers films ajoutés</h2>
                <?php 
                $bdd2 = connexion();
                $nbResultat2 = 0;
                
                $req2 = $bdd2->query('SELECT * FROM films ORDER BY id_film DESC');
                
                    while($donnees2 = $req2->fetch()){
                        if($nbResultat2 < 4){
                            echo '<div class="last-vip" title="'.$donnees2['titre_film'].'" style="background-image: url(files/films/'.$donnees2['url_photo'].')"></div>';
                            $nbResultat2++;
                        }
                    }
                ?>
            </section>
            

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
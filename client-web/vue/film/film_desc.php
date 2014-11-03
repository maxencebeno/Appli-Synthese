
    <div class="general">
        <span id="off" onClick="fermer();"><i class="glyphicon glyphicon-remove"></i></span>
    <?php
    

    if(isset($_GET["id"]) && $_GET["id"] != null){

        $req = getFilm($_GET['id']);
        if($film = $req->fetch()){

            $id_film = $film["id_film"];
            $titre_film = utf8_encode($film["titre_film"]);
            $date_sortie =  date_create($film["date_sortie"]);
            $anneeSortie = date_format($date_sortie, "Y");
            $moisSortie = date_format($date_sortie, "m");
            $jourSortie = date_format($date_sortie, "d");
            $genre = utf8_encode($film["genre"]);
            $num_visa = $film["num_visa"];
            $photo = $film["url_photo"];


            echo'<div class="film_desc">';

            echo '<div class="pres" id="pres" >';
            echo '<div class="img_film" id="img_container" style="background-image: url(files/films/'.$photo.')"/><br/>';
            echo '<span class="info_film">
                    <h2>'.$titre_film.'</h2><br/>
                    <p id="sousTitre">
                     <strong>Sorti le :</strong> '.$jourSortie.'/'.$moisSortie.'/'.$anneeSortie.'<br />
                     <strong>Genre :</strong> '.$genre.'<br />
                     <strong>Visa D\'exploitation :</strong> '.$num_visa.' 
                    </p>';
                 

            echo '<h3>Réalisateur</h3>';
            $reqRea = getRealisateur($id_film);
            $result_ok = false;
            while($reali = $reqRea->fetch()){
                $reqInfoRea= getInfoVip($reali['num_vip']);
                if($vip=$reqInfoRea->fetch()){
                    echo '<a href="profile.php?id='.$vip["num_vip"].'">'.utf8_encode($vip['nom_vip']). ' '. utf8_encode($vip['prenom_usuel_vip']).'</a><br/>'; 
                }
                $result_ok = true;
            }
            if($result_ok == false) {
                echo 'Non renseigné';
            }

            echo '<h3>Acteurs</h3>';
            $reqAct = getActeurs($id_film);//récupérer acteur du film couranr
            $acteur = $reqAct->fetchAll();
            if (count($acteur) == 0) {//si pas d'acteur
                echo 'Non renseigné';
            } else {
                foreach ($acteur as $ligne) {//sinon
                    $reqInfoAct= getInfoVip($ligne['num_vip']);//on récupère les nfo du VIP acteur
                    if($vip=$reqInfoAct->fetch()){//si on a les infos
                    echo '<a href="profile.php?id='.$vip["num_vip"].'">'.utf8_encode($vip["nom_vip"]). ' '. utf8_encode($vip["prenom_usuel_vip"]).'</a><br/>'; //echo les infos 
                    }
                }
            }

            echo '</span>';
            echo '</div>';



        }


    }


    ?>

    </div>

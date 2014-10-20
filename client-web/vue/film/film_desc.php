<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <link rel="stylesheet" type="text/css" href="assets/css/universal.css" />
        <link rel="stylesheet" type="text/css" href="assets/css/film/style_film.css" />
        <link rel="stylesheet" type="text/css" href="assets/css/glyphicon.css" />
        <title>Films - Voicela</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js"></script>
        
    </head>

    <body>
    <div class="general">

        <p id="off" onClick="fermer();">fermer</p>
    <?php
    

    if(isset($_GET["id"]) && $_GET["id"] != null){

        $req = getFilm($_GET['id']);
        if($film = $req->fetch()){

            $id_film = $film["id_film"];
            $titre_film = $film["titre_film"];
            $date_sortie =  date_create($film["date_sortie"]);
            $date = date_format($date_sortie, "Y");
            $genre = $film["genre"];
            $num_visa = $film["num_visa"];
            $photo = $film["url_photo"];


            echo'<div class="film_desc">';

            echo '<div class="pres" id="pres" >';
            echo '<img class="img_film" id="img_container" src="files/films/'.$photo.'"/><br/>';
            echo '<span class="info_film">
                    <h2>'.$titre_film.'</h2><br/>
                    <p id="sousTitre">'.$date.'
                     - '.$genre.'
                     - Visa D\'exploitation : '.$num_visa.' 
                    </p>
                 </span>';


            echo '</div>';



        }


    }


    ?>

    </div>
    <script src="assets/js/film/film.js"></script>
    </body>
</html>
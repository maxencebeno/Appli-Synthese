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
        <?php include('vue/includes/header.php'); ?>
        <div class="full_wrapper">
        <h1>Films</h1>

        <div class="film_wrapper">

        <?php
        while($films= $reqFilms->fetch()){
            $id_film = $films["id_film"];
            $titre_film = $films["titre_film"];
            $date_sortie = $films["date_sortie"];
            $genre = $films["genre"];
            $num_visa = $films["num_visa"];
            $photo = $films["url_photo"];

            echo'<div class="films_container">';

            echo '<div class="pres">';
            echo '<img class="img_container" src="files/films/'.$photo.'"/><br/>';
            echo '<p class="info">
                    '.$titre_film.'<br/>
                    '.$date_sortie.'
                     - '.$genre.'
                 </p>';


            echo '</div>';

            echo '<div class="desc">';




            echo '</div>';
            echo '</div>';
            


        }


        ?>


        </div>


        </div>

    </body>
</html>
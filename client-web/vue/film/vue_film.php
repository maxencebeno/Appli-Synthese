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

    <body class="body">
        <?php include('vue/includes/header.php'); ?>
        <div class="full_wrapper">
        <div class="film_wrapper">
        <h1>Tous nos films</h1>
        <?php
        while($films= $reqFilms->fetch()){
            $id_film = $films["id_film"];
            $titre_film = $films["titre_film"];
            $date_sortie =  date_create($films["date_sortie"]);
            $date = date_format($date_sortie, "Y");
            $genre = $films["genre"];
            $num_visa = $films["num_visa"];
            $photo = $films["url_photo"];

            echo'<div class="films_container">';

            echo '<div class="pres" id="pres" onClick="affichePres('.$id_film.');" >';
            echo '<div class="img_container" style="background-image:url(files/films/'.$photo.')"></div><br/>';
            echo '<div class="info">
                    '.$titre_film.'<br/>
                    '.$date.'
                     - '.$genre.'
                 </div>';
            echo '</div>';
            echo '</div>';
            


        }


        ?>
        <div class="desc" id="desc" style="display:none;">



        </div>


        </div>


        </div>
        <script src="assets/js/film/film.js"></script>
    </body>
</html>
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
            <section style="height: 800px;">
                <h1><!--Utiliser les onglets de navigation ou recherchez un VIP grâce à notre moteur de recherche.--></h1>
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
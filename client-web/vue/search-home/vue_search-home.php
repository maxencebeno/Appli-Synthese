<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <link rel="stylesheet" type="text/css" href="assets/css/universal.css" />
        <link rel="stylesheet" type="text/css" href="assets/css/search-home/style_search-home.css" />
        <link rel="stylesheet" type="text/css" href="assets/css/glyphicon.css" />
        <title>Recherche Voicela</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js"></script>
    </head>

    <body>
        <?php include('vue/includes/header.php'); ?>
        <div class="full_wrapper">
            <div class="second_wrapper">
                <div id="search_box">
                    <h1>Recherche sur Voicela</h1>
                    <form action="search.php" method="GET" id="error_search_form">
                        <input type="text" name="q" id="q_error" spellcheck="false" autocomplete="off" placeholder="Recherchez sur Voicela" />
                        <input type="submit" value="Rechercher" id="error_search_submit" />
                    </form>
                </div>
            </div>
        </div>
        <script src="assets/js/core.js"></script>
        <script>$('#general_search_form').hide();</script>
    </body>
</html>
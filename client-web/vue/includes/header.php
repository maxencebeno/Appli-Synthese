<header class="general_header">
    <div id="header_container">
        <ul>
            <li style="padding-left: 0!important"><a href="index.php" class="glyphicon glyphicon-home"><span style="margin-left: 10px">Voicela</span></a></li>
            <li><a href="affiche_vip.php" class="glyphicon glyphicon-user"><span style="margin-left: 10px">Afficher les VIP</span></a></li>
            <li><a href="picture.php" class="glyphicon glyphicon-picture"><span style="margin-left: 10px">Photos de VIP</span></a></li>
            <li><a href="film.php" class="glyphicon glyphicon-film"><span style="margin-left: 10px">Films</span></a></li>
        </ul>

        <form action="search.php" method="GET" id="general_search_form">
            <input type="text" name="q" id="q" spellcheck="false" autocomplete="off" placeholder="Recherchez sur Voicela" <?php if(isset($_GET['q'])){echo 'value="'.htmlspecialchars($_GET['q']).'"';} ?>/>
            <input type="submit" value="" id="general_search_submit" />
        </form>
    </div>
</header>
<?php
include_once('modele/connexion.php');
include_once('modele/film/modele_film.php');

$reqFilms = getAllFilms();


// On inclut la vue !
include_once('vue/film/vue_film.php');
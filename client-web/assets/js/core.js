// Change doucement la couleur de background de la barre de recherche quand elle est active
$('#q').focus(function(e){
    $('#general_search_form').css('background-color', '#66757f');
});

$('#q').blur(function(e){
    $('#general_search_form').css('background-color', '#a3acb2');
});

// Empêche la recherche d'être lancée si elle est vide
$('#general_search_form').submit(function(e){
    var input = $('#q').val();
    if(input.length == 0){
        e.preventDefault();
        return false;
    }
});
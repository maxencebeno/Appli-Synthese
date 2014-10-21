var opened = 'images';

$('#switch').click(function(){
    if(opened === 'images'){
        $('#images_list').css('display', 'none');
        $('#films_list').fadeIn(500);
        $('#switch').html('Voir les dernières photos associées');
        
        opened = 'films';
    }else{
        $('#films_list').css('display', 'none');
        $('#images_list').fadeIn(500);
        $('#switch').html('Voir sa filmographie');
        
        opened = 'images';
    }
});

function affichePres(id){

    var desc = document.getElementById("desc");
    
     //Effet fade-in du fond opaque
    $('body').append('<div id="fade"></div>');
    $('#fade').css({'filter' : 'alpha(opacity=80)'}).fadeIn();

    $('#desc').load('film_desc.php?id='+ id+'');
    desc.style.display = "";
    
    $('html, body').css({
        'overflow': 'hidden',
        'height': '100%'
        });
    $('html, body').animate({
    scrollTop: $('#film_'+id).offset().top
    }, 2000);
}

function fermer(){

    var desc = document.getElementById("desc");
    desc.style.display = "none";
    $('#desc').load('film_desc.php');
    $('#fade').fadeOut(function() {
        $('#fade').remove();  //...ils disparaissent ensemble
    });

    $('html, body').css({
    'overflow': 'auto',
    'height': 'auto'
    })
}
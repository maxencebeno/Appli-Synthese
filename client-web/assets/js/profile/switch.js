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
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
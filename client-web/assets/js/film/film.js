function affichePres(id){

	var desc = document.getElementById("desc");

	desc.style.display = "";
	 $('#desc').load('film_desc.php?id='+ id+'');

	 //Effet fade-in du fond opaque
	$('body').append('<div id="fade"></div>');
	$('#fade').css({'filter' : 'alpha(opacity=80)'}).fadeIn();
	$('html, body').css({
    'overflow': 'hidden',
    'height': '100%'
	})
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
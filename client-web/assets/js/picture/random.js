$(document).ready(function(){
$(document).on('click', "a.random", function (e) {
        e.preventDefault();

        page = $(this).attr("href");
        $('.files-list-loading-overlay').show();
        $.ajax ({
            url: page,
            cache: false,
            error: function(XMLHttpRequest, textStatus, errorThrown){
                alert(textStatus);
            }
        }).done(function(response) {
            $('.photos').empty();
            var overlay = '<div class="files-list-loading-overlay" style="display: none"></div>';
            $('.photos').append(overlay);
            $('.photos').append(response);
            $('.photos').fadeIn(0);
        }).always(function() {
            $('.files-list-loading-overlay').hide();
        });
        return false;
    })
});
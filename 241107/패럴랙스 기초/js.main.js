$(function(){

    var top1 = $('#item1').offset().top;
    var left1 = $('#item1').offset().left;
    var left2 = $('#item2').offset().left;
    var left3 = $('#item3').offset().left;
    var left4 = $('#item4').offset().left;
    var left5 = $('#item5').offset().left;
    console.log(top1, left1, left2, left3, left4, left5)

$(window).scroll(function(){

    var sct = $(this).scrollTop();
    $('#value').text(sct);

    $('#item1').css({'top':top1+sct/4})
    $('#item2').css({
        'top':top1+sct/5,
        'left':left2+sct / 8
    })
    $('#item3').css({
        'top':top1+((sct*sct)+(6000*sct))/20000,
        'left':left3+sct / 8
    })
    $('#item4').css({
        'top':top1+(sct*sct)/5000,
        'left':left4+sct / 8
    })
    $('#item5').css({
        'top':top1+(sct*sct*sct)/5000000,
        'left':left5+sct / 8
    })

})

});
$(function(){
  $(window).scroll(function(){
    var h = $(window).scrollTop()
    var t1 = $('.area1').offset().top;
    var t2 = $('.area2').offset().top;
    var t3 = $('.area3').offset().top;
    var t4 = $('.area4').offset().top;
    var t5 = $('.area5').offset().top;
    console.log(h)

    if(h < t2){
      $('.area1').addClass('on');
    }else if(h < t3){
      $('.area2').addClass('on');
    }else if(h < t4){
      $('.area3').addClass('on');
    }else if(h < t5){
      $('.area4').addClass('on');
    }else{
      $('.area5').addClass('on');
    }
  })
  $(window).trigger('scroll')



});

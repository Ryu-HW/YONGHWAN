$(function(){
    var pc_prev = $('.pc-slide .prev-btn');
    var pc_next = $('.pc-slide .next-btn');
    var mo_prev = $('.mo-slide .prev-btn');
    var mo_next = $('.mo-slide .next-btn');

    var $slick =  $('.pc-slide ul');
// pc용
  $slick.slick({
    autoplay:true,
    prevArrow:pc_prev,
    nextArrow:pc_next,
    dots:true,
  });


//mobile용
  $('.mo-slide ul').slick({
    autoplay:true,
    prevArrow:mo_prev,
    nextArrow:mo_next,
    // dots:true,
  });

  $(window).resize(function(){
    var w = $(this).width(); //화면의 넓이 구하기
    console.log(w);
    if(w>=800){
      mo_prev.hide();
      mo_next.hide();
    }else{
      mo_prev.show();
      mo_next.show();
    }
  })
  $(window).trigger('resize');
  //처음 실행 시 최초 리사이즈 함.

  //slick 슬라이드 최초로 실행할 때
  $slick.on('init',function(event, slick){
    //실행될내용
  })

  //slick 슬래이드가 바뀌고 나서.
  $slick.on('afterChange',function(event,slick,currentSlide){
    //currentSlide - 현재 실행되고 있는 슬라이드 인덱스 번호
    $('.num p strong').html(currentSlide + 1);
  })

  $('.play').click(function(){
    if($(this).hasClass('on')==false){
      $(this).addClass('on');
      $slick.slick('slickPause')
    }else{
      $(this).removeClass('on');
      $slick.slick('slickPlay')

    }
    return false;
  })
});
$(function(){

    $(window).scroll(function(){
        var sct = $(this).scrollTop();
        //현재스크롤위치(양)
        $('#stop').text(sct);

       if(sct >=100){
         $('nav').addClass('fixed');
       }else{
        $('nav').removeClass('fixed');
       } 

        for(var i=0; i < 5; i++){
            if(sct >= $('section>div').eq(i).offset().top){
                $('nav ul li').removeClass('on');
                $('nav ul li').eq(i).addClass('on');  
            }
        }



    });

    $('nav ul li').click(function(){
        var i = $(this).index();
        //현재 네비게이션에 클릭된 인덱스값
        //alert(i);
       var offset_div =$('section>div').eq(i).offset().top;
      // alert(offset_div);
    //    $('nav ul li').removeClass('on');
    //    $('nav ul li').eq(i).addClass('on');   
       $('html, body').stop().animate({scrollTop:offset_div},1000);

    });

    $("section>div").mousewheel(function(event,d){
        console.log(d);
         //마우스 휠을 위로 스크롤하면 양수 / 아래는 음수
        if(d > 0){ //위
            var prev = $(this).prev().offset().top;
            $('html,body').stop().animate({scrollTop:prev},1000);
        }

        if(d < 0){
            var next = $(this).next().offset().top;
            $('html,body').stop().animate({scrollTop:next},1000);
            
         }
    });

  
    $('#popup').draggable();

    //$.cookie('pop','no',{expires:1});
    if($.cookie('pop')!="no"){
        $('#popup').show();
    }
    $('#popup area:eq(0)').click(function(){
        $('#popup').fadeOut('fast');
    });
    //닫기 버튼을 클릭하면 popup창을 서서히 사라지게함

    $('#popup area:eq(1)').click(function(){
        $.cookie('pop','no',{expires:1});  
        $('#popup').fadeOut('fast');
    });



});
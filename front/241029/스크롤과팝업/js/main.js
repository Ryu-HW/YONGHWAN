$(function(){

    var dTop = $('#floatdiv').offset().top;
    var areaNum = $('section div').length

    // var dTop = 250;
    //alert(dTop);
    $(window).scroll(function(){
       var sct = $(window).scrollTop();
       $('#sTop').text(sct);
       if(sct >= 100){
        $('nav').addClass('fixed');
       }else{
        $('nav').removeClass('fixed');
       }

       $('#floatdiv').stop().animate({top:dTop+sct},500);


    //    if(sct >= $('section>div').eq(0).offset().top){
    //         $('nav ul li').removeClass('on');
    //         $('nav ul li').eq(0).addClass('on');
    //         $('#floatdiv ul li').removeClass('on');
    //         $('#floatdiv ul li').eq(0).addClass('on');
    //    }
    //    if(sct >= $('section>div').eq(1).offset().top){
    //         $('nav ul li').removeClass('on');
    //         $('nav ul li').eq(1).addClass('on');
    //         $('#floatdiv ul li').removeClass('on');
    //         $('#floatdiv ul li').eq(1).addClass('on');
            
    //     }
    //     if(sct >= $('section>div').eq(2).offset().top){
    //         $('nav ul li').removeClass('on');
    //         $('nav ul li').eq(2).addClass('on');
    //         $('#floatdiv ul li').removeClass('on');
    //         $('#floatdiv ul li').eq(2).addClass('on');
    //     }
    //     if(sct >= $('section>div').eq(3).offset().top){
    //         $('nav ul li').removeClass('on');
    //         $('nav ul li').eq(3).addClass('on');
    //         $('#floatdiv ul li').removeClass('on');
    //         $('#floatdiv ul li').eq(3).addClass('on');
    //     }
    //     if(sct >= $('section>div').eq(4).offset().top){
    //         $('nav ul li').removeClass('on');
    //         $('nav ul li').eq(4).addClass('on');
    //         $('#floatdiv ul li').removeClass('on');
    //         $('#floatdiv ul li').eq(4).addClass('on');
    //     }
    //     if(sct >= $('section>div').eq(5).offset().top){
    //         $('nav ul li').removeClass('on');
    //         $('nav ul li').eq(5).addClass('on');
    //         $('#floatdiv ul li').removeClass('on');
    //         $('#floatdiv ul li').eq(5).addClass('on');
    //     }


        // for(i=0;i<areaNum;i++){
        //     if(sct >= $('section>div').eq(i).offset().top){
        //         $('nav ul li').removeClass('on');
        //         $('nav ul li').eq(i).addClass('on');
        //         $('#floatdiv ul li').removeClass('on');
        //         $('#floatdiv ul li').eq(i).addClass('on');
        //    }
        // }

        
        // document.querySelectorAll('section div').forEach(function(i){
        //     var thisIndexNum = i.index();
        //     if(sct >= $('section>div').eq(thisIndexNum).offset().top){
        //         $('nav ul li').removeClass('on');
        //         $('nav ul li').eq(thisIndexNum).addClass('on');
        //         $('#floatdiv ul li').removeClass('on');
        //         $('#floatdiv ul li').eq(thisIndexNum).addClass('on');
        //    }
        // })  !!!!!!!!포이치문은 제이쿼리랑 혼용해서 쓸 수 없음!!!!!!!!

        $('section div').each(function(i){
            if(sct >= $('section>div').eq(i).offset().top){
                $('nav ul li').removeClass('on');
                $('nav ul li').eq(i).addClass('on');
                $('#floatdiv ul li').removeClass('on');
                $('#floatdiv ul li').eq(i).addClass('on');
            }

        })

    });

    $('nav ul li').click(function(){
        var i = $(this).index();
       // alert(i);
        var offset_nav = $('section>div').eq(i).offset().top;
        //alert(offset_nav);
        $('html,body').stop().animate({scrollTop:offset_nav},1000);
        //스크롤을 offset_nav만큼움직인다.
       // $('nav ul li').removeClass('on');
        //$('nav ul li').eq(i).addClass('on');
        return false;
    });

    $('#floatdiv ul li').click(function(){
        var i = $(this).index();
       // alert(i);
        var offset_nav = $('section>div').eq(i).offset().top;
       
        $('html,body').stop().animate({scrollTop:offset_nav},1000);
        return false;
    });

    $('section > div').mousewheel(function(event,d){
        //event 마우스휠의 정보
        //d 는 이동방향 
        //마우스 휠을 위로 스크롤하면 양수(+1) / 아래음수(-1)
       // console.log(d);
        if(d > 0){ //휠 위로
            var prev = $(this).prev().offset().top;
            $('html,body').stop().animate({scrollTop:prev},1000,'easeOutBounce');
        }
        if(d < 0){//휠 아래로
            var next = $(this).next().offset().top;
            $('html,body').stop().animate({scrollTop:next},1000,'easeOutBounce');
        }ㄴ
    });

    
    //<script src="js/jquery.mousewheel.min.js"></script> 와 사용 가능



    $("#popup").draggable();
    //팝업창을 드레그 가능하게 함

    if($.cookie('pop')!= "no"){
        $("#popup").show();
    } //보이지 않고 시작해서 no가 없으면 쇼우

    $('#popup area:eq(0)').click(function(){
        $("#popup").fadeOut('fast');
        // 서서히사라짐
    });
   
    $('#popup area:eq(1)').click(function(){
        $.cookie('pop','no',{expires:1});
        // pop에 no를 저장 하루{expires:1}동안
        //하루{expires:1}동안 보지 않기
        $("#popup").fadeOut('fast');
        // 서서히사라짐
    });

    $('#notice_wrap').draggable();

    if($.cookie('popup') == "none"){
        $("#notice_wrap").hide();
    }

    var chk = $('#expiresChk');

    $('.closeBtn').on('click',closePop);

    function closePop(){
        if(chk.is(':checked')){
            //chk 변수(체크박스)가 체크 돼있으면 !
            $.cookie('popup','none',{expires:3});
            //쿠키 팝업에 넌을 3일동안 저장해라.
        }
        $('#notice_wrap').fadeOut('fast');
    }

});
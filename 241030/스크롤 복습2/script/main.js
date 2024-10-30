$(function(){

    var pdt = 0;

    $(window).scroll(function(){

        var sct = $(this).scrollTop();
        //스크롤의 양? 위치?
        $('#stop').text(sct)

        pdt = sct * 0.001;
        console.log(pdt)
        if(pdt <= 1){
            $('#pdt_basic').css('opacity',pdt);
        }

        if(sct >= 100){
            $('nav').addClass('fixed')
        }else{
            $('nav').removeClass('fixed')
        }
        $('section>div').each(function(i){
            if(sct >= $('section>div').eq(i).offset().top){
                $('nav ul li').removeClass('on');
                $('nav ul li').eq(i).addClass('on');
            }
        })
        

        
    });
    $('nav ul li').click(function(){
        var i = $(this).index()

        var offset_div = $('section>div').eq(i).offset().top;
        $('html, body').stop().animate({scrollTop:offset_div},1000);
    })


    // $('section>div').mousewheel(function(e,d){
    //     if(d<0){
    //         $('html').stop().animate({scrollTop:$(this).next().offset().top},1000)
    //     }else if(d>0){
    //         $('html').stop().animate({scrollTop:$(this).prev().offset().top},1000)


    //     }
    // })

    $( "#popup" ).draggable();

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

    $( "#notice_wrap" ).draggable();

    if($.cookie('popup') == 'none'){
        $( "#notice_wrap" ).hide();
    }

    var chk = $('#expiresChk');

    $('.closeBtn').click(function(){
        if(chk.is(':checked')){ //input창에 checked가 있으면
            $.cookie('popup','none',{expires:3})
        }
        $('#notice_wrap').fadeOut('fast');
    })

    // $('.closeBtn').on('click',closePop)
    // function closePop(){
    //     if(chk.is(':checked')){ //input창에 checked가 있으면
    //         $.cookie('popup','none',{expires:3})
    //     }
    //     $('#notice_wrap').fadeOut('fast');
    // }
});
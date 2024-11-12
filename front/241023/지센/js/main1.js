$(function(){


    // 화면을 다시사이징했을때?
    // $(window).resize(function(){
    //     var w = $(this).width();
    //     if(w < 1080){

    //     }else{
    //         if($('.mobile_nav').hasClass('active') == true ){
    //             $('.mobile_nav').removeClass('active')
    //             $('.transparency').removeClass('active')
    //             $('.mobile_nav .sub').css('display','none')

    //         }
    //     };
    // });
    $(window).resize(function(){
        var w = $(this).width();
        if(w > 900){
            $('.mobile_nav').removeClass('active')
            $('.transparency').removeClass('active')
            $('.mobile_nav .sub').css('display','none')
        }
    });
    


    $('.nav>ul').mouseenter(function(){
        $(this).css('height','182px')
    })
    $('.nav>ul').mouseleave(function(){
        $(this).css('height','54px')
    })


    $('.mobile_tab').click(function(){
        $('.mobile_nav').addClass('active')
        $('.transparency').addClass('active')
        return false
    })

    $('.close').click(function(){
        $('.mobile_nav').removeClass('active')
        $('.transparency').removeClass('active')
        // $('.sub').slideUp()
        $('.mobile_nav .sub').css('display','none')
        return false
    })

    $('.mobile_nav ul li a').click(function(){
        var subDisplay = $(this).next().css('display')
        if(subDisplay == 'none'){
            $('.mobile_nav .sub').slideUp()
            $(this).next().slideDown()
        }else{
            $(this).next().slideUp()

        }
        return false

    })
});
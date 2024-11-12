$(function(){

    var slidesNum = $('.imgs li').length;
    // alert(slidesNum) // 5
    var clone = $('.imgs li').eq(0).clone();
    $('.imgs').append(clone);
    var clickedIndex = 0;
    var repeat;
    var currentIndex = 0;

    $('.pager li').click(function(){

        clickedIndex = $(this).index();

        if(currentIndex == slidesNum){
            currentIndex = 0;
            $('.imgs').css('margin-left',0);
            $('.imgs').stop().animate({'margin-left':-clickedIndex*100+'%'},Math.abs(600*(clickedIndex - currentIndex)));
            $('.pager li').removeClass('on')
            $(this).addClass('on')
        }else{
            $('.imgs').stop().animate({'margin-left':-clickedIndex*100+'%'},Math.abs(600*(clickedIndex - currentIndex)));
            $('.pager li').removeClass('on')
            $(this).addClass('on')
        }
        

        currentIndex = clickedIndex;
    
    });

    $('.next').click(function(){
        if(currentIndex == slidesNum){
            currentIndex = 0;
            $('.imgs').css('margin-left',0);
        }
        currentIndex++
        $('.imgs').stop().animate({'margin-left':-currentIndex*100+'%'},600);

        $('.pager li').removeClass('on')
        if(currentIndex == slidesNum){
            $('.pager li:eq(0)').addClass('on')
        }else{
            $('.pager li:eq('+currentIndex+')').addClass('on')
        }

        
    });
    $('.prev').click(function(){
        if(currentIndex == 0){
            currentIndex = slidesNum;
            $('.imgs').css('margin-left',-currentIndex*100+'%');
        }
        currentIndex--  
        $('.imgs').stop().animate({'margin-left':-currentIndex*100+'%'},600);

        $('.pager li').removeClass('on')
        if(currentIndex == slidesNum){
            $('.pager li:eq(0)').addClass('on')
        }else{
            $('.pager li:eq('+currentIndex+')').addClass('on')
        }
    });

    function timer(){
        if(currentIndex == slidesNum){
            currentIndex = 0;
            $('.imgs').css('margin-left',0);
        }
        currentIndex++
        $('.imgs').stop().animate({'margin-left':-currentIndex*100+'%'},600);

        $('.pager li').removeClass('on')
        if(currentIndex == slidesNum){
            $('.pager li:eq(0)').addClass('on')
        }else{
            $('.pager li:eq('+currentIndex+')').addClass('on')
        }
    }

    var autoSlide = setInterval(timer, 3000);

    $("#wrap").hover(function(){
        clearInterval(autoSlide);
    },(function(){
        autoSlide = setInterval(timer, 3000);
    }))
});
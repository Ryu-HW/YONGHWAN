$(function(){
    var prevBtn = $('.slide_but p .prev')
    var pauseBtn = $('.slide_but p .pause')
    var nextBtn = $('.slide_but p .next')

    var currentIndex = 0;
    var clickedIndex = 0;
    var slidesNum = $('.pop_slide li').length // 11

    nextBtn.click(function(){
        clickedIndex = currentIndex + 1;
        if(clickedIndex == slidesNum){clickedIndex = 0}
        var currentSlide = $('.pop_slide li').eq(currentIndex); //현재 사진
        var clickedSlide = $('.pop_slide li').eq(clickedIndex); //다음에 올 사진

        currentSlide.css('left', 0).stop().animate({'left':'-100%'})
        clickedSlide.css('left', '100%').stop().animate({'left':'0'})
        currentIndex = clickedIndex
        $('.slide_but p strong').next(clickedIndex)
    })
    prevBtn.click(function(){
        clickedIndex = currentIndex - 1;
        
    })
})
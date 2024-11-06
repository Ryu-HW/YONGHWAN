$(function(){
    slideNum = $('.slideBox').length; //20
    slide1 = $('.slideBox').eq(0).offset().left;
    slide2 = $('.slideBox').eq(5).offset().left;
    slide3 = $('.slideBox').eq(10).offset().left;
    slide4 = $('.slideBox').eq(15).offset().left;

    // alert(slide1)
    var i = 0;


    $('#contents .next').click(function(){

        if(i == 0){
            i++;
            $('.listWrap').css('margin-left',-(slide2-470)+'px')
            $('.btns .prev').css('opacity', 1)
        }else if(i == 1){
            i++;
            $('.listWrap').css('margin-left',-(slide3-470)+'px')
        }else if(i == 2){
            i++;
            $('.listWrap').css('margin-left',-(slide4-470)+'px')
            $('.btns .next').css('opacity', 0)
        }else if(i == 3){
            return false
        }
        
    })

    $('#contents .prev').click(function(){

        if(i == 0){
            return false
        }else if(i == 1){
            i--;
            $('.listWrap').css('margin-left',-(slide1-470)+'px')
            $('.btns .prev').css('opacity', 0)
        }else if(i == 2){
            i--;
            $('.listWrap').css('margin-left',-(slide2-470)+'px')
        }else if(i == 3){
            i--;
            $('.listWrap').css('margin-left',-(slide3-470)+'px')
            $('.btns .next').css('opacity', 1)

        }
        
    })
});
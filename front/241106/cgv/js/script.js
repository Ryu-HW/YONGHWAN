$(function(){



    // https://velog.io/@mongsukim/swiper-%EC%9E%AC%EC%83%9D-%EC%A0%95%EC%A7%80-%EC%9E%90%EB%B0%94%EC%8A%A4%ED%81%AC%EB%A6%BD%ED%8A%B8


    var swiper = new Swiper('.mySwiper',{
        slidesPerView: 3,
        spaceBetween : 30,
        navigation:{
            nextEl:'.swiper-button-next',
            prevEl:'.swiper-button-prev',
        },
        autoplay:true,
    })

    $('.btn_eventCntrol').click(function(){
        if($(this).hasClass('on')==false){
            $(this).addClass('on');
            swiper.autoplay.stop();
        }else{
            $(this).removeClass('on');
            swiper.autoplay.start();
        }
        return false;
    })

    slideNum = $('.slideBox').length; //20

    slide = [$('.slideBox').eq(0).offset().left,$('.slideBox').eq(5).offset().left,$('.slideBox').eq(10).offset().left,$('.slideBox').eq(15).offset().left] //각 슬라이드 margin-left의 값
    slideWrapNum = slide.length;  // 슬라이드 할 수 있는 개수 (4)
    var i = 0;
    // alert(slideWrapNum)


    $('#contents .next').click(function(){
        
        if(i == 0){
            $('.btns .prev').css('opacity', 1)
        }else if(i == slideWrapNum - 2){
            $('.btns .next').css('opacity', 0)
        }else if(i == slideWrapNum - 1) return false

        i++;
        $('.listWrap').stop().animate({'margin-left':-(slide[i]-470)+'px'},300)
        
    })

    $('#contents .prev').click(function(){

        if(i == 1){
            $('.btns .prev').css('opacity', 0)
        }else if(i == slideWrapNum - 1){
            $('.btns .next').css('opacity', 1)
        }else if(i == 0) return false

        i--;
        $('.listWrap').stop().animate({'margin-left':-(slide[i]-470)+'px'},300)
    })

    var tapContents = $('.tapContent a')
    var specialHall_lists = $('.specialHall_list li')

    $(specialHall_lists[0]).addClass('on')

    $('.specialHall_list li').mouseenter(function(){
    
        var tapContentsIndex = $(this).index() //호버한 인덱스 넘버

        $(tapContents).css('display','none') //사진 다 숨기기

        $(tapContents[tapContentsIndex]).css('display','block'); //해당인덱스 사진만 보이기

        $(specialHall_lists).removeClass('on') //리스트 다 숨기기

        $(this).addClass('on') //해당 인덱스 리스트만 보이기
    })





});
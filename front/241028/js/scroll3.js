$(function(){
    $(window).scroll(function(){
        var sct = $(this).scrollTop();
        //마우스 세로 스크롤의 값을 구해서 sct에 저장
        $('.s_top').text(sct)
        if(sct >= 450 && sct <= 1200){
            $('.left1').addClass('on');
        }else{
            $('.left1').removeClass('on');
        }
        if(sct >= 940 && sct <= 1800){
            $('.right1').addClass('on');
        }else{
            $('.right1').removeClass('on');
        }
        if(sct >= 2200 && sct <= 3500){
            $('.s4_cover').addClass('active');
        }else{
            $('.s4_cover').removeClass('active');
        }
        
    })

});
$(function(){
    var i = 0; //클릭한 인덱스 번호
    var c = 0; //현재 인덱스 번호
    var repeat; //자동 슬라이드 관리 변수명


    $('.pager li').on('click',click_slide);

    function click_slide(){
        $('.pager li').off('click'); //클릭 기능 끄기. 중복되지 않게.
        $('.next').off('click');
        $('.prev').off('click');
        $(document).off('keydown');
        clearInterval(repeat);

        i = $(this).index();
        if(i == c){
            $('.pager li').on('click',click_slide);
            return;
        }
        else if(i > c){
            $('.imgs li').eq(c).css('left','0').animate({'left':'-100%'},600,function(){
                $('.pager li').on('click',click_slide);
                $('.next').on('click', next_slide);
                $('.prev').on('click', next_slide);
                $(document).on('keydown', pressKey);
                timer();
            })
            $('.imgs li').eq(i).css('left','100%').animate({'left':'0'},600) //콜백함수 : 앞에 것이 끝난 후 실행
        }else{
            $('.imgs li').eq(c).css('left','0').animate({'left':'100%'},600,function(){
                $('.pager li').on('click',click_slide);
                $('.next').on('click', next_slide);
                $('.prev').on('click', next_slide);
                $(document).on('keydown', pressKey);
                timer();
            })
            $('.imgs li').eq(i).css('left','-100%').animate({'left':'0'},600) //콜백함수 : 앞에 것이 끝난 후 실행
        }

        $('.pager li').removeClass('on').eq(i).addClass('on'); // 한 줄로 합칠 수 있음.
        
        c = i;
    }

    timer();

    function timer(){
        repeat = setInterval(function(){
            i++
            if(i >= 5){
                i = 0;
            }
            $('.imgs li').eq(c).css('left','0').animate({'left':'-100%'},600)
            $('.imgs li').eq(i).css('left','100%').animate({'left':'0'},600) //콜백함수 : 앞에 것이 끝난 후 실행
    
            $('.pager li').removeClass('on').eq(i).addClass('on'); // 한 줄로 합칠 수 있음.
            c = i
        },3000)
    }

    $('#img_slide').mouseover(function(){
        clearInterval(repeat);
    });
    $('#img_slide').mouseout(function(){
        timer();
    });



    $('.next').on('click', next_slide);
    $('.prev').on('click', prev_slide);

    function next_slide(){

        $('.next').off('click');
        $('.prev').off('click');
        $(document).off('keydown');
        clearInterval(repeat);

        i++
        if(i >= 5){
            i = 0;
        }
        $('.imgs li').eq(c).css('left','0').animate({'left':'-100%'},600,function(){
            $('.pager li').on('click',click_slide);
            $('.next').on('click', next_slide);
            $('.prev').on('click', next_slide);
            $(document).on('keydown', pressKey);
            timer();
        })
        $('.imgs li').eq(i).css('left','100%').animate({'left':'0'},600) //콜백함수 : 앞에 것이 끝난 후 실행

        $('.pager li').removeClass('on').eq(i).addClass('on'); // 한 줄로 합칠 수 있음.


        c = i
    }
    function prev_slide(){

        $('.next').off('click');
        $('.prev').off('click');
        $(document).off('keydown');
        clearInterval(repeat);

        i--
        if(i <= -1){
            i = 4;
        }
        $('.imgs li').eq(c).css('left','0').animate({'left':'100%'},600,function(){
            $('.pager li').on('click',click_slide);
            $('.prev').on('click', next_slide);
            $('.next').on('click', next_slide);
            $(document).on('keydown', pressKey);
            timer();
        })
        $('.imgs li').eq(i).css('left','-100%').animate({'left':'0'},600) //콜백함수 : 앞에 것이 끝난 후 실행

        $('.pager li').removeClass('on').eq(i).addClass('on');
        c = i
    }


    $(document).on('keydown',pressKey);

    function pressKey(e){
        if(e.keyCode == 65 || e.keyCode == 37){
        //A or 왼쪽화살표
            prev_slide()

        }else if(e.keyCode == 68 || e.keyCode == 39){
        //D or 오른쪽화살표
            next_slide()

        }
    }




})
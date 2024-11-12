$(function(){

    var visual= $('#brandVisual ul li'); //사진
    var button1 = $('#buttonList li'); //버튼
    var current = 0; //현재는 0


    button1.click(function(){
        var i = $(this).index();
        // alert(i);
        button1.removeClass('on');
        button1.eq(i).addClass('on');
        move(i);

    });

    function timer(){
        var id = setInterval(function(){
            var n = current + 1
            if(n == 3){
                n = 0;
            }
            button1.eq(n).trigger('click');
            //버튼1에 n번째 인덱스친구의 클릭을 '트리거'하겠다. 
        },3000)


    }
    timer();

    function move(i){
        if(current < i){
            var cu = visual.eq(current);
            var ne = visual.eq(i);
            cu.css('left','0').stop().animate({'left':'-100%'},500)
            ne.css('left','100%').stop().animate({'left':'0'},500)
        }else if(current > i){
            var cu = visual.eq(current);
            var ne = visual.eq(i);
            cu.css('left','0').stop().animate({'left':'100%'},500)
            ne.css('left','-100%').stop().animate({'left':'0'},500)
        }else{
            return
        }
        //현재 활성화된 버튼과 클릭한 버튼이 같으면 빠져나간다.
        
        


        current = i;
    }


});
$(function(){
    var visual = $('#brandVisual > ul > li')
    var btn = $('#buttonList > li')
    var id;
    var current = 0;

    btn.click(function(){


        var i = $(this).index();
        btn.removeClass('on');
        btn.eq(i).addClass('on')
        move(i)

        return false
    });

    function timer(){
        id = setInterval(function(){
            var i = current + 1
            if(i == 3){ i = 0 }
            btn.eq(i).trigger('click');

        },3000)
    }

    timer()

    function move(i){
        
        var cu = visual.eq(current);
        var ne = visual.eq(i);

        if(current == i ) return;
        else if(current < i){
            cu.css('left','0').animate({left:'-100%'},500);
            ne.css('left','100%').animate({left:'0%'},500);
        }else{
            cu.css('left','0').animate({left:'100%'},500);
            ne.css('left','-100%').animate({left:'0%'},500);
        }

        current = i
        
    }
})
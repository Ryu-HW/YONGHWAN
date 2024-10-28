function autoplay(){
    i++
    if(i > totalImages -2){
        i = 0;
        
    }
    $(".imgs").stop().animate({"margin-left":-i*100+"%"},600);
    $('.pager li').removeClass('on');
    $('.pager li').eq(i).addClass('on');
}
$('.next').click(function(){
    autoplay()
})
$('.prev').click(function(){
    if(i < 1){
        i=totalImages-2;
    }else{
        i--;
    }
    $(".imgs").stop().animate({"margin-left":-i*100+"%"},600);
})
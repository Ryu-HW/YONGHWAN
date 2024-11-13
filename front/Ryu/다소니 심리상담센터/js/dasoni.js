document.addEventListener("DOMContentLoaded", function() {
    let btns = document.querySelectorAll('.box')
    let slide1 = document.querySelector('.s1')
    let slide2 = document.querySelector('.s2')
    let s1_pText = document.querySelectorAll('.s1 p')
    let s2_pText = document.querySelectorAll('.s2 p')

    function changeSlide(){

        // if(slide2.classList.contains('on') == true){

            // slide1.classList.addClass('on')
            // slide2.classList.removeClass('on')
            // s1_pText.forEach(function(p1){
            //     p1.classList.addClass('on')
            // })
            // s2_pText.forEach(function(p2){
            //     p2.classList.removeClass('on')
            // })

        // }else if(slide1.classList.contains('on') == true){

            slide1.classList.removeClass('on')
            slide2.classList.addClass('on')
            // s2_pText.forEach(function(p2){
            //     p2.classList.addClass('on')
            // })
            // s1_pText.forEach(function(p1){
            //     p1.classList.removeClass('on')
            // })
        // }


    }

    btns.forEach(function(){

    }

)})

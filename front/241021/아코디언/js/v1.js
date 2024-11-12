const mainMenu = document.querySelectorAll('.m_menu>li>a');
const sub = document.querySelectorAll('.sub');


mainMenu.forEach(function(mainMn){
    mainMn.addEventListener('click',function(){
        var subHeight = getComputedStyle(mainMn.nextElementSibling).height;
        //getComputedStyle은 dom요소의 현재 스타일을 가져오기 위한 매서드
        //이 메서드를 사용하면 특정 요소에 적용된 모든 스타일 속성과 값에 대한 정보를 얻는다.

        //nextElementSibling 이 다음에 있는 엘리먼트. 시빌링은 뭘까(형제자매)
        if(subHeight === '0px'){
            slideUp();
            mainMn.nextElementSibling.style.height = '108px'
        }else{
            mainMn.nextElementSibling.style.height = '0px'
        }
     })
})

function slideUp(){
    sub.forEach(function(x){
        x.style.height = '0px'
    })
}

const hamBtn = document.querySelector('.ham')
const nav = document.querySelector('nav')

hamBtn.addEventListener('click',function(){

    var navPosR = getComputedStyle(nav).right;
    if(navPosR === '0px'){
        nav.style.right = '-120px';
        hamBtn.classList.remove('on');
    }else{
        nav.style.right = '0px';
        hamBtn.classList.add('on');

    };
});


const eachMenu = document.querySelectorAll('.sub');
const eachHead = document.querySelectorAll('.m_menu li a');

eachHead.forEach(function(eaM){

    eaM.addEventListener('click',function(){
        eaM.style.display = 'block'
    })
})
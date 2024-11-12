const btnCollapse = document.querySelector('#btn-collapse');//all버튼
const heading = document.querySelectorAll('.panel-heading');
const question = document.querySelectorAll('.panel-question');
// heading 과 body를 감싸는 qusstion
const p_body = document.querySelectorAll('.panel-body');


heading.forEach(function(headingElement){

    headingElement.addEventListener('click',function(){

        var headingHeight = getComputedStyle(headingElement.parentElement).height;

        question.forEach(function(q){
            q.classList.remove('on');
        });

        if(headingHeight === '183px'){
        headingElement.parentElement.classList.remove('on');
        }else{
            headingElement.parentElement.classList.add('on');
        }
        
    });

});
var slideNum = 0;

btnCollapse.addEventListener('click',function(){
    if(slideNum == 0){
        question.forEach(function(q){
            q.classList.remove('on');
        });
        slideNum++;
    }else{
        question.forEach(function(q){
            q.classList.add('on');
        });
        slideNum--;
    }
    
});

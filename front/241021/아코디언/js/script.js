const btnCollapse = document.querySelector('#btn-collapse');
const heading = document.querySelectorAll('.panel-heading');
const question = document.querySelectorAll('.panel-question');
const p_body = document.querySelector('.panel-body');

heading.forEach(function(headingElement){
    
    headingElement.addEventListener('click',function(e){
        
        question.forEach(function(x){
            x.classList.remove('on')
        })

        e.target.classList.add('on')
    });

});
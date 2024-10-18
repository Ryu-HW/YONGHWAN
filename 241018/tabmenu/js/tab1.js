const targetLink = document.querySelectorAll('.tab_menu a'); //탭버튼
const tabContent=document.querySelectorAll('#tabContent div');
// 탭내용

//targetLink 배열을 forEach로 순회

targetLink.forEach(function(link){

    link.addEventListener('click',function(e){
        e.preventDefault(); //링크금지
        let orgTarget = link.getAttribute('href');
        //클릭(e.taget) - this로 변경 가능
        //getAttribute 는 href, src 속성값을 읽어옴
        //alert(orgTarget); #tab1 ,#tabs2, #tabs3
        // let tabTarget = orgTarget.replace("#","");
        //#tab1 에서 #을 빈문자열로 대체 -> tab1 
        //alert(tabTarget);

        //모든 tabContent을 안보이게 설정
        tabContent.forEach(function(content){
            content.style.display = "none";

        }); 
        targetLink.forEach(function(x){
            x.classList.remove("active")
        })
        //클릭한 탭만보이게 설정

        // document.querySelector(orgTarget).style.display="block"; //이것도 됨
        document.querySelector(orgTarget).style.display="block";
        link.classList.add("active");

    }); 

});
import React from "react";

function Hello({color,name,isSpecial}){ //props
    return (
    <div style={{color : color}}>
        {isSpecial && <strong>*</strong>}
        안녕하세요 {name}
        
        
        
    </div>
    ) //props.color, props.name
    //리엑트에서 스타일은 중괄호 안에 넣어야함.
}
Hello.defaultProps = { //이름 변경 가능.
    name : '',
    isSpecial : false,
}
export default Hello;
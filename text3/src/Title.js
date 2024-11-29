


function Title({title, text}){ //props 안 쓸 거면 중괄호를 써야함(구조분해할당)
    // console.log("props==")
    // console.log(props)
    return(
        <>
            <h2 className="title">{title}</h2>
            <p>text: {text}</p>
        </>
        
    )
}export default Title;

//props 란? 부모의 컴포넌트가 자식 컴포넌트에게 넘겨주는 데이터
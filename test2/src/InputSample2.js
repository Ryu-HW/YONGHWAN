import {useState} from "react"


function InputSample2(){

    const [text,setText] = useState('')

    const onChange = (e) =>{
        setText(e.target.value);
    }

    const onReset = () =>{
        setText('');
    }

    return(
        <div>
            <input onChange={onChange} value={text} />
            <button onClick={onReset}>초기화</button>
            <div>
                <strong>값:{text} </strong>
            </div>
        </div>
    );
}
export default InputSample2;
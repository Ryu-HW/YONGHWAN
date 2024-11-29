import { useState } from "react";

function MultiInputForm(){
//useState를 사용하여 입력상태 관리

    const [formData, setFormData] = useState({

        name:"",
        email:""
    });


    const handleChange = (e)=>{
        const {name, value} = e.target; //입력필드의 name과 value 가져오기.
        setFormData({
            ...formData,//이전상태를 복사  ----------------------------------------------------------------------------------------------
            [name] : value, //formData.name을 설정하는 것? ------------------------------------------------------------------------------
        });
        
    }

    const handleSubmit = (e) =>{
        e.preventDefault();
        console.log("submit data", formData); //현재 상태를 콘솔 출력
        alert(`Name: ${formData.name}, Email: ${formData.email}`)

    }

    return(
        <div>
            <h2>멀티 인풋폼</h2>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>Name : 
                        <input
                        type="text" 
                        name ="name" 
                        value = {formData.name}  //상태 값을 input의 value로 전달
                        onChange = {handleChange}

                        />
                    </label>
                </div>

                <div>
                    <label>Email : 
                        <input
                        type="email" 
                        name = "email" 
                        value = {formData.email}  //상태 값을 input의 value로 전달
                        onChange = {handleChange}
                        
                        />
                    </label>
                </div>

                <button type="submit">전송하기</button>
            </form>
            <div>
                <h3>현재 인풋창에 나오는 내용</h3>
                <p>Name : {formData.name}</p>
                <p>Email : {formData.email}</p>
            </div>
        </div>
    )
}export default MultiInputForm;
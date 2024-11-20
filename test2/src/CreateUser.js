




function CreateUser({username, email, onChang, onCreat}){


    return(
        <div>
            <input 
                name="username"
                placeholder="계정명"
                onChange={onChang}
                value={username}
                
            />
            <input 
                name="email"
                placeholder="이메일"
                onChange={onChang}
                value={email}

            />
            <button onClick={onCreat}>등록</button>
        </div>
    )
}export default CreateUser;
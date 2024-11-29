import React, { useRef, useState } from 'react';
import UserList1 from './UserList1';
import CreateUser from './CreateUser';

function App() {
  const [inputs, asdd] = useState({ //useState로 inputs을 변경하는 asdd함수를 만든다고 봐야할듯
    username: '',
    email: ''
  });




  // const { username, email } = inputs; //이게 이거임;
  const username = inputs.username;
  const email = inputs.email;




  const onChange = e => {
    const { name, value } = e.target;
    asdd({
      ...inputs,
      [name]: value //[name]은 name의 속성값을 나타내는 것? [] = '안에있는 변수(속성)'의 값
                    //  value의 속성값에 [name]을 넣어라? 이것도 거꾸로임
                    // [name]이 value다 라고 해석해야할듯
    });
  };
  const [users, setUsers] = useState([
    {
      id: 1,
      username: 'velopert',
      email: 'public.velopert@gmail.com'
    },
    {
      id: 2,
      username: 'tester',
      email: 'tester@example.com'
    },
    {
      id: 3,
      username: 'liz',
      email: 'liz@example.com'
    }
  ]);

  const nextId = useRef(4);
  const onCreate = () => {
    const user = {
      id: nextId.current,
      username,
      email
    };
    setUsers(users.concat(user));

    asdd({
      username: '',
      email: ''
    });
    nextId.current += 1;
  };
  return (
    <>
      <CreateUser
        username={username}
        email={email}
        onChang={onChange}
        onCreat={onCreate}
      />
      <UserList1 users={users} />
    </>
  );
}

export default App;
import UserCard1 from "./UserCard";

function UserList(){
    const users = [
            {
            name:"Alice",
            age: 30,
            job: "Designer",
            isActive: true,
        },
            {
            name:"Bob",
            age: 22,
            job: "Developer",
            isActive: false,
        },
            {
            name:"Charlie",
            age: 27,
            job: "Product Manager",
            isActive: true,
        },
            {
            name:"Dana",

            job: "Analyst",
            isActive: false,
        },
    ]


    return(
        <div>
            <h1>사용자 목록</h1>
            {users.map(function(user, index){
                return <UserCard1 key={index} name={user.name} age={user.age} job={user.job} isActive={user.isActive}/>
            })}

            {/* {users.map((user, index)=>(
            <UserCard key={index} name={user.name} age={user.age} job={user.job} isActive={user.isActive}/>
            ))} */}
        </div>
        
    )
}
export default UserList;
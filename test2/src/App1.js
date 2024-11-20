import Hello from "./Hello";
import './App.css';
const name = "react";
const AppStyle = {
  backgroundColor : 'black',
  color:'aqua',
  fontSize : 24, //기본단위 px
  padding : '1rem', //다른단위는 문자열
}
function App1(){
  return(
    <div>
      <Hello/>
      {/* 변수넣기 */}
      <div style={AppStyle}>{name}</div>
      <div className="gray-box"></div>
    </div>
  )
}

export default App;
import Hello from "./Hello";
import './App.css';

function App(){

  const name = 'react';
  const style = {
    backgroundColor : 'black',
    'color':'aqua',
    fontSize:24, //기본 px
    padding:'1rem'
  }
  return(
    <div>
      {/* 주석은 화면에 안 보임 */}
      {/* 중활호에 감싸지 않으면 화면에 보임 */}
      <Hello
      // 열리는 태그 내부에서는 이렇게 주석 사용 가능
      />
      <br/>
      <input />
      <br/>
      <br/>
      <div class="yes" style={style}>이렇게도 된다 {name}</div>
      {/* class로 써도 되지만 권장하지 않음 */}
      <div className="lime-box"></div>
    </div>
  );
}
export default App;
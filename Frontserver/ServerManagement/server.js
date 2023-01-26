const app = require('express')();
const http = require('http').Server(app);
var io = require('socket.io')(http);


app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));



io.on('connection',function(socket){
  
    socket.on('MembershipSign',(data) =>console.log(data));
     
    //클라이언트로부터 데이터를 받음

});

var port = 3000;
http.listen(port,()=>{
	console.log('listening port: 3000');
});
 

//https://jamie-dev.tistory.com/101



/* 만약 위에 console이 잘 나온다면 아래 식 위에다가 넣어서 db에 저장
 Connection.query('INSERT INTO member_inform (userName, userID, userPW, userEmail) values(?, ?, ?, ?)', //받은걸 DB에 저장
  [data, data1, data2, data3],

  function(error, results, fields){ //순서대로 에러가뜬다면 아래에 저렇게 에러표시를 하겠다는 말
    if (error) throw error;
    console.log('The solution is: ', results[0].solution);
      });
*/



  /*
//회원가입을 위한 서버

const express =require('express');
const app = express();
const port = 3306; //데이터 베이스와의 연결을 위해 3306으로함
var socketio = require('socket.io');


app.listen(port,()=>{
  console.log(`server is ready at localhost`);
}); //포트 연결되면

const mysql = require('mysql');
Connection = mysql.createConnection({
  host : "127.0.0.1",
  user : "root",
  password : "2247vmfwpr!^2022",
  database : "PM_Plus_membership"
}); //DB 선택

Connection.connect(); // DB에 접근

app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json()); //json 형태로 문자데이터를 보냄

//그리고 이제 db의 쿼리를 작성해줌
//그리고 안드로이드 스튜디오에서 응답을 받을거임
app.get("/membership",(req,res) => { //응답을 받는 부분
  const user_name = req.body.inText;
  const user_id = req.body.inText;
  const user_pw = req.body.inText;
  const user_mail = req.body.inText; //사용자가 입력한 이름 아이디 비번 이메일 모두 응답받고

  Connection.query('INSERT INTO userdatabase (user_name, user_id, user_pw, user_mail) values(?, ?, ?, ?)', //받은걸 DB에 저장
  [user_name, user_id, user_pw, user_mail],

  function(error, results, fields){ //순서대로 에러가뜬다면 아래에 저렇게 에러표시를 하겠다는 말
  if (error) throw error;
  console.log('The solution is: ', results[0].solution);
    });

  res.write("회원가입 완료");
  res.end();
});

Connection.end();
*/






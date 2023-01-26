var mysql = require('mysql');

var db = {
    host : "localhost",
    user : "root",
    password : "잠시 삭제",
    port : 3306,
    database : 'Port_Mis_2022'
};


module.exports = {
  init: function () {
    return mysql.createConnection(db);
  },
  
  connect: function(conn) {
    conn.connect(function(err) {
      if(err){
        console.log("error: " + err);
      }else{
        console.log("success");
      }

    });
  }
};
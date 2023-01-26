<?php
    $db_servername = "localhost";
    $db_username = "root";
    $db_password = "sd_842657";
    $db_name = "hanium";

    $sql = mysqli_connect( $db_servername, $db_username, $db_password, $db_name);

    if($sql){
        print "접속";
    }else{
        ("Connection failed: " . mysqli_connect_error());
    }
?>
<!doctype html>
<HTML lang = "ko">
<HEAD>
  <meta charset="UTF-8">
  <TITLE>회원가입</TITLE>
  <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon">
  <style>
      body{font-family: sans-serif; font-size: 14px;}
      input, button{font-family: inherit; font-size: inherit;}
  </style>
</HEAD>
<BODY>
    <h1>회원가입</h1>
    <form action="dbtest2.php" method = "POST">
        <p><input type="text" name = "username" placeholder = "사용자이름" required></p>
        <p><input type="text" name = "userid" placeholder = "아이디" required></p>
        <p><input type="password" name = "userpwd" placeholder = "패스워드" required></p>
        <p><input type="text" name = "useremail" placeholder = "사용자이름" required></p>
        <p><input type="text" name = "usernick" placeholder = "사용자이름" required></p>
    </form>
    
</BODY>
</HTML>
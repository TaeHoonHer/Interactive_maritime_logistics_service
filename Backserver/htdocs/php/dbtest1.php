<HTML>
<HEAD>
  <TITLE>PHP 테스트</TITLE>
</HEAD>
<BODY>
<?php
    $db_user = "root";
    $db_pass = "sd_842657";
    $db_host = "localhost";
    $db_name = "hanium";
    $db_type = "mysql";
    $dsn = "$db_type:host=$db_host;dbname=$db_name;charset=utf8";
  try{
    $pdo = new PDO($dsn,$db_user,$db_pass);
    $pdo->setAttribute(PDO::ATTR_ERRMODE,PDO::ERRMODE_EXCEPTION);
    $pdo->setAttribute(PDO::ATTR_EMULATE_PREPARES,false);
    print "접속하였습니다.<br>";
  }catch(PDOException $Exception){
    die('오류:'.$Exception->getMessage());
  }
  try{
    $pdo->beginTransaction( );
    $sql = "USE hanium"; 
    $sql = "INSERT INTO board (boardname, boardinfo) VALUES (:boardname, :boardinfo)";
            $stmh = $pdo->prepare($sql);
            $stmh->bindValue(':boardname', 'NAME',PDO::PARAM_STR);
            $stmh->bindValue(':userid', 'ID',PDO::PARAM_STR);
            
    $stmh->execute();
    $pdo->commit();
    print "데이터를 ".$stmh->rowCount()."건 입력하였습니다.<br>";
  }catch(PDOException $Exception){
    $pdo->rollBack();
    print "오류:".$Exception->getMessage();
  }
?>
</BODY>
</HTML>
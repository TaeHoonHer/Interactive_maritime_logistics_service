<?php
    $db_servername = "localhost";
    $db_username = "root";
    $db_password = "";
    $db_name = "hanium";

    $sql = mysqli_connect( $db_servername, $db_username, $db_password, $db_name);

    if($sql){
        print '접속';
    }else{
        ("Connection failed: " . mysqli_connect_error());
    }
?>
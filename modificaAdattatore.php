<html>
    <head>
		  <meta http-equiv="content-type" content="text/html; charset=utf-8">
		  <title>SENSOR MANAGEMENT SYSTEM</title>
	  	  <link rel="stylesheet" type="text/css" href="css/stile.css" media="screen">
	</head>

        <body>

            <div style="margin-top: 28px; height: 105px; text-align: left; margin-left: 319px; width: 725px;">
			<a href="opzioniazienda.php"><img style="border: 0px solid ; width: 709px; height: 86px;" class="classname" alt="" src="images/logo.png"></a>
	    </div>
        </body>
</html> 

<?php

    //dati del form
    $id=$_POST['identificatore'];

    
    //database
    define('DB_HOST', '127.0.0.1');
    define('DB_USERNAME', 'root');
    define('DB_PASSWORD', '');
    define('DB_NAME', 'progetto');
    
    //get connection
    $mysqli = new mysqli(DB_HOST, DB_USERNAME, DB_PASSWORD, DB_NAME);

    if($mysqli->connect_errno){
    	trigger_error('Connection failed: ' . $mysqli->connect_error, E_USER_NOTICE);
    }

    
    //comando SQL
    $sql = sprintf("SELECT * FROM adattatore WHERE Id='%s'", mysql_real_escape_string($mysqli, $id));
    $result = $mysqli->query($sql);
    $conta= mysqli_num_rows($result);
    
    $row = mysqli_fetch_array($result, MYSQLI_ASSOC);

    if($conta===1){
        
	
	
	$str = 'I dati dell\'adattatore cercato sono i seguenti: <br><br>';
        echo $str;
     
	$str = 'Identificatore:  ' . $row['id'] . ' </br>';
        echo $str;
        $stato = $row['stato'];
        if($stato===true){
	    $str = 'Stato: Attivo <a href="modificaStatoAdatt.html">Edit</a></br>';
            echo $str;
        } else{
	    $str = 'Stato: Non attivo <a href="modificaStatoAdatt.html">Edit</a></br>';
            echo $str;
        }
        $idsensore = $row['id_sensore'];
	$str = 'Identificatore sensore: ' . $idsensore . ' <a href="modificaSensoreAdatt.html">Edit</a></br>';
        echo $str;
    
    } else {
	$str = 'L\'adattatore non e\' stato trovato.';
        echo $str;
    }

?>
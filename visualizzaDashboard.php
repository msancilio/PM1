<?php
      
      session_start();
      if(isset($_SESSION['username']) && isset($_SESSION['password'])){
	    
      } else{
	    header('Location:Login.html');
      }
?>



  <meta http-equiv="content-type" content="text/html; charset=utf-8"><title>SENSOR MANAGEMENT SYSTEM</title>




  <link rel="stylesheet" type="text/css" href="css/style.css" media="screen"></head><body>

<div style="margin-top: 28px; height: 105px; text-align: left; margin-left: 359px; width: 725px;">
			<a href="opzionicliente.php"><img style="border: 0px solid ; width: 709px; height: 86px;" class="classname" alt="" src="images/logo.png"></a>
</div>
<div>
<div style="margin-left: 120px;">
</div>
<div style="float: left; display: block; margin-top: 139px; height: 283px; margin-left: 346px; width: 297px; text-align: center;" class="wrapper"> <a href="eccezioni1.php"> <img style="border: 0px solid ; width: 272px; height: 247px;" class="classname" src="images/eccezione2.jpg" alt=""></a> </div>
<div style="float: left; display: block; margin-top: 139px; height: 283px; text-align: center; margin-left: 164px; width: 288px;" class="wrapper"> <a href="chartjs/dashboard.php"> <img style="border: 0px solid ; width: 272px; height: 247px;" class="classname" src="images/dashboard.jpg" alt=""></a> </div>

</div>
</body></html>
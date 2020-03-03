<?php
$to="your@email.com";
/*Your Email*/
$subject="Suscription from the website";
/*Issue*/
$date=date("l, F jS, Y");
$time=date("h:i A");

$email  = $_REQUEST['email'];
$name   = $_REQUEST['name'];
$tel    = $_REQUEST['tel'];


$msg="
	
	Suscription request from website on date  $date, hour: $time.\n
	
	name: $name\n
	Email: $email\n
	tel: $tel\n
	
	";
if($email=="") {
echo "<div class='alert alert-danger'>
		  <a class='close' data-dismiss='alert'>×</a>
		  <strong>Warning!</strong> Please fill all the fields.
	  </div>";
} else {
mail($to,$subject,$msg,"From:".$email);
echo "<div class='alert alert-success'>
		  <a class='close' data-dismiss='alert'>×</a>
		  <strong>Thank you for your message!</strong>
	  </div>";
}
?>
